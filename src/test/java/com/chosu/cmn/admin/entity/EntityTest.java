package com.chosu.cmn.admin.entity;


import com.chosu.cmn.study.domain.*;
import com.chosu.cmn.study.repository.TestOrderUserRepository;
import com.chosu.cmn.study.repository.TestUserRepository;
import com.chosu.cmn.study.repository.UserHistoryRepository;
import groovy.util.logging.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class EntityTest {

    @Autowired
    TestUserRepository userRepository;

    @Autowired
    TestOrderUserRepository testOrderUserRepository;

    @Autowired
    UserHistoryRepository userHistoryRepository;

    @Test
    public void test(){
        TestUser user = new TestUser();
        user.setName("martin");
        user.setEmail("martin@fastcampus.com");

        userRepository.save(user);

        TestUser user2 = userRepository.findById(1L).orElseThrow(RuntimeException::new);

        System.out.println(user2);
        user2.setName("marrrrrtin");

        userRepository.save(user2);
    }

    @Test
    void enumTest(){
        TestUser user = userRepository.findById(1L).orElseThrow(RuntimeException::new);

        user.setGender(Gender.MALE);

        userRepository.save(user);

        userRepository.findAll().forEach(System.out::println);

        System.out.println(testOrderUserRepository.findRowRecord().get("gender"));

    }

    @Test
    void listenerTest(){
        TestUser user = new TestUser();
        user.setName("martin");
        user.setEmail("martin@fastcampus.com");

        userRepository.save(user);

        TestUser user2 = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        userRepository.save(user2);

        userRepository.deleteById(4L);
    }



}
