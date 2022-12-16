package com.example.mediium.model;

import java.time.LocalDate;
import java.util.List;

public class Writing {
    private String title;
    private String content;
    private List<String> tag;//Yazının tagleri
    private User user;//Yazıyı yazan kullanıcı
    private int likes;//Aldığı like sayısı
    private LocalDate date;//Yazının yazılma tarihi

    public Writing(String title, String content, List<String> tag, User user, LocalDate date) {
        this.title = title;
        this.content = content;
        this.tag = tag;
        this.user = user;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getTag() {
        return tag;
    }

    public void setTag(List<String> tag) {
        this.tag = tag;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "Writing{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", tag=" + tag +
                ", user=" + user +
                ", likes=" + likes +
                '}';
    }
}


