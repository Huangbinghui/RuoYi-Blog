package com.ruoyi.blog.service;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.blog.domain.Blog;
import com.ruoyi.blog.mapper.BlogInfoMapper;
import com.ruoyi.blog.domain.BlogInfo;

/**
 * 博客管理Service业务层处理
 *
 * @author herberth
 * @date 2023-06-17
 */
@Service
public class BlogInfoServiceImpl implements IBlogInfoService
{
    @Autowired
    private BlogInfoMapper blogInfoMapper;

    /**
     * 查询博客管理
     *
     * @param id 博客管理主键
     * @return 博客管理
     */
    @Override
    public BlogInfo selectBlogInfoById(Long id)
    {
        return blogInfoMapper.selectBlogInfoById(id);
    }

    /**
     * 查询博客管理列表
     *
     * @param blogInfo 博客管理
     * @return 博客管理
     */
    @Override
    public List<BlogInfo> selectBlogInfoList(BlogInfo blogInfo)
    {
        return blogInfoMapper.selectBlogInfoList(blogInfo);
    }

    /**
     * 新增博客管理
     *
     * @param blogInfo 博客管理
     * @return 结果
     */
    @Transactional
    @Override
    public int insertBlogInfo(BlogInfo blogInfo)
    {
        blogInfo.setCreateTime(DateUtils.getNowDate());
        int rows = blogInfoMapper.insertBlogInfo(blogInfo);
        insertBlog(blogInfo);
        return rows;
    }

    /**
     * 修改博客管理
     *
     * @param blogInfo 博客管理
     * @return 结果
     */
    @Transactional
    @Override
    public int updateBlogInfo(BlogInfo blogInfo)
    {
        blogInfo.setUpdateTime(DateUtils.getNowDate());
        blogInfoMapper.deleteBlogByInfoId(blogInfo.getId());
        insertBlog(blogInfo);
        return blogInfoMapper.updateBlogInfo(blogInfo);
    }

    /**
     * 批量删除博客管理
     *
     * @param ids 需要删除的博客管理主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteBlogInfoByIds(Long[] ids)
    {
        blogInfoMapper.deleteBlogByInfoIds(ids);
        return blogInfoMapper.deleteBlogInfoByIds(ids);
    }

    /**
     * 删除博客管理信息
     *
     * @param id 博客管理主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteBlogInfoById(Long id)
    {
        blogInfoMapper.deleteBlogByInfoId(id);
        return blogInfoMapper.deleteBlogInfoById(id);
    }

    /**
     * 新增博客内容信息
     *
     * @param blogInfo 博客管理对象
     */
    public void insertBlog(BlogInfo blogInfo)
    {
        List<Blog> blogList = blogInfo.getBlogList();
        Long id = blogInfo.getId();
        if (StringUtils.isNotNull(blogList))
        {
            List<Blog> list = new ArrayList<Blog>();
            for (Blog blog : blogList)
            {
                blog.setInfoId(id);
                list.add(blog);
            }
            if (list.size() > 0)
            {
                blogInfoMapper.batchBlog(list);
            }
        }
    }
}
