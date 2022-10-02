package com.chosu.cmn.admin.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADM_USER")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDto {

    @Id
    //@Column(length = 50)
    private String email;

    @Column(length = 50)
    private String password;

    @Column(length = 50)
    private String name;
}
