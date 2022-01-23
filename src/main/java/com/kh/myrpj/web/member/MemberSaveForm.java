package com.kh.myrpj.web.member;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class MemberSaveForm {
    private Long id;
    private String memberId;
    private String passwd;
    private String nickname;
}
