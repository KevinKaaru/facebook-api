package com.example.facebookapi.Entity;

import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity
@Table
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int postID;
    @Column
    private String userID;
    @Column
    private String userName;
    @Column
    private String imageURL;
    @Column
    private String description;
    @Column
    private String postImgURL;
    public Post() {
    }

    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPostImgURL() {
        return postImgURL;
    }

    public void setPostImgURL(String postImgURL) {
        this.postImgURL = postImgURL;
    }

    public Post(int postID, String userID, String userName, String imageURL, String description, String postImgURL) {
        this.postID = postID;
        this.userID = userID;
        this.userName = userName;
        this.imageURL = imageURL;
        this.description = description;
        this.postImgURL = postImgURL;
    }
}



