package com.github.design.chain_of_responsibility;

public class PwdFilter implements Filter {
    @Override
    public boolean doFilter(User user) {
        return "PWD_FROM_SQL".equals(user.pwd);
    }

    @Override
    public boolean doFilter(Request req, Response res,FilterChain chain) {
        return false;
    }
}
