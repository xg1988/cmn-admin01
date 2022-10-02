package com.chosu.cmn.admin.repository;

import com.chosu.cmn.admin.user.User;
import com.chosu.cmn.study.user.TestBasicUserRepository;
import groovy.util.logging.Slf4j;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
@Slf4j
public class JpaStartTest1 {

    @Autowired
    TestBasicUserRepository testBasicUserRepository;

    @Test
    public void crud(){
        int i = 0;
/*

        userTestRepository.save(new User("test1" , "hoho88@naver.com"));
        userTestRepository.save(new User("test2" , "hoho89@naver.com"));
        userTestRepository.save(new User("test3" , "hoho90@naver.com"));
        userTestRepository.save(new User("test4" , "hoho91@naver.com"));
        userTestRepository.save(new User("test5" , "hoho92@naver.com"));
*/

        //System.out.println(userTestRepository.findAll());

        //java8, lambda 식 표현
        //userTestRepository.findAll().forEach(System.out::println);

        //List<User> users = userTestRepository.findAll();
        System.out.println("=======================> test" +(i++));
        List<User> users = testBasicUserRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));
        users.forEach(System.out::println);

        System.out.println("=======================> test" +(i++));

        List<User> users2 = testBasicUserRepository.findAllById(Lists.newArrayList(11L, 12L, 13L));
        users2.forEach(System.out::println);

        System.out.println("=======================> test" +(i++));
/*
        User user1 = new User("jack", "jack@fastcampus.com");
        User user2 = new User("steve", "steve@fastcampus.com");

        userTestRepository.saveAll(Lists.newArrayList(user1, user2));*/
        List<User> users3 = testBasicUserRepository.findAll();
        users3.forEach(System.out::println);
        System.out.println("=======================> test" +(i++));


    }
}
