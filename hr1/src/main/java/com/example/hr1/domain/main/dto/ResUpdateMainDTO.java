package com.example.hr1.domain.main.dto;

import org.springframework.transaction.annotation.Transactional;

import com.example.hr1.model.regions.entity.RegionsEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
// 페이지마다 DTO는 각각 만드는게 좋다
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Transactional
public class ResUpdateMainDTO {
    
    private Integer regionId;
    private String regionName;

    public static ResUpdateMainDTO fromEntity(RegionsEntity regionsEntity){
        return ResUpdateMainDTO.builder()
        .regionId(regionsEntity.getRegionId())
        .regionName(regionsEntity.getRegionName())
        .build();
    }
}
