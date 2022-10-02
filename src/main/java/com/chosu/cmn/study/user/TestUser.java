package com.chosu.cmn.study.user;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
@Table(name="User")
@Entity
public class TestUser {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    private LocalDateTime createAt;

    private LocalDateTime updateAt;

   /* @OneToMany(fetch = FetchType.EAGER)
    private List<Address> address;*/
}
