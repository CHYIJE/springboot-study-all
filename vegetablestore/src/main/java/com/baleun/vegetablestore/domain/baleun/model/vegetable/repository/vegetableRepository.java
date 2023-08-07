package com.baleun.vegetablestore.domain.baleun.model.vegetable.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baleun.vegetablestore.domain.baleun.model.vegetable.entity.vegetableEntity;


public interface vegetableRepository extends JpaRepository<vegetableEntity, Long>{
    Optional<vegetableEntity> findByIdx(Integer idx);
    Optional<vegetableEntity> findByVegename(String vegename);
    List<vegetableEntity> findByPrice(Integer price);
    List<vegetableEntity> findByOrigin(String origin);
    List<vegetableEntity> findByPicture(String picture);
    List<vegetableEntity> findByAmount(Integer amount);
    Optional<vegetableEntity>findByIdxAndVegename(Integer idx, String vegename);
}
