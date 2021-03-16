package com.skhu.skhuedIn.domain.item;


import com.skhu.skhuedIn.domain.Category;
import com.skhu.skhuedIn.exception.NotEnoughStockException;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
@Getter @Setter
public abstract class Item {
    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;

    @ManyToMany(mappedBy = "items")
    private List<Category> categories  = new ArrayList<>();



    //== 비지니스 로직 설정

    public void addStrock(int quntity){
        this.stockQuantity +=quntity;
    }


    public void removeStock(int quantity){
        int restStock = this.stockQuantity-quantity;
        if(restStock<0){
            throw  new NotEnoughStockException("need more stock");

        }
        this.stockQuantity=restStock;
    }
}
