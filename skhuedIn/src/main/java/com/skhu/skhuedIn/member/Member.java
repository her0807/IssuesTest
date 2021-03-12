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
    protected Grade grade;


    public Member(Long user_id, String user_email, String user_pw, String user_image_url, Grade grade) {
        this.user_id = user_id;
        this.user_email = user_email;
        this.user_pw = user_pw;
        this.user_image_url = user_image_url;
        this.grade = grade;
    }
}
