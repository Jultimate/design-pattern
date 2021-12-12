package com.github.design.iterator;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/12 16:52
 * @Email: chongzhao66@gmail.com
 */
public interface _Map<K,V> extends _Iterator{

    void put(K key, V value);

    int size();

    V get(K key);

    _Iterator entry();
}
