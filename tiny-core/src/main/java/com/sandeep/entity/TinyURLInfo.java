package com.sandeep.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "tiny_url_info")
public class TinyURLInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "short_url")
    private String shortURL;

    @Column(name = "long_url")
    private String longURL;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShortURL() {
        return shortURL;
    }

    public void setShortURL(String shortURL) {
        this.shortURL = shortURL;
    }

    public String getLongURL() {
        return longURL;
    }

    public void setLongURL(String longURL) {
        this.longURL = longURL;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override public String toString() {
        return "TinyURLInfo{" + "id=" + id + ", shortURL='" + shortURL + '\'' + ", longURL='" + longURL + '\'' + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + '}';
    }
}
