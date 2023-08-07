package com.example.site2.model.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.site2.model.user.entity.UserEntity;
import java.util.List;


public interface UserRepository extends JpaRepository<UserEntity, Long>  {

    //Optional : 객체가 null일 경우가 있다면 쓰는 객체
    //List : 말 그대로 list 여기선 중복이 가능하기에 쓴다

    // select * from user where idx = ? 을 알아서 만들어줌 
    // JpaRepository가 class를 자동으로 만들어줌 
    Optional<UserEntity> findByIdx(Long idx);

    // select * from user where id = ?
    Optional<UserEntity> findById(String id);
    // select * from user where password = ?
    List<UserEntity> findByPassword(String password);

    // select *
    // from user
    // where idx = ?
    // and id = ?
    Optional<UserEntity> findByIdxAndId(Long idx, String id);

    // select *
    // from user
    // where id like '%?%';
    List<UserEntity> findByIdContaining(String id);
}

