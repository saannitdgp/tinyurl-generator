package com.sandeep.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "word_info")
@Setter
@Getter
public class WordInfo {

    @Id
    @Column(name = "word",updatable = false)
    private String word;

    @Column(name = "synonyms", nullable = false)
    private String listOfSynonyms;

    @Column(name = "description",nullable = false)
    private String description;

    @Column(name = "translate_in_hindi")
    private String translationInHindi;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;
}
