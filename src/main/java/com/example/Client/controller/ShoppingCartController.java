package com.example.Client.controller;
import com.example.Client.consts.ApiPath;
import com.example.Client.dto.TourDTO;
import com.example.Client.dto.cart.ShoppingCartDTO;
import com.example.Client.response.ShoppingCartResponseDTO;
import com.example.Client.response.TourResponseDTO;
import com.example.Client.service.Impl.ShoppingCartServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
public class ShoppingCartController {
    private ShoppingCartServiceImpl service;
    @PostMapping(ApiPath.CART_CREATE)
    public ResponseEntity<?> create(@RequestBody ShoppingCartDTO entity){
        ShoppingCartResponseDTO response = new ShoppingCartResponseDTO();
        try{
            ShoppingCartDTO cart = service.create(entity);
            response.setMessage("Successfully create new cart");
            response.setErrorCode(200);
            response.setData(cart);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch (Exception e){
            response.setMessage("Error when create cart , Please try again");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(ApiPath.CART_FIND_ALL)
    public ResponseEntity<?> findAll(){
        ShoppingCartResponseDTO response = new ShoppingCartResponseDTO();
        try{
            List<ShoppingCartDTO> shoppingCartDTOs = service.getAll();
            response.setMessage("Successfully retrieved All Tour");
            response.setErrorCode(200);
            response.setList(shoppingCartDTOs);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch (Exception e) {
            response.setMessage("Error when get all Tour list , Please try again");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(ApiPath.CART_FIND_BY_ID + "/{id}")
    public ResponseEntity<ShoppingCartDTO> findById(@PathVariable("id") Long id){
        ShoppingCartDTO shoppingCartDTO = service.getByID(id);
        return new ResponseEntity<>(shoppingCartDTO, HttpStatus.OK);
    }

    @PutMapping(ApiPath.CART_UPDATE + "/{id}")
    public ResponseEntity<ShoppingCartDTO> update(@PathVariable("id") Long id, @RequestBody ShoppingCartDTO entity){
        entity.setId(id);
        ShoppingCartDTO shoppingCartDTO = service.update(entity);
        return new ResponseEntity<>(shoppingCartDTO, HttpStatus.OK);
    }

    @DeleteMapping(ApiPath.CART_DELETE + "/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") int id){
        service.delete(id);
        return new ResponseEntity<>("Delete Success", HttpStatus.OK);
    }

}
