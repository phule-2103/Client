package com.example.Client.entity.cart;

import com.example.Client.entity.Tour;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cart_items")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinColumn(name = "shopping_cart_id", referencedColumnName = "id")
    private ShoppingCart cart;


    @Column
    private int quantity;
    @Column
    private double unitPrice;

    /*    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_tour", referencedColumnName = "id_tour")
    private Tour tour;*/

}