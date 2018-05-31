package net.viralpatel.spring.controller;

import net.viralpatel.spring.model.User;
import net.viralpatel.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CustomerRestController {



    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String welcome() {//Welcome page, non-rest
        return "Welcome to RestTemplate Example.";
    }

    @PostMapping(path = "/student", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity setStudent(@RequestBody User user) {
        userRepository.save(user);
        return new ResponseEntity(user, HttpStatus.OK);
    }


}