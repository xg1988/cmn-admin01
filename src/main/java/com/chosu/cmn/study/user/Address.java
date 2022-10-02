package com.chosu.cmn.study.user;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Address {

    @Id
    private Long id;
}
