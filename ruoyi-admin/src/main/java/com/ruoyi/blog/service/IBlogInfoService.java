package com.ruoyi.blog.service;

import java.util.List;
import com.ruoyi.blog.domain.BlogInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 博客管理Service接口
 *
 * @author herberth
 * @date 2023-06-17
 */
public interface IBlogInfoService
{
    /**
     * 查询博客管理
     *
     * @param id 博客管理主键
     * @return 博客管理
     */
    public BlogInfo selectBlogInfoById(Long id);

    /**
     * 查询博客管理列表
     *
     * @param blogInfo 博客管理
     * @return 博客管理集合
     */
    public List<BlogInfo> selectBlogInfoList(BlogInfo blogInfo);

    /**
     * 新增博客管理
     *
     * @param blogInfo 博客管理
     * @return 结果
     */
    public int insertBlogInfo(BlogInfo blogInfo);

    /**
     * 修改博客管理
     *
     * @param blogInfo 博客管理
     * @return 结果
     */
    public int updateBlogInfo(BlogInfo blogInfo);

    /**
     * 批量删除博客管理
     *
     * @param ids 需要删除的博客管理主键集合
     * @return 结果
     */
    public int deleteBlogInfoByIds(Long[] ids);

    /**
     * 删除博客管理信息
     *
     * @param id 博客管理主键
     * @return 结果
     */
    public int deleteBlogInfoById(Long id);
}
