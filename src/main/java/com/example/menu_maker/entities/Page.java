package com.example.menu_maker.entities;

import javax.persistence.*;

@Entity
@Table(name = "page")
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "menu_id")
    private Integer menuId;

    @Column(name = "page_number")
    private Integer pageNumber;

    @Column(name = "cover_photo")
    private String coverPhoto;

    @Column(name = "cover_video")
    private String coverVideo;

    @Column(name = "state")
    private Integer state;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMenuId() {
        return this.menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getCoverPhoto() {
        return this.coverPhoto;
    }

    public void setCoverPhoto(String coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    public String getCoverVideo() {
        return this.coverVideo;
    }

    public void setCoverVideo(String coverVideo) {
        this.coverVideo = coverVideo;
    }

    public Integer getState() {
        return this.state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
