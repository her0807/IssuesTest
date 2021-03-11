package com.skhu.skhuedIn.member;


import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Member {


    private Long user_id;
    private String user_email;
    private String user_pw;
    private String user_image_url;

}
