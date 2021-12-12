package com.github.design.iterator;

import java.util.Iterator;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/12 16:52
 * @Email: chongzhao66@gmail.com
 */
public interface _Collection<T> extends _Iterator {

    void add(T obj);

    int size();

    _Iterator iterator();
}
