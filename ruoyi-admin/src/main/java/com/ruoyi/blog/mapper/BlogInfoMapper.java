package com.ruoyi.blog.mapper;

import java.util.List;
import com.ruoyi.blog.domain.BlogInfo;
import com.ruoyi.blog.domain.Blog;
import org.apache.ibatis.annotations.Mapper;

/**
 * 博客管理Mapper接口
 *
 * @author herberth
 * @date 2023-06-17
 */
@Mapper
public interface BlogInfoMapper
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
     * 批量新增博客内容
     *
     * @param blog 博客内容
     * @return 结果
     */
    public int insertBlog(Blog blog);


    /**
     * 通过博客管理主键删除博客内容信息
     *
     * @param id 博客管理ID
     * @return 结果
     */
    public int deleteBlogByInfoId(Long id);
}
