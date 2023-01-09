package com.Celi.Springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class RedE {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String url;
    private String icoFont;

    public RedE() {
    }

    public RedE(String url, String icoFont) {
        this.url = url;
        this.icoFont = icoFont;
    }
    
   
    

}
