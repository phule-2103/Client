package com.example.Client.dto.cart;

import com.example.Client.dto.TourDTO;
import com.example.Client.entity.Tour;
import com.example.Client.entity.cart.ShoppingCart;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartItemDTO {
    private Long id;

    private int quantity;

    private double unitPrice;

    private ShoppingCart cart;

    private Tour tour;

}
