package com.kh.myrpj.web;

import com.kh.myrpj.web.member.MemberSaveForm;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Slf4j
@Controller
@AllArgsConstructor
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("member", new MemberSaveForm());
        return "/member/add1.html";
    }

    @PostMapping("/add")
    public String add(@Validated @ModelAttribute MemberSaveForm memberSaveForm, BindingResult bindingResult,
                      RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "/member/addForm";
        }

        //객체오류

        //성공로직

        return "/";
    }

    @GetMapping("/{id}/detail")
    public String detail(@PathVariable String id) {
        return "/member/detail";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable String id, Model model) {

        model.addAttribute("member", new MemberSaveForm());
        return "/member/edit";
    }

    @PatchMapping("/{id}/edit")
    public String edit(@PathVariable String id, @Validated @ModelAttribute MemberSaveForm memberSaveForm, BindingResult bindingResult) {

        return "/member/detail";
    }

}