package com.ruoyi.blog.service;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.blog.mapper.TagMapper;
import com.ruoyi.blog.domain.Tag;

/**
 * 标签管理Service业务层处理
 *
 * @author herberth
 * @date 2023-06-17
 */
@Service
public class TagServiceImpl implements ITagService
{
    @Autowired
    private TagMapper tagMapper;

    /**
     * 查询标签管理
     *
     * @param id 标签管理主键
     * @return 标签管理
     */
    @Override
    public Tag selectTagById(Long id)
    {
        return tagMapper.selectTagById(id);
    }

    /**
     * 查询标签管理列表
     *
     * @param tag 标签管理
     * @return 标签管理
     */
    @Override
    public List<Tag> selectTagList(Tag tag)
    {
        return tagMapper.selectTagList(tag);
    }

    /**
     * 新增标签管理
     *
     * @param tag 标签管理
     * @return 结果
     */
    @Override
    public int insertTag(Tag tag)
    {
        tag.setCreateTime(DateUtils.getNowDate());
        return tagMapper.insertTag(tag);
    }

    /**
     * 修改标签管理
     *
     * @param tag 标签管理
     * @return 结果
     */
    @Override
    public int updateTag(Tag tag)
    {
        tag.setUpdateTime(DateUtils.getNowDate());
        return tagMapper.updateTag(tag);
    }

    /**
     * 批量删除标签管理
     *
     * @param ids 需要删除的标签管理主键
     * @return 结果
     */
    @Override
    public int deleteTagByIds(Long[] ids)
    {
        return tagMapper.deleteTagByIds(ids);
    }

    /**
     * 删除标签管理信息
     *
     * @param id 标签管理主键
     * @return 结果
     */
    @Override
    public int deleteTagById(Long id)
    {
        return tagMapper.deleteTagById(id);
    }
}
