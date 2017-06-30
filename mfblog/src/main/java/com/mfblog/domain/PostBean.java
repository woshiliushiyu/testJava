package com.mfblog.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liushiyu on 2017/6/30.
 */
public class PostBean implements Serializable {

    /**
     * 版本号
     */
    private static final long serialVersionUID = 4477235816922585138L;

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

    public PostBean() {

    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostBean postBean = (PostBean) o;

        if (id != null ? !id.equals(postBean.id) : postBean.id != null) return false;
        if (postAuthor != null ? !postAuthor.equals(postBean.postAuthor) : postBean.postAuthor != null) return false;
        if (postDate != null ? !postDate.equals(postBean.postDate) : postBean.postDate != null) return false;
        if (postDateGmt != null ? !postDateGmt.equals(postBean.postDateGmt) : postBean.postDateGmt != null)
            return false;
        if (postContent != null ? !postContent.equals(postBean.postContent) : postBean.postContent != null)
            return false;
        if (postTitle != null ? !postTitle.equals(postBean.postTitle) : postBean.postTitle != null) return false;
        if (postExcerpt != null ? !postExcerpt.equals(postBean.postExcerpt) : postBean.postExcerpt != null)
            return false;
        if (postStatus != null ? !postStatus.equals(postBean.postStatus) : postBean.postStatus != null) return false;
        if (commentStatus != null ? !commentStatus.equals(postBean.commentStatus) : postBean.commentStatus != null)
            return false;
        if (pingStatus != null ? !pingStatus.equals(postBean.pingStatus) : postBean.pingStatus != null) return false;
        if (postPassword != null ? !postPassword.equals(postBean.postPassword) : postBean.postPassword != null)
            return false;
        if (postName != null ? !postName.equals(postBean.postName) : postBean.postName != null) return false;
        if (toPing != null ? !toPing.equals(postBean.toPing) : postBean.toPing != null) return false;
        if (pinged != null ? !pinged.equals(postBean.pinged) : postBean.pinged != null) return false;
        if (postModified != null ? !postModified.equals(postBean.postModified) : postBean.postModified != null)
            return false;
        if (postModifiedGmt != null ? !postModifiedGmt.equals(postBean.postModifiedGmt) : postBean.postModifiedGmt != null)
            return false;
        if (postContentFiltered != null ? !postContentFiltered.equals(postBean.postContentFiltered) : postBean.postContentFiltered != null)
            return false;
        if (postParent != null ? !postParent.equals(postBean.postParent) : postBean.postParent != null) return false;
        if (guid != null ? !guid.equals(postBean.guid) : postBean.guid != null) return false;
        if (menuOrder != null ? !menuOrder.equals(postBean.menuOrder) : postBean.menuOrder != null) return false;
        if (postType != null ? !postType.equals(postBean.postType) : postBean.postType != null) return false;
        if (postMimeType != null ? !postMimeType.equals(postBean.postMimeType) : postBean.postMimeType != null)
            return false;
        return commentCount != null ? commentCount.equals(postBean.commentCount) : postBean.commentCount == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (postAuthor != null ? postAuthor.hashCode() : 0);
        result = 31 * result + (postDate != null ? postDate.hashCode() : 0);
        result = 31 * result + (postDateGmt != null ? postDateGmt.hashCode() : 0);
        result = 31 * result + (postContent != null ? postContent.hashCode() : 0);
        result = 31 * result + (postTitle != null ? postTitle.hashCode() : 0);
        result = 31 * result + (postExcerpt != null ? postExcerpt.hashCode() : 0);
        result = 31 * result + (postStatus != null ? postStatus.hashCode() : 0);
        result = 31 * result + (commentStatus != null ? commentStatus.hashCode() : 0);
        result = 31 * result + (pingStatus != null ? pingStatus.hashCode() : 0);
        result = 31 * result + (postPassword != null ? postPassword.hashCode() : 0);
        result = 31 * result + (postName != null ? postName.hashCode() : 0);
        result = 31 * result + (toPing != null ? toPing.hashCode() : 0);
        result = 31 * result + (pinged != null ? pinged.hashCode() : 0);
        result = 31 * result + (postModified != null ? postModified.hashCode() : 0);
        result = 31 * result + (postModifiedGmt != null ? postModifiedGmt.hashCode() : 0);
        result = 31 * result + (postContentFiltered != null ? postContentFiltered.hashCode() : 0);
        result = 31 * result + (postParent != null ? postParent.hashCode() : 0);
        result = 31 * result + (guid != null ? guid.hashCode() : 0);
        result = 31 * result + (menuOrder != null ? menuOrder.hashCode() : 0);
        result = 31 * result + (postType != null ? postType.hashCode() : 0);
        result = 31 * result + (postMimeType != null ? postMimeType.hashCode() : 0);
        result = 31 * result + (commentCount != null ? commentCount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PostBean{" +
                "id='" + id + '\'' +
                ", postAuthor='" + postAuthor + '\'' +
                ", postDate=" + postDate +
                ", postDateGmt=" + postDateGmt +
                ", postContent='" + postContent + '\'' +
                ", postTitle='" + postTitle + '\'' +
                ", postExcerpt='" + postExcerpt + '\'' +
                ", postStatus='" + postStatus + '\'' +
                ", commentStatus='" + commentStatus + '\'' +
                ", pingStatus='" + pingStatus + '\'' +
                ", postPassword='" + postPassword + '\'' +
                ", postName='" + postName + '\'' +
                ", toPing='" + toPing + '\'' +
                ", pinged='" + pinged + '\'' +
                ", postModified=" + postModified +
                ", postModifiedGmt=" + postModifiedGmt +
                ", postContentFiltered='" + postContentFiltered + '\'' +
                ", postParent='" + postParent + '\'' +
                ", guid='" + guid + '\'' +
                ", menuOrder=" + menuOrder +
                ", postType='" + postType + '\'' +
                ", postMimeType='" + postMimeType + '\'' +
                ", commentCount=" + commentCount +
                '}';
    }
}
