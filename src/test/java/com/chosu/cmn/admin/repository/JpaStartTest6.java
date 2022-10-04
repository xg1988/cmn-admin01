package com.chosu.cmn.admin.repository;

import com.chosu.cmn.admin.user.User;
import com.chosu.cmn.study.repository.TestBasicUserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JpaStartTest6 {
    @Autowired
    TestBasicUserRepository testBasicUserRepository;

    @Test
    public void test(){
        testBasicUserRepository.save(new User("david", "david@fastcampus.com"));

        User user = testBasicUserRepository.findById(13L).orElseThrow(RuntimeException::new);
        user.setEmail("davidnew@fastcampus.com");

        testBasicUserRepository.save(user);
    }
}
