package com.ruoyi.blog.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 博客内容对象 rm_blog
 *
 * @author herberth
 * @date 2023-06-17
 */
public class Blog extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 博客内容Id */
    private Long infoId;

    /** 博客内容 */
    @Excel(name = "博客内容")
    private String content;

    public void setInfoId(Long infoId) {
        this.infoId = infoId;
    }

    public Long getInfoId() {
        return infoId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("infoId", getInfoId())
                .append("content", getContent())
                .toString();
    }
}
