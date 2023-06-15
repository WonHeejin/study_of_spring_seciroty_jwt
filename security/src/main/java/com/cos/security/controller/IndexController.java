package com.cos.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //View를 리턴
public class IndexController {

	@GetMapping({"","/"})
	public String index() {
		// 머스테치 기본 폴다: src/main/resources/
		//viewResolver 설정: templates (prifix), .mustache (suffix) 생략 가능
		return "index";
	}
	
	@GetMapping("/user")
	public @ResponseBody String user() {
		return "user";
	}
	
	@GetMapping("/admin")
	public @ResponseBody String admin() {
		return "admin";
	}
	
	@GetMapping("/manager")
	public String manager() {
		return "manager";
	}
	
	@GetMapping("/login")
	public @ResponseBody String login() {
		return "login";
	}
	
	@GetMapping("/join")
	public String join() {
		return "join";
	}
	
	@GetMapping("/joinProc")
	public @ResponseBody String joinProc() {
		return "회원가입 완료됨";
	}
}
