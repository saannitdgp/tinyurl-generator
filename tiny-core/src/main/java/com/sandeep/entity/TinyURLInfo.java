package com.sandeep.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@ToString
@Table(name = "tiny_url_info")
public class TinyURLInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer   id;

    @Column(name = "short_url")
    private String    shortURL;

    @Column(name = "long_url")
    private String    longURL;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

}
