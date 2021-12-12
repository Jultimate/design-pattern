package com.github.design.iterator;


import java.util.Objects;

public class _MyMap<K, V> implements _Map<K, V> {
    static class Data<K,V>
    {
        K key;
        V value;
    }

    Data<K,V>[] data;

    int size = 0;

    @Override
    public void put(K key, V value)
    {
        if(size == 0)
        {
            this.data = new Data[16];
        }

        Data<K,V> data = new Data<>();
        data.key = key;
        data.value = value;
        this.data[size] = data;

        size++;

        if(size > this.data.length * 0.75)
        {
            extend(this.data);
        }
    }

    @Override
    public V get(K key)
    {
        for(Data<K,V> vdata : data)
        {
            if(Objects.equals(vdata.key, key))
            {
                return vdata.value;
            }
        }
        return null;
    }

    @Override
    public _Iterator entry()
    {
        return this;
    }

    //用于迭代的光标
    int cursor = 0;

    //判断当前光标下是否为null
    @Override
    public boolean hasNext()
    {
        if(null != data[cursor])
        {
            return true;
        }
        //遍历结束，重置光标
        cursor = 0;
        return false;
    }

    @Override
    public Object next()
    {
        //返回正在遍历光标的数据，并将光标后移一位
        return data[cursor++];
    }

    @Override
    public int size()
    {
        return this.size;
    }

    private void extend(Data<K,V>[] data)
    {
        int newLength = data.length << 1;
        Data<K,V>[] newData = new Data[newLength];

        int index = data.length;
        while(index > 0)
        {
            newData[--index] = data[index];
        }
        this.data = newData;
    }

    public static void main(String[] args)
    {
        _MyMap<String,String> map = new _MyMap<>();
        int i = 0;
        while(i < 13)
        {
            map.put(i + "" + i,i + " " + i);
            System.out.println(i);
            i++;
        }
        System.out.println(map.data.length);

        _Iterator entry = map.entry();
        while(entry.hasNext())
        {
            Data next = (Data)entry.next();
            System.out.println(next.key + " ====> " + next.value);
        }
    }
}

