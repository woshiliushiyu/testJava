package com.mfblog.dao;

import com.mfblog.domain.PostBean;
import com.mfblog.domain.PostCustom;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("postDao")
public interface PostDao extends Dao<PostBean> {

    @Override
    int add(PostBean postBean);

    @Override
    int del(PostBean postBean);

    @Override
    int update(PostBean postBean);

    @Override
    PostBean findOneById(Serializable Id);

    @Override
    List<PostBean> findAll();

    List<PostCustom> findAll(@Param("offset") int offset, @Param("limit") int limit);


    List<PostCustom> findAllNew();

    /**
     * 分页查询
     *
     * @param offset 起始位置
     * @param limit  每页数量
     * @return
     */
    List<PostCustom> findAllPublish(@Param("offset") int offset, @Param("limit") int limit);

    Integer getPublishPostCount();

    Integer getAllPostCount();

    List<PostCustom> getPublishPostDateCount();

    /**
     * 获取回收站长度
     * @return
     */
    int getAllTrashCount();

    List<PostCustom> findAllTrash(@Param("offset") int offset, @Param("limit") int limit);

    PostCustom findLastPostById(Integer postId);
}
