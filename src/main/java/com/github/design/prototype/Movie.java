package com.github.design.prototype;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/15 21:38
 * @Email: chongzhao66@gmail.com
 */
public class Movie implements Cloneable
{
    String name;

    String type;

    Content content;

    static class Content implements Cloneable
    {
        String duration;

        String dialogue;

        @Override
        public Content clone()
        {
            Content content = null;
            try
            {
                content = (Content) super.clone();
            }
            catch(CloneNotSupportedException e)
            {
                e.printStackTrace();
            }
            return content;
        }
    }

    @Override
    public Movie clone()
    {
        Movie movie = null;
        try
        {
            movie = (Movie) super.clone();
            movie.content = (Content) content.clone();
        }
        catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return movie;
    }
}