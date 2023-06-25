package com.ruoyi.blog.mapper;

import java.util.List;

import com.ruoyi.blog.domain.Comment;
import org.apache.ibatis.annotations.Mapper;

/**
 * 评论管理Mapper接口
 *
 * @author herberth
 * @date 2023-06-17
 */
@Mapper
public interface CommentMapper {
    /**
     * 查询评论管理
     *
     * @param id 评论管理主键
     * @return 评论管理
     */
    public Comment selectCommentById(Long id);

    /**
     * 查询评论管理列表
     *
     * @param comment 评论管理
     * @return 评论管理集合
     */
    public List<Comment> selectCommentList(Comment comment);

    /**
     * 新增评论管理
     *
     * @param comment 评论管理
     * @return 结果
     */
    public int insertComment(Comment comment);

    /**
     * 修改评论管理
     *
     * @param comment 评论管理
     * @return 结果
     */
    public int updateComment(Comment comment);

    /**
     * 删除评论管理
     *
     * @param id 评论管理主键
     * @return 结果
     */
    public int deleteCommentById(Long id);

    /**
     * 批量删除评论管理
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCommentByIds(Long[] ids);
}
