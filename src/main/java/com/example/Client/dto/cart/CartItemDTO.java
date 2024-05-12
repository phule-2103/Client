package com.example.Client.dto.cart;

import com.example.Client.dto.TourDTO;
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

    private ShoppingCartDTO cart;

    private TourDTO tour;

    private int quantity;

    private double unitPrice;
}
