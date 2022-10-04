package com.chosu.cmn.admin.querymethod;

import com.chosu.cmn.study.repository.TestUserRepository;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class QueryMethodTest2 {

    @Autowired
    TestUserRepository testUserRepository;

    @Test
    void test(){
        testUserRepository.findByEmailAndName("steve@fastcampus.com", "steve");
        testUserRepository.findByEmailOrName("steve@fastcampus.com", "steve");

        System.out.println(testUserRepository.findByEmailAndName("steve@fastcampus.com", "steve"));
        System.out.println(testUserRepository.findByEmailOrName("steve@fastcampus.com", "steve"));
        // >
        System.out.println(testUserRepository.findByCreateAtAfter(LocalDateTime.now().minusDays(1L)));
        // >
        System.out.println(testUserRepository.findByCreateAtGreaterThan(LocalDateTime.now().minusDays(1L)));
        // >=
        System.out.println(testUserRepository.findByCreateAtGreaterThanEqual(LocalDateTime.now().minusDays(1L)));
        // >= 양끝단의 값을 포함한다
        System.out.println(testUserRepository.findByCreateAtBetween(LocalDateTime.now().minusDays(1L), LocalDateTime.now().plusDays(1L)));

        System.out.println(testUserRepository.findByIdAfter(10L));

        System.out.println(testUserRepository.findByIdIsNotNull());

        //
        //System.out.println(testUserRepository.findByAddressIsNotEmpty());

        System.out.println("findByNameIn :" +testUserRepository.findByNameIn(Lists.newArrayList("david", "new test")));

        System.out.println("findByNameStartingWith : "+testUserRepository.findByNameStartingWith("te"));
        System.out.println("findByNameEndingWith : "+testUserRepository.findByNameEndingWith("te"));
        System.out.println("findByNameContains : "+testUserRepository.findByNameContains("te"));
        System.out.println("findByNameLike : "+testUserRepository.findByNameLike("%"+ "te" + "%"));


        System.out.println("findByNameIs : "+testUserRepository.findByNameIs("steve"));

    }
}
