package com.revature.pms.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private int productId;
    private String productName;
    private int qoh;
    private int price;


}
