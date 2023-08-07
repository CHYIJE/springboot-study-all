package com.example.hr1.model.regions.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

// DB 테이블명 + Entity

// 엔티티임을 명시
@Entity
// 데이터베이스의 테이블이름과 연동
@Table(name = "regions")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
// 엔티티에서 Setter는 꼭필요할 때만 직접 만드는 것을 추천
// toString도 직접 만드는 것을 추천
public class RegionsEntity {
    // 기본키 (PK)에 @Id를 붙인다.
    @Id
    // 값 자동증가
    // db에서 오토 인크리먼트가 되어 있는 상태에서 해야함
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // 데이터베이스에 있는 컬럼명을 연결
    // 컬럼의 속성을 맞춰주는 것이 좋다
    @Column(name = "region_id", nullable = false, unique = true)
    private Integer regionId;

    @Column(name = "region_name")
    private String regionName;

    public void setRegionName(String regionName){
        this.regionName = regionName;
    }

    @Override
    public String toString(){
        return "RegionEntity [regionId = " + regionId + ", regionName = " + regionName + "]";

    }
}