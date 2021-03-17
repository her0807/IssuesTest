package com.skhu.skhuedIn.repository;


import com.skhu.skhuedIn.domain.OrderStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderSearch {

    private String memberName; //
    private OrderStatus orderStatus;

}
