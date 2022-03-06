package com.careerdevs.jsonplaceholder1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
   @PostMapping("/ping")
    public String pong(){
       return "pong";
    }

    @GetMapping("/jsonplaceholder{id}")
    public Object jphUsers (RestTemplate restTemplate, @PathVariable("id") String userId){
       Object requestData = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users/" , Object.class);
       return requestData;
    }
}
