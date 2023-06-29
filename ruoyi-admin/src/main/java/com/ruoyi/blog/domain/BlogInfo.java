package com.ruoyi.blog.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.ToString;

/**
 * 博客管理对象 rm_blog_info
 *
 * @author herberth
 * @date 2023-06-17
 */
@Data
@ToString
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
    private String isTop;

    /** 作者id */
    @Excel(name = "作者id")
    private Long authorId;

    /** 原始链接 */
    @Excel(name = "原始链接")
    private String originalLink;

    /** 是否原创 */
    @Excel(name = "是否原创")
    private String isOriginal;

    /** 是否私密 */
    @Excel(name = "是否私密")
    private String isPrivate;

    /** 版本号 */
    @Excel(name = "版本号")
    private String version;

    @Excel(name = "作者")
    private String author;

    /** 博客内容信息 */
    private Blog blog;

}
