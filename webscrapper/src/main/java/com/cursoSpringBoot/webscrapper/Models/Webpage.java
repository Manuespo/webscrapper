package com.cursoSpringBoot.webscrapper.Models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name= "webpage")
public class Webpage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String domain;
    private String url;
    private String title;
    private String description;
    private String picture;
    private String rank;

}
