package com.example.site1.model.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.site1.model.user.entity.UserEntity;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    // 리파지토리야 유저의 idx를 줄테니까
    // 해당 idx를 가진 userEntity를 리턴해줘
    // UserEntity findByIdx(Integer idx);

    // 리파지토리야 유저의 idx를 줄테니까
    // 해당 idx를 가진 Optional<userEntity>를 리턴해줘
    // 익름과 타입이 같다면 오버로딩되지 않는다
    Optional<UserEntity> findByIdx(Integer idx);

    // 리파지토리야 유저의 id를 줄테니까
    // 해당 id를 가진 userEntity를 리턴해줘
    UserEntity findById(String id);

}
