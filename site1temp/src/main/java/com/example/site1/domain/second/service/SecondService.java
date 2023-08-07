package com.example.site1.domain.second.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.site1.domain.second.dto.ResSecondDTO;
import com.example.site1.model.post.entity.PostEntity;
import com.example.site1.model.post.repository.PostRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SecondService {

    private final PostRepository postRepository;

    public ResSecondDTO getSecondData() {
        // 모든 post 데이터 가져오기 List<PostEntity>
        List<PostEntity> postEntityList = postRepository.findAll();

        List<ResSecondDTO.Post> postList = new ArrayList<>();
        // List<PostEntity>반복문 돌려서 PostDTO만들기
        for (PostEntity postEntity : postEntityList) {
            // PostEntity로부터 필요한 정보를 가져와서 PostDTO 객체 생성

            ResSecondDTO.Post.User user = new ResSecondDTO.Post.User(postEntity.getUserEntity().getIdx());
            ResSecondDTO.Post post = new ResSecondDTO.Post(postEntity.getTitle(), postEntity.getContent(), user);

            // List<PostDTO>에 담기
            postList.add(post);
        }

        // ResSecondDTO에 List<PostDto> 담기
        ResSecondDTO resSecondDTO = new ResSecondDTO(postList);

        // ResSecondDTO 리턴하기
        return resSecondDTO;
    }
}
