package com.example.facebookapi.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;
    private String userName;
    private String userImage;
    private boolean active;
    @OneToMany(targetEntity = Post.class,cascade = CascadeType.ALL)
    @JoinColumn(name="up_fk",referencedColumnName = "userID")


    private List<Post> posts;


    public User(int userID, String userName, String userImage, boolean active) {
        this.userID = userID;
        this.userName = userName;
        this.userImage = userImage;
        this.active = active;
    }

    public User() {
    }

    public int getUserID() {

        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
