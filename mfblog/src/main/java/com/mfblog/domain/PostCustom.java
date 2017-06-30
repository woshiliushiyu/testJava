package com.mfblog.domain;

import java.util.Date;

/**
 * Created by liushiyu on 2017/6/30.
 */
public class PostCustom extends PostBean {

    private Boolean isPublish;
    private String postAuthorName;

    public Boolean getPublish() {
        return isPublish;
    }

    public void setPublish(Boolean publish) {
        isPublish = publish;
    }

    public String getPostAuthorName() {
        return postAuthorName;
    }

    public void setPostAuthorName(String postAuthorName) {
        this.postAuthorName = postAuthorName;
    }

    public PostCustom() {

    }

    public PostCustom(String id, String postAuthor, Date postDate, Date postDateGmt, String postContent
            , String postTitle, String postExcerpt, String postStatus, String commentStatus, String pingStatus
            , String postPassword, String postName, String toPing, String pinged, Date postModified
            , Date postModifiedGmt, String postContentFiltered, String postParent, String guid, Integer menuOrder
            , String postType, String postMimeType, Long commentCount) {
        setId(id);
        setPostAuthor(postAuthor);
        setPostDate(postDate);
        setPostDateGmt(postDateGmt);
        setPostContent(postContent);
        setPostContentFiltered(postContentFiltered);
        setPostTitle(postTitle);
        setPostExcerpt(postExcerpt);
        setPostStatus(postStatus);
        setCommentStatus(commentStatus);
        setPingStatus(pingStatus);
        setPostPassword(postPassword);
        setPostName(postName);
        setToPing(toPing);
        setPinged(pinged);
        setPostModified(postModified);
        setPostModifiedGmt(postModifiedGmt);
        setPostParent(postParent);
        setGuid(guid);
        setMenuOrder(menuOrder);
        setPostType(postType);
        setPostMimeType(postMimeType);
        setCommentCount(commentCount);
    }

    public static class Builder{

        private String id;
        private String postAuthor;
        private Date postDate;
        private Date postDateGmt;
        private String postContent;
        private String postTitle;
        private String postExcerpt;
        private String postStatus;
        private String commentStatus;
        private String pingStatus;
        private String postPassword;
        private String postName;
        private String toPing;
        private String pinged;
        private Date postModified;
        private Date postModifiedGmt;
        private String postContentFiltered;
        private String postParent;
        private String guid;
        private Integer menuOrder;
        private String postType;
        private String postMimeType;
        private Long commentCount;


        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPostAuthor() {
            return postAuthor;
        }

        public void setPostAuthor(String postAuthor) {
            this.postAuthor = postAuthor;
        }

        public Date getPostDate() {
            return postDate;
        }

        public void setPostDate(Date postDate) {
            this.postDate = postDate;
        }

        public Date getPostDateGmt() {
            return postDateGmt;
        }

        public void setPostDateGmt(Date postDateGmt) {
            this.postDateGmt = postDateGmt;
        }

        public String getPostContent() {
            return postContent;
        }

        public void setPostContent(String postContent) {
            this.postContent = postContent;
        }

        public String getPostTitle() {
            return postTitle;
        }

        public void setPostTitle(String postTitle) {
            this.postTitle = postTitle;
        }

        public String getPostExcerpt() {
            return postExcerpt;
        }

        public void setPostExcerpt(String postExcerpt) {
            this.postExcerpt = postExcerpt;
        }

        public String getPostStatus() {
            return postStatus;
        }

        public void setPostStatus(String postStatus) {
            this.postStatus = postStatus;
        }

        public String getCommentStatus() {
            return commentStatus;
        }

        public void setCommentStatus(String commentStatus) {
            this.commentStatus = commentStatus;
        }

        public String getPingStatus() {
            return pingStatus;
        }

        public void setPingStatus(String pingStatus) {
            this.pingStatus = pingStatus;
        }

        public String getPostPassword() {
            return postPassword;
        }

        public void setPostPassword(String postPassword) {
            this.postPassword = postPassword;
        }

        public String getPostName() {
            return postName;
        }

        public void setPostName(String postName) {
            this.postName = postName;
        }

        public String getToPing() {
            return toPing;
        }

        public void setToPing(String toPing) {
            this.toPing = toPing;
        }

        public String getPinged() {
            return pinged;
        }

        public void setPinged(String pinged) {
            this.pinged = pinged;
        }

        public Date getPostModified() {
            return postModified;
        }

        public void setPostModified(Date postModified) {
            this.postModified = postModified;
        }

        public Date getPostModifiedGmt() {
            return postModifiedGmt;
        }

        public void setPostModifiedGmt(Date postModifiedGmt) {
            this.postModifiedGmt = postModifiedGmt;
        }

        public String getPostContentFiltered() {
            return postContentFiltered;
        }

        public void setPostContentFiltered(String postContentFiltered) {
            this.postContentFiltered = postContentFiltered;
        }

        public String getPostParent() {
            return postParent;
        }

        public void setPostParent(String postParent) {
            this.postParent = postParent;
        }

        public String getGuid() {
            return guid;
        }

        public void setGuid(String guid) {
            this.guid = guid;
        }

        public Integer getMenuOrder() {
            return menuOrder;
        }

        public void setMenuOrder(Integer menuOrder) {
            this.menuOrder = menuOrder;
        }

        public String getPostType() {
            return postType;
        }

        public void setPostType(String postType) {
            this.postType = postType;
        }

        public String getPostMimeType() {
            return postMimeType;
        }

        public void setPostMimeType(String postMimeType) {
            this.postMimeType = postMimeType;
        }

        public Long getCommentCount() {
            return commentCount;
        }

        public void setCommentCount(Long commentCount) {
            this.commentCount = commentCount;
        }

        public PostCustom build() {
            return new PostCustom(id,
                    postAuthor,
                    postDate,
                    postDateGmt,
                    postContent,
                    postTitle,
                    postExcerpt,
                    postStatus,
                    commentStatus,
                    pingStatus,
                    postPassword,
                    postName,
                    toPing,
                    pinged,
                    postModified,
                    postModifiedGmt,
                    postContentFiltered,
                    postParent,
                    guid,
                    menuOrder,
                    postType,
                    postMimeType,
                    commentCount);
        }
    }

}
