package com.sid.orderservice.entity;

import com.sid.orderservice.enums.OrderStatus;
import com.sid.orderservice.model.Client;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table( name= "orders")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Date CreatedAt;
    private OrderStatus orderStatus;
    private Long clientId;
    @Transient
    private Client client;
    @OneToMany(mappedBy = "order")
    private List<ProductItem> productItems;
}

