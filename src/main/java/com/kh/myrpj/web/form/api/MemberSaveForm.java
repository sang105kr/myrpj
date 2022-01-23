package com.kh.myrpj.web.form.api;

import lombok.Data;

@Data
public class MemberSaveForm {
    private Long memberId;
    private String email;
    private String passwd;
    private String nickname;
}
