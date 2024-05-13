package com.example.Client.entity.cart;

import com.example.Client.entity.Tour;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @Column
    private int quantity;
    @Column
    private double unitPrice;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinColumn(name = "shopping_cart_id", referencedColumnName = "id")
    private ShoppingCart cart;

    /*@JsonIgnore*/
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_tour", referencedColumnName = "idTour")
    private Tour tour;

}