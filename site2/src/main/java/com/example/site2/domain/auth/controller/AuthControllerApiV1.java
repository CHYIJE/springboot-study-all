package com.example.site2.domain.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.site2.domain.auth.dto.ReqJoinDTO;
import com.example.site2.domain.auth.dto.ReqLoginDTO;
import com.example.site2.domain.auth.service.AuthServiecApiV1;

import jakarta.servlet.http.HttpSession;



@RestController
@RequestMapping("/api/v1/auth") // controller랑 같은 join을 쓰기에 구분하기위하여 쓴다.
public class AuthControllerApiV1 {

    @Autowired //restcontroller에 new를 안쓰고 끌어오기 위해 사용
    private AuthServiecApiV1 authServiecApiV1;

    @PostMapping("/join")
    public ResponseEntity<?> join(@RequestBody ReqJoinDTO dto){

        ResponseEntity<?> responseEntity = authServiecApiV1.join(dto);

        return responseEntity;
    }
    
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody ReqLoginDTO dto, HttpSession session){
        // session을 쓰는 이유  해당 요청한 유저의 정보가 들어가 있다. 누군지 알게 하는게 session이다.
        return authServiecApiV1.login(dto, session);
    }


    public static void main(String[] args) {
        
        // AuthControllerApiV1 authControllerApiV1 = new AuthControllerApiV1();
// 
        // JoinUserDTO joinUserDTO = new JoinUserDTO("asdf", "1234");
// 
        // ReqJoinDTO reqJoinDTO = new ReqJoinDTO(joinUserDTO);
// 
        // ResponseEntity<?> responseEntity = authControllerApiV1.join(reqJoinDTO)

    }
}
