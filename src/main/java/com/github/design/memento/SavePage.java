package com.github.design.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: CHONG
 * @CreateTime: 2021/12/17 18:11
 * @Email: chongzhao66@gmail.com
 */
public class SavePage
{
    List<Archive> archives = new ArrayList<>();

    // 保存存档
    public void save(Archive archive)
    {
        this.archives.add(archive);
    }

    // 加载指定位置存档
    public Archive load(int num)
    {
        return this.archives.get(num);
    }
}
