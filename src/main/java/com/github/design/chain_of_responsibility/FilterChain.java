package com.github.design.chain_of_responsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/09 23:19
 * @Email: chongzhao66@gmail.com
 */
public class FilterChain implements Filter {

    private final List<Filter> filters = new ArrayList<>();

    public void add(Filter filter) {
        filters.add(filter);
    }


    @Override
    public boolean doFilter(User user) {
        for (Filter filter : filters) {
            if(!filter.doFilter(user))
            {
                System.out.println(filter.getClass().getSimpleName() + " does not permit.");
                return false;
            }
        }
        return true;
    }
}
