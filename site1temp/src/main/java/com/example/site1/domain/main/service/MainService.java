package com.example.site1.domain.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.site1.domain.main.dto.ResMainDTO;
import com.example.site1.domain.main.dto.UserDTO;
import com.example.site1.model.user.entity.UserEntity;
import com.example.site1.model.user.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MainService {
    
    private final UserRepository userRepository;

    public ResMainDTO getMainData(){
        // 모든 유저 가져오기
        List<UserEntity> userEntityList = userRepository.findAll();

        // dto를 담을 리스트
        List<UserDTO> userDTOList = new ArrayList<>();
        
        for(UserEntity userEntity : userEntityList) {
            
            // dto 만들기
            UserDTO userDTO = new UserDTO(userEntity.getId());
            // dto를 리스트에 담기
            userDTOList.add(userDTO);
        }
        // 철가방에 짜장면 담기
        ResMainDTO resMainDTO = new ResMainDTO(userDTOList);

        return resMainDTO;
    }

}
