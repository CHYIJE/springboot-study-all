package com.example.site1.domain.second.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ResSecondDTO {
    
    private List<Post> postList;

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public static class Post {
        private String title;
        private String content; 
        private User user;

        @NoArgsConstructor
        @AllArgsConstructor
        @Getter
        public static class User {
            private Integer idx;
        }
    }



}
    