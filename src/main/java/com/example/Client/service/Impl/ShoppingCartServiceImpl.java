package com.example.Client.service.Impl;

import com.example.Client.dto.TourDTO;
import com.example.Client.dto.cart.ShoppingCartDTO;
import com.example.Client.entity.Tour;
import com.example.Client.entity.cart.ShoppingCart;
import com.example.Client.mapper.AbstractMapper;
import com.example.Client.repository.ShoppingCartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends AbstractBaseServiceImpl<ShoppingCartDTO>{

    @Autowired
    ShoppingCartRepository repo;

    public ShoppingCartServiceImpl() {
        AbstractMapper mapper = new AbstractMapper(ShoppingCart.class, ShoppingCartDTO.class);
        super.setMapper(mapper);
    }

    public void setRepository() {
        AbstractBaseServiceImpl.setRepository(this.repo);
    }
}
