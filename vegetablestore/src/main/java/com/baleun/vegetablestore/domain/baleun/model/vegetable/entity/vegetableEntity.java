package com.baleun.vegetablestore.domain.baleun.model.vegetable.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vegetable")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class vegetableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    (name = "idx", nullable = false, unique = true)
    private Integer idx;
    @Column
    (name = "vegename", nullable = false, unique = true)
    private String vegename;
    @Column
    (name = "price", nullable = false)
    private Integer price;
    @Column
    (name = "origin", nullable = false)
    private String origin;
    @Column
    (name = "picture", nullable = false)
    private String picture;
    @Column
    (name = "amount", nullable = false)
    private Integer amount;
}
