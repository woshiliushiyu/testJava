package com.mfblog.service.post;

import com.mfblog.domain.PostCustom;
import com.mfblog.service.BaseService;
import org.apache.ibatis.javassist.NotFoundException;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liushiyu on 2017/6/30.
 */
public interface PostService extends BaseService<PostCustom> {


    @Override
    void add(PostCustom postCustom) throws Exception;

    @Override
    List<PostCustom> findAll(int pageNum, int pageSize);

    @Override
    PostCustom findOneById(Serializable id) throws NotFoundException;


    /**
     * 分页获取
     *
     * @return
     */
    List<PostCustom> findAllPublish(int pageNum, int pageSize);

    /**
     * 获取总条数
     *
     * @return 获取总条数
     */
    int getPublishPostCount();

    int getAllPostCount();

    /**
     * 获取热点文章
     *
     * @return
     */
    List<PostCustom> findAllNew();

    /**
     * 根据文章ID查找文章
     *
     * @param postId 文章ID
     * @return 文章ID对应的实体
     */
    PostCustom findPostById(Serializable postId);

    void update(PostCustom postBean) throws Exception;

    /**
     * 根据文章ID删除文章
     * @param postBean
     */
    void delOnePost(Serializable postBean);

    /**
     * 获取回收站数据长度
     * @return
     */
    int getAllTrashCount();

    List<PostCustom> findAllTrash(Integer pageNum, Integer pageSize);

    PostCustom findLastPostById(Integer postId);
}
