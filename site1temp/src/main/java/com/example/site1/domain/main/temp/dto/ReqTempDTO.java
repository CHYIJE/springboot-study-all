package com.example.site1.domain.main.temp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter 
@Setter  //req는 setter를 꼭 넣어야만 req에 데이터가 들어간다.
public class ReqTempDTO {
    private String name;
    private Integer age;
    
}
