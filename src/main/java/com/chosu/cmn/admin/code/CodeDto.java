package com.chosu.cmn.admin.code;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name="basic_code")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CodeDto {
    @Id
    @GeneratedValue
    private Long id;

    private String codeGrpId;
    private String codeId;
    private String codeName;
    private String codeDesc;
    private String codeEngName;

    private String updateId;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}
