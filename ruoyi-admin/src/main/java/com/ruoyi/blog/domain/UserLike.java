package com.ruoyi.blog.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户点赞对象 rr_user_like
 *
 * @author herberth
 * @date 2023-06-17
 */
public class UserLike extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /** 目标ID */
    private Long targetId;

    /** 用户ID */
    private Long userId;

    /** 是否点赞 */
    private Integer isLike;

    /** 点赞类型 */
    private String likeType;

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    public Long getTargetId() {
        return targetId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setIsLike(Integer isLike) {
        this.isLike = isLike;
    }

    public Integer getIsLike() {
        return isLike;
    }

    public void setLikeType(String likeType) {
        this.likeType = likeType;
    }

    public String getLikeType() {
        return likeType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("targetId", getTargetId())
                .append("userId", getUserId())
                .append("isLike", getIsLike())
                .append("likeType", getLikeType())
                .toString();
    }
}
