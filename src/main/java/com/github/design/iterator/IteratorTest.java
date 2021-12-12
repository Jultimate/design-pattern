package com.github.design.iterator;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/12 17:06
 * @Email: chongzhao66@gmail.com
 */
public class IteratorTest {
    public static void main(String[] args)
    {
        _Map<String,Object> map = new _MyMap<>();
        map.put("11","22");
        System.out.println(map.size());
        Object o = map.get("11");
        System.out.println(o);
        _Iterator iterator = map.entry();
        while(iterator.hasNext()){
            _MyMap.Data next = (_MyMap.Data)iterator.next();
            System.out.println(next.value);
        }

        _Collection<String> list = new _MyLinkedList<>();
        for (int i = 0; i < 12; i++) {
            list.add(i + " - " + i);
        }

        _Iterator listIter = list.iterator();
        while(listIter.hasNext())
        {
            System.out.println(listIter.next());
        }

        while(listIter.hasNext())
        {
            System.out.println(listIter.next());
        }

    }
}
