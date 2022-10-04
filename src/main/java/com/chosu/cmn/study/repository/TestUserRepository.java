package com.chosu.cmn.study.repository;

import com.chosu.cmn.study.domain.TestUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface TestUserRepository extends JpaRepository<TestUser, Long> {

    List<TestUser> findByEmailAndName(String email, String name);
    List<TestUser> findByEmailOrName(String email, String name);

    List<TestUser> findByCreateAtAfter(LocalDateTime yesterday);

    List<TestUser> findByIdAfter(Long id);

    List<TestUser> findByCreateAtGreaterThan(LocalDateTime yesterday);
    List<TestUser> findByCreateAtGreaterThanEqual(LocalDateTime yesterday);

    List<TestUser> findByCreateAtBetween(LocalDateTime yesterday, LocalDateTime tomorrow);

    List<TestUser> findByIdIsNotNull();

    //List<TestUser> findByAddressIsNotEmpty();


    List<TestUser> findByNameIn(List<String> names);

    // 문자열, like  검색

    List<TestUser> findByNameStartingWith(String name);
    List<TestUser> findByNameEndingWith(String name);
    List<TestUser> findByNameContains(String name);
    List<TestUser> findByNameLike(String name);
    List<TestUser> findByNameIs(String name);


}



