package com.example.hr1.domain.temp;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/temp")
public class TempControllerApiV1 {
    @GetMapping("/200")
    public ResponseEntity<?> get200(){
        return new ResponseEntity<>("성공", HttpStatus.OK);
    }

    @GetMapping("/400")
    public ResponseEntity<?> get400(){
        return new ResponseEntity<>("잘못된 요청", HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/401")
    public ResponseEntity<?> get401(){
        return new ResponseEntity<>("비승인", HttpStatus.UNAUTHORIZED);
    }

    @GetMapping("/403")
    public ResponseEntity<?> get403(){
        return new ResponseEntity<>("권한 없음", HttpStatus.PAYMENT_REQUIRED);
    }

    @GetMapping("/404")
    public ResponseEntity<?> get404(){
        return new ResponseEntity<>("찾을 수 없음", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/405")
    public ResponseEntity<?> get405(){
        return new ResponseEntity<>("삭제 불가", HttpStatus.METHOD_NOT_ALLOWED);
    }

    @GetMapping("/500")
    public ResponseEntity<?> get500(){
        return new ResponseEntity<>("서버터짐", HttpStatus.INTERNAL_SERVER_ERROR);
    }
    


}
