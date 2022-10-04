package com.chosu.cmn.study.domain;


import com.chosu.cmn.study.listener.Auditable;
import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
@Table(name="User", indexes = {@Index(columnList = "name")}, uniqueConstraints = {@UniqueConstraint(columnNames = {"email"})})
@Entity
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
//@EntityListeners(value = {MyEntityListener.class, UserEntityListener.class})
//@EntityListeners(value = AuditingEntityListener.class)
public class TestUser extends BaseEntity{

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    // 디비는 그대로인데 프로그램을 리빌딩 하는 케이스에 사용 할 수 있다.
    // 사용하지 않는 경우 객체명으로 테이블과 연결됨
    //@Column(name="crtdat")
    // not null column 으로 지정하기 위해서 사용됨
    //@Column(nullable = false)

    /*@Column(updatable = false)
    @CreatedDate
    private LocalDateTime createAt;

    //@Column(insertable = false)
    @LastModifiedDate
    private LocalDateTime updateAt;*/

    // 디비에 반영하지 않고 해당 객체와 생명주기를 같이 하는 값이 된다.
    @Transient
    private String testData;

    //enum 1 잘이해가 안가는 부분 자바 열거형 , JPA 알아보기
    @Enumerated(value= EnumType.STRING)
    private Gender gender;

   /* @OneToMany(fetch = FetchType.EAGER)
    private List<Address> address;*/

/*

    @PrePersist
    public void prePersist(){
        System.out.println(">>> prePersist");

        this.createAt = LocalDateTime.now();
        this.updateAt = LocalDateTime.now();
    }

    @PreUpdate
    public void PreUpdate(){
        System.out.println(">>> PreUpdate");
        this.updateAt = LocalDateTime.now();
    }

*/

    /*
    @PreRemove
    public void PreRemove(){
        System.out.println(">>> PreRemove");
    }

    @PostPersist
    public void PostPersist(){
        System.out.println(">>> PostPersist");
    }

    @PostUpdate
    public void PostUpdate(){
        System.out.println(">>> PostUpdate");
    }
    @PostRemove
    public void PostRemove(){
        System.out.println(">>> PostRemove");
    }
    @PostLoad
    public void PostLoad(){
        System.out.println(">>> PostLoad");
    }*/

}
