package com.skhu.skhuedIn.JPA;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Setter @Getter
public class Member {

    @Id @GeneratedValue
    private Long id;
    private String username;


}
