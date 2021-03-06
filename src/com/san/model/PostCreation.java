package com.san.model;

import java.util.Date;
/*
* @Author: zijieya
* @Description: 帖子创建
* */
public class PostCreation {
    private int postCreationId;//帖子创建编号
    private String postTitle;//帖子标题
    private int postCreatorId;//帖子创建者编号
    private String discussionName;//区域名称
    private String creationResourcePath;//创建资源路径
    private String postContent;//内容
    private String postPriority;//优先级
    private Date postTime;//时间

    public int getPostCreationId() {
        return postCreationId;
    }

    public void setPostCreationId(int postCreationId) {
        this.postCreationId = postCreationId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getDiscussionName() {
        return discussionName;
    }

    public void setDiscussionName(String discussionName) {
        this.discussionName = discussionName;
    }

    public String getCreationResourcePath() {
        return creationResourcePath;
    }

    public void setCreationResourcePath(String creationResourcePath) {
        this.creationResourcePath = creationResourcePath;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getPostPriority() {
        return postPriority;
    }

    public void setPostPriority(String postPriority) {
        this.postPriority = postPriority;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public int getPostCreatorId() {
        return postCreatorId;
    }

    public void setPostCreatorId(int postCreatorId) {
        this.postCreatorId = postCreatorId;
    }
}
