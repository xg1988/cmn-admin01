package com.chosu.cmn.admin.querymethod;


import com.chosu.cmn.study.repository.TestBasicUserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QueryMethodTest1 {

    @Autowired
    TestBasicUserRepository testBasicUserRepository;

    @Test
    public void select(){
        System.out.println(testBasicUserRepository.findByName("david"));


        System.out.println("findByEmail : "+ testBasicUserRepository.findByEmail("hoho90@naver.com"));
        System.out.println("getByEmail : "+ testBasicUserRepository.getByEmail("hoho90@naver.com"));
        System.out.println("readByEmail : "+ testBasicUserRepository.readByEmail("hoho90@naver.com"));
        System.out.println("queryByEmail : "+ testBasicUserRepository.queryByEmail("hoho90@naver.com"));
        System.out.println("searchByEmail : "+ testBasicUserRepository.searchByEmail("hoho90@naver.com"));
        System.out.println("streamByEmail : " + testBasicUserRepository.streamByEmail("hoho90@naver.com"));


        System.out.println("findEmailByName : " + testBasicUserRepository.findEmailByName("hoho90@naver.com"));


        System.out.println("findFirst1ByName : "+ testBasicUserRepository.findFirst1ByName("david"));
        System.out.println("findTop1ByName : "+ testBasicUserRepository.findTop1ByName("david"));
        System.out.println("findLast1ByName : "+ testBasicUserRepository.findLast1ByName("david"));


    }
}
