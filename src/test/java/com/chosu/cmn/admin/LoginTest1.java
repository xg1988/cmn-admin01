package com.chosu.cmn.admin;

import com.chosu.cmn.admin.user.UserDto;
import com.chosu.cmn.admin.user.UserRepository;
import com.chosu.cmn.admin.user.UserService;
import groovy.util.logging.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

@SpringBootTest
@Slf4j
public class LoginTest1 {
    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @Test
    @Transactional
    public void test(){
        UserDto userDto = new UserDto();
        userDto.setEmail("test@test.test");
        userDto.setPassword("1111");

        UserDto test = userRepository.saveAndFlush(userDto);
        System.out.println("test 11: " + test);
        //boolean test= userService.userLogin(userDto);
        //System.out.println(userRepository.getReferenceById(userDto.getEmail()));
        //System.out.println("test 22: " + userDto.toString());

        System.out.println(userRepository.findById(userDto.getEmail()).get());

        //userRepository.findAll().forEach(s -> System.out.println("!! :"+s));
    }
}
