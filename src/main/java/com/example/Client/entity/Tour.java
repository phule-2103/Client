package com.example.Client.entity;

import com.example.Client.entity.cart.CartItem;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="tour")
@Component
/*@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idTour")*/
public class Tour extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTour;

    @Column
    private String tourCode;

    @Column
    private String tourName;

    @Column
    private String maximumSize;

    @Column
    private String description;

    @Column
    private String imageUrl;

    @Column
    private String uuid;

    @JsonIgnore
    @OneToOne(mappedBy = "tour")
    private CartItem cartItem;
}