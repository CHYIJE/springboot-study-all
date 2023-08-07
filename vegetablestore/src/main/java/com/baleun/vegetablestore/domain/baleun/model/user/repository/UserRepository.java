package com.baleun.vegetablestore.domain.baleun.model.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baleun.vegetablestore.domain.baleun.model.user.entity.UserEntity;
import java.util.List;


public interface UserRepository extends JpaRepository<UserEntity, Long> {
    
    Optional<UserEntity> findByIdx(Integer idx);

    Optional<UserEntity> findById(String id);

    List<UserEntity> findByPassword(String password);

    List<UserEntity> findByname(String name);

    List<UserEntity> findByemail(String email);

    List<UserEntity> findByaddress(String address);

    List<UserEntity> findByPhone(Integer phone);

    Optional<UserEntity>findByIdxAndId(Integer idx, String id);

    List<UserEntity> findByIdContaining(String id);
}
