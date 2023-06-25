package com.ruoyi.blog.mapper;

import java.util.List;

import com.ruoyi.blog.domain.UserLike;

/**
 * 用户点赞Mapper接口
 *
 * @author herberth
 * @date 2023-06-17
 */
public interface UserLikeMapper {
    /**
     * 查询用户点赞
     *
     * @param targetId 用户点赞主键
     * @return 用户点赞
     */
    public UserLike selectUserLikeByTargetId(Long targetId);

    /**
     * 查询用户点赞列表
     *
     * @param userLike 用户点赞
     * @return 用户点赞集合
     */
    public List<UserLike> selectUserLikeList(UserLike userLike);

    /**
     * 新增用户点赞
     *
     * @param userLike 用户点赞
     * @return 结果
     */
    public int insertUserLike(UserLike userLike);

    /**
     * 修改用户点赞
     *
     * @param userLike 用户点赞
     * @return 结果
     */
    public int updateUserLike(UserLike userLike);

    /**
     * 删除用户点赞
     *
     * @param targetId 用户点赞主键
     * @return 结果
     */
    public int deleteUserLikeByTargetId(Long targetId);

    /**
     * 批量删除用户点赞
     *
     * @param targetIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUserLikeByTargetIds(Long[] targetIds);
}
