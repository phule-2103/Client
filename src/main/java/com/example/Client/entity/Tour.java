package com.example.Client.entity;

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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idTour")
public class Tour extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTour")
    private int idTour;

    @Column(name="tourCode")
    private String tourCode;

    @Column(name="tourName")
    private String tourName;

    @Column(name="maximumSize")
    private String maximumSize;

    @Column(name="description")
    private String description;

    @Column(name="imageUrl")
    private String imageUrl;

    @Column(name="uuid")
    private String uuid;

    @Column(name="Url")
    private String Url;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cart_id")
    private Cart cart;
}