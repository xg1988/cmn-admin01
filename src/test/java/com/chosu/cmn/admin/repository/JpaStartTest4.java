package com.chosu.cmn.admin.repository;


import com.chosu.cmn.admin.user.User;
import com.chosu.cmn.study.repository.TestBasicUserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@SpringBootTest
public class JpaStartTest4 {

    @Autowired
    TestBasicUserRepository testBasicUserRepository;

    @Test
    public void test(){
        Page<User> users = testBasicUserRepository.findAll(PageRequest.of(1,3));
        //users.forEach(System.out::println);

        System.out.println("page : " + users);
        System.out.println("totalElements: "+ users.getTotalElements());
        System.out.println("getTotalPages: "+ users.getTotalPages());
        System.out.println("getNumberOfElements: "+ users.getNumberOfElements());
        System.out.println("getSort: "+ users.getSort());
        System.out.println("getSize: "+ users.getSize());
        users.getContent().forEach(System.out::println);

    }
}
