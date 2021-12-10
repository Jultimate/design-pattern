package com.github.design.chain_of_responsibility;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/09 23:21
 * @Email: chongzhao66@gmail.com
 */
public class FilterChainTest {
    public static void main(String[] args) {
        User user = new User("12", "PWD_FROM_SQLl", "ADMINd", 18);
        FilterChain filterChain = new FilterChain();
        filterChain.add(new PwdFilter());
        filterChain.add(new AuthFilter());
        filterChain.add(new AgeFilter());

        filterChain.doFilter(user);

        Request req = new Request();
        Response res = new Response();
        filterChain.flus();
        filterChain.add(new HeaderFilter());
        filterChain.add(new UrlFilter());
        filterChain.add(new LocaleFilter());
        filterChain.doFilter(req, res);
        System.out.println();
        filterChain.doFilter(req, res);

    }
}
