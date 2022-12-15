package com.example.mediium.model;

import java.time.LocalDate;
import java.util.List;

public class User {
    private int userId;
    private String mail;
    private String password;
    private String name;
    private LocalDate createdDate;
    private String aboutMe;//Hakkımda
    private List<User> followers;//Kullanıcıyı takip eden userlar
    private List<User> followingUsers;//Takip ettiği userlar
    private List<String> followingTag;//Takip ettiği tagler
    private List<Writing>readingLists;//Kullanıcının okuma listeleri
    private List<Writing>myWritings;// Kullanıcının yazdığı yazılar

    public User(int userId, String mail, String password, String name) {
        this.userId = userId;
        this.mail = mail;
        this.password = password;
        this.name = name;
        this.createdDate=LocalDate.now();
    }

    public int getUserId() {
        return userId;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<User> getFollowingUsers() {
        return followingUsers;
    }

    public void setFollowingUsers(List<User> followingUsers) {
        this.followingUsers = followingUsers;
    }

    public List<String> getFollowingTag() {
        return followingTag;
    }

    public void setFollowingTag(List<String> followingTag) {
        this.followingTag = followingTag;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getCreatedDate() {return createdDate;}

    public void setCreatedDate(LocalDate createdDate) {this.createdDate = createdDate;}

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public List<User> getFollowing() {
        return followingUsers;
    }

    public void setFollowing(List<User> followingUsers) {
        this.followingUsers = followingUsers;
    }

    public List<Writing> getReadingLists() {
        return readingLists;
    }

    public void setReadingLists(List<Writing> readingLists) {
        this.readingLists = readingLists;
    }

    public List<Writing> getMyWritings() {
        return myWritings;
    }

    public void setMyWritings(List<Writing> myWritings) {
        this.myWritings = myWritings;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
