package com.chosu.cmn.admin.repository;

import com.chosu.cmn.admin.user.User;
import com.chosu.cmn.study.repository.TestBasicUserRepository;
import groovy.util.logging.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.Optional;

@SpringBootTest
@Slf4j
public class JpaStartTest2 {

    @Autowired
    TestBasicUserRepository testBasicUserRepository;

    @Test
    @Transactional
    public void crud(){
        //could not initialize proxy [com.chosu.cmn.admin.user.User#10] - no Session
        // 에러발생 @Transactional = > 세션을 유지시켜줌
        // flush 에서 사용하는 컨텍스트 개념
        // getOne은 lazy patch를 지원하고 있다.
        User user = testBasicUserRepository.getOne(10L); // 엔티티를 받아오고 findById는 optional
        System.out.println(user);

        //optional 객체 별도 처리 필요 -- 이거 패치? 검색 필요
        Optional<User> user2 = testBasicUserRepository.findById(10L); // 엔티티를 받아오고 findById는 optional
        System.out.println(user2);
        // 또는
        User user3 = testBasicUserRepository.findById(10L).orElse(null);
        System.out.println(user3);

    }
}
