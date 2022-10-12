package com.springboot.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="wikimedia_firstTopic")
@Getter
@Setter
public class WikimediaDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Lob                                //to store large object
    private String wikiEventsData;

}
