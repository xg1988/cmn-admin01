package com.chosu.cmn.study.user;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestOrderUserRepository extends JpaRepository<TestUser, Long> {

    List<TestUser> findTop1ByName(String name);
    //List<TestUser> findLast1ByName(String name);
    List<TestUser> findTop1ByNameOrderByIdDesc(String name);

    List<TestUser> findFirstByNameOrderByIdDescEmailAsc(String name);
    List<TestUser> findFirstByName(String name, Sort sort);

    /**
     * 페이징 처리
     */

    Page<TestUser> findByName(String name, Pageable pageable);

}
