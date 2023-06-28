package com.ruoyi.blog.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 博客管理对象 rm_blog_info
 *
 * @author herberth
 * @date 2023-06-17
 */
public class BlogInfo extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private String id;

    /** 是否已删除 */
    @Excel(name = "是否已删除")
    private Integer isDeleted;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 博客类型 */
    @Excel(name = "博客类型")
    private Long blogType;

    /** 是否置顶 */
    @Excel(name = "是否置顶")
    private Integer isTop;

    /** 作者id */
    @Excel(name = "作者id")
    private Long authorId;

    /** 原始链接 */
    @Excel(name = "原始链接")
    private String originalLink;

    /** 是否原创 */
    @Excel(name = "是否原创")
    private Integer isOriginal;

    /** 是否私密 */
    @Excel(name = "是否私密")
    private Integer isPrivate;

    /** 版本号 */
    @Excel(name = "版本号")
    private String version;

    @Excel(name = "作者")
    private String author;

    /** 博客内容信息 */
    private Blog blog;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setBlogType(Long blogType) {
        this.blogType = blogType;
    }

    public Long getBlogType() {
        return blogType;
    }

    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    public Integer getIsTop() {
        return isTop;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setOriginalLink(String originalLink) {
        this.originalLink = originalLink;
    }

    public String getOriginalLink() {
        return originalLink;
    }

    public void setIsOriginal(Integer isOriginal) {
        this.isOriginal = isOriginal;
    }

    public Integer getIsOriginal() {
        return isOriginal;
    }

    public void setIsPrivate(Integer isPrivate) {
        this.isPrivate = isPrivate;
    }

    public Integer getIsPrivate() {
        return isPrivate;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("isDeleted", getIsDeleted())
                .append("title", getTitle())
                .append("blogType", getBlogType())
                .append("isTop", getIsTop())
                .append("authorId", getAuthorId())
                .append("originalLink", getOriginalLink())
                .append("isOriginal", getIsOriginal())
                .append("isPrivate", getIsPrivate())
                .append("version", getVersion())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("blog", getBlog())
                .toString();
    }
}
