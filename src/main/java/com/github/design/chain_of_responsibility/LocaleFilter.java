package com.github.design.chain_of_responsibility;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/10 13:58
 * @Email: chongzhao66@gmail.com
 */
public class LocaleFilter implements Filter
{
    @Override
    public boolean doFilter(Request req,Response res,FilterChain chain)
    {
        System.out.println("check request encoding and locale setting.");
        chain.doFilter(req, res);
        System.out.println("check response encoding and locale setting.");
        return true;
    }
}

