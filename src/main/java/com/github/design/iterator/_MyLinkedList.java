package com.github.design.iterator;


public class _MyLinkedList<T> implements _Collection<T>
{
    private class Node<T>
    {
        T data;

        Node<T> next;

        public Node(T obj)
        {
            this.data = obj;
        }
    }

    Node<T> first;

    Node<T> last;

    int size = 0;

    @Override
    public void add(T obj)
    {
        Node<T> node = new Node(obj);

        if(null == first)
        {
            first = node;
            last = node;
            cursor = node;
        }

        last.next = node;
        last = node;

        this.size++;
    }

    @Override
    public int size()
    {
        return this.size;
    }

    @Override
    public _Iterator iterator()
    {
        return this;
    }

    Node<T> cursor;

    @Override
    public boolean hasNext()
    {
        if(null != cursor)
        {
            return true;
        }

        //游标归位
        cursor = first;
        return false;
    }

    @Override
    public T next()
    {
        T result = cursor.data;
        //游标移向下一个节点
        cursor = cursor.next;

        return result;
    }
}