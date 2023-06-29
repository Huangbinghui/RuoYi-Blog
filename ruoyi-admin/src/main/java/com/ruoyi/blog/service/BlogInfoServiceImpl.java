package com.ruoyi.blog.service;

import com.ruoyi.blog.domain.Blog;
import com.ruoyi.blog.domain.BlogInfo;
import com.ruoyi.blog.mapper.BlogInfoMapper;
import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.uuid.SnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 博客管理Service业务层处理
 *
 * @author herberth
 * @date 2023-06-17
 */
@Service
public class BlogInfoServiceImpl implements IBlogInfoService {


    @Autowired
    private BlogInfoMapper blogInfoMapper;

    @Autowired
    private SnowFlake snowFlake;

    /**
     * 查询博客管理
     *
     * @param id 博客管理主键
     * @return 博客管理
     */
    @Override
    public BlogInfo selectBlogInfoById(String id) {
        return blogInfoMapper.selectBlogInfoById(id);
    }

    /**
     * 查询博客管理列表
     *
     * @param blogInfo 博客管理
     * @return 博客管理
     */
    @Override
    public List<BlogInfo> selectBlogInfoList(BlogInfo blogInfo) {
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
    public int insertBlogInfo(BlogInfo blogInfo) {
        blogInfo.setId(snowFlake.nextId());
        blogInfo.setCreateBy(SecurityUtils.getUsername());
        blogInfo.setCreateTime(DateUtils.getNowDate());
        blogInfo.setAuthorId(SecurityUtils.getUserId());
        blogInfo.setIsDeleted(0);
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
    public int updateBlogInfo(BlogInfo blogInfo) {
        blogInfo.setUpdateTime(DateUtils.getNowDate());
        blogInfo.setUpdateBy(SecurityUtils.getUsername());
        blogInfoMapper.deleteBlogByInfoId(blogInfo.getId());
        insertBlog(blogInfo);
        return blogInfoMapper.updateBlogInfo(blogInfo);
    }


    /**
     * 删除博客管理信息
     *
     * @param id 博客管理主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteBlogInfoById(String id) {
        return blogInfoMapper.deleteBlogByInfoId(id);
    }

    /**
     * 新增博客内容信息
     *
     * @param blogInfo 博客管理对象
     */
    public void insertBlog(BlogInfo blogInfo) {
        Blog blog = blogInfo.getBlog();
        String id = blogInfo.getId();
        if (StringUtils.isNotNull(blog)) {
            blog.setInfoId(id);
            blogInfoMapper.insertBlog(blog);
        } else {
            throw new ServiceException("博客内容为空！", 999999);
        }
    }
}
