package com.example.site2.model.post.entity;

import com.example.site2.model.user.entity.UserEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "post")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString  //이걸 달면 객체 내용이 나온다
public class PostEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idx", nullable = false, unique =  true)
    private Long idx;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;
    
    // @Column(name = "user_idx")
    // private Long useridx;

    // 조인
    @ManyToOne
    @JoinColumn(name = "user_idx", referencedColumnName = "idx", nullable = false)
    private UserEntity userEntity;
}
