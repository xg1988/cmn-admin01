package com.chosu.cmn.admin.user;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Optional<UserDto> loginUser(UserDto userDto){
        Optional<UserDto> loginResult = null;
        try{
            log.info("userDto.getEmail() : "+ userDto.getEmail());
            log.info("userDto.getEmail() : "+ userDto.getEmail());
            log.info("userDto.getEmail() : "+ userDto.getEmail());

            loginResult = userRepository.findById(userDto.getEmail());
            System.out.println(loginResult);

            //login = (loginResult != null
            //        && loginResult.getPassword().equals(userDto.getPassword()));

        }catch(Exception e){ }

        return loginResult;
    }

    public boolean insertUser(UserDto userDto){
        log.debug("userDto ==>" , userDto);
        log.debug("userDto ==>" , userDto);
        log.debug("userDto ==>" , userDto);
        log.debug("userDto ==>" , userDto);

        return (userRepository.saveAndFlush(userDto) != null);
    }
}
