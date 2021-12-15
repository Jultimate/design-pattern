package com.github.design.prototype;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/15 21:41
 * @Email: chongzhao66@gmail.com
 */
public class Test {
    public static void main(String[] args)
    {
        Movie movie = new Movie();
        Movie.Content content = new Movie.Content();
        content.duration = "jjl";
        content.dialogue = "lld";
        movie.content = content;
        System.out.println(movie.content);

        Movie clone = movie.clone();
        System.out.println(clone.content);
    }
}
