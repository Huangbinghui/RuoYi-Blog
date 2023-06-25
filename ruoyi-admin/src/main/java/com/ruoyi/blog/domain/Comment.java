package com.ruoyi.blog.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.TreeEntity;

/**
 * 评论管理对象 rm_comment
 *
 * @author herberth
 * @date 2023-06-17
 */
public class Comment extends TreeEntity {
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 评论内容 */
    @Excel(name = "评论内容")
    private String content;

    /** 博客Id */
    @Excel(name = "博客Id")
    private Long blogId;

    /** 评论类型id */
    @Excel(name = "评论类型id")
    private String commentType;

    /** 是否置顶 */
    @Excel(name = "是否置顶")
    private Integer isTop;

    /** 是否已删除 */
    @Excel(name = "是否已删除")
    private Integer isDeleted;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    public Long getBlogId() {
        return blogId;
    }

    public void setCommentType(String commentType) {
        this.commentType = commentType;
    }

    public String getCommentType() {
        return commentType;
    }

    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    public Integer getIsTop() {
        return isTop;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("parentId", getParentId())
                .append("content", getContent())
                .append("blogId", getBlogId())
                .append("commentType", getCommentType())
                .append("isTop", getIsTop())
                .append("isDeleted", getIsDeleted())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
