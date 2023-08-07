package com.example.site2.model.post.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.site2.model.post.entity.PostEntity;
import java.util.List;



public interface PostRepository extends JpaRepository<PostEntity, Long> {
    //쿼리문으로만 들고오기
    @Query(value = "select * from post where title = ?", nativeQuery = true)
    void getPostList(String title);


    // select * from post where idx = ?
    Optional<PostEntity> findByIdx(Long idx);
    // select * from post where title = ?
    List<PostEntity> findByTitle(String title);
    // select * from post where content = ?
    List<PostEntity> findByContent(String content);

    // postentity에서 useridx를 바꿧기에 없어야 한다.
    // select * from post where user_idx = ?
    // List<PostEntity> findByUserIdx(Long userIdx);

    // select *
    // from post
    // where title = ? 
    // or content = ?
    List<PostEntity> findByTitleOrContent(String title, String content);

    // select *
    // from post
    // where title like '%?%';
    // or content like '%?%'
    List<PostEntity> findByTitleContainingOrContentContaining(String title, String content);

}
