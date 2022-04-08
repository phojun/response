package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class ApiController {


    //TEXT
    @GetMapping("/text")
    public String text(@RequestParam String account){
        return account;
    }

    //JSON
    //req json으로 들어옴 -> object mapper에서 object로 변환 -> method -> object 결과물 추출 -> object mapper에서 json으로 변환
    @PostMapping("/json")
    public User json(@RequestBody User user){
        return user;//200 OK
    }

    //201로 응답받기 위한 방법 ResponseEntity를 활용하여 설정할 수 있음
    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
        
    }
}
