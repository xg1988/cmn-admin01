package com.chosu.cmn.study.repository;

import com.chosu.cmn.study.domain.UserHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserHistoryRepository extends JpaRepository<UserHistory, Long> {
}
