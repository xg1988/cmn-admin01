package com.chosu.cmn.admin.repository;

import com.chosu.cmn.admin.user.User;
import com.chosu.cmn.study.repository.TestBasicUserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.contains;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;

@SpringBootTest
public class JpaStartTest5 {

    @Autowired
    TestBasicUserRepository testBasicUserRepository;

    @Test
    public void test(){
        // 복수 where 조건 적용 예시
        // 다양한 where 조건 처리
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnorePaths("name")
                .withMatcher("email", endsWith()); //endsWith앞에서 alt enter 자동완성
        //GenericPropertyMatchers 옵션 찾기

        Example<User> example = Example.of(new User("ma", "fastcampus.com"), matcher);

        //ma 는 무시 @fastcampus.com 을 endwith 옵션으로 검색
        testBasicUserRepository.findAll(example).forEach(System.out::println);

        ExampleMatcher matcher1 = ExampleMatcher.matching()
                .withMatcher("email", contains());

        User user = new User();
        user.setEmail("naver");
        Example<User> example2 = Example.of(user, matcher1);
        testBasicUserRepository.findAll(example2).forEach(System.out::println);
    }
}
