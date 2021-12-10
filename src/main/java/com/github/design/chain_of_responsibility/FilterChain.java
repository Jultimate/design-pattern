package com.github.design.chain_of_responsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/09 23:19
 * @Email: chongzhao66@gmail.com
 */
public class FilterChain{

    private final List<Filter> filters = new ArrayList<>();

    // length of filters
    private Integer l = 0;

    //index
    private Integer i = 0;

    public void add(Filter filter) {
        filters.add(filter);
        l++;
    }

    public void flus() {
        filters.removeAll(filters);
        l = 0;
    }



    public boolean doFilter(User user) {
        for (Filter filter : filters) {
            if (!filter.doFilter(user)) {
                System.out.println(filter.getClass().getSimpleName() + " does not permit.");
                return false;
            }
        }
        return true;
    }

    public void doFilter(Request req, Response res) {
        if (i < l) {
            Filter filter = filters.get(i++);
            filter.doFilter(req, res, this);
        } else if (i.equals(l)) {
            System.out.println("doService.....");
        }

        if(i > 0){
            i--;
        }
    }
}
