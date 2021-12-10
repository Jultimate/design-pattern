package com.github.design.chain_of_responsibility;

public interface Filter {
    default boolean doFilter(User user){
        return true;
    }


    boolean doFilter(Request req, Response res ,FilterChain chain);
}
