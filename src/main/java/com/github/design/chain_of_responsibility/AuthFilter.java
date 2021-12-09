package com.github.design.chain_of_responsibility;

public class AuthFilter implements Filter {
    @Override
    public boolean doFilter(User user) {
        return "ADMIN".equals(user.role);
    }
}
