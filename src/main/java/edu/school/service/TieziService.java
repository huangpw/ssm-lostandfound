package edu.school.service;

import com.github.pagehelper.PageInfo;
import edu.school.entity.Tiezi;

/**
 * @author huangpw
 * @date 2024/8/13 14:16
 * 博客： https://blog.csdn.net/qq_18167779?type=blog
 * @description:
 */
public interface TieziService {
    boolean save(Tiezi record);
    boolean update(Tiezi record);
    PageInfo<Tiezi> getPageList(Integer pageNum, Integer pageSize, Tiezi record);
    Tiezi findById(Integer id);
    boolean deleteTiezi(Integer id);
    int deleteMany(String ids[]);
}
