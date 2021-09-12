package com.iu.s4.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import oracle.jdbc.proxy.annotation.Post;

@Controller
@RequestMapping("/member/**")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@GetMapping("check")
	public ModelAndView check()throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/check");
		return mv;
	}
	
	
	@GetMapping("join")
	public ModelAndView join()throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/join");
		return mv;
	}
	
	@PostMapping("join")
	public ModelAndView setInsert(MemberDTO memberDTO)throws Exception {
		ModelAndView mv = new ModelAndView();
		int result = memberService.setInsert(memberDTO);
		mv.setViewName("redirect:../");
		return mv; 
	}
	
	@GetMapping("idCheck")
	public ModelAndView getIdCheck(MemberDTO memberDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		memberDTO=memberService.getIdCheck(memberDTO);
		System.out.println("id 중복 체크");
		mv.addObject("dto", memberDTO);
		mv.setViewName("member/idCheck");
		return mv;
	}
	
	@GetMapping("login")
	public ModelAndView login()throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/login");
		return mv;
	}
	@PostMapping("login")
	public ModelAndView login(MemberDTO memberDTO, HttpSession session)throws Exception{
		
		ModelAndView mv = new ModelAndView();
		memberDTO=memberService.getLogin(memberDTO);
		
		if(memberDTO!= null) {
			System.out.println("로그인 성공");
			session.setAttribute("member", memberDTO);
		}else {
			System.out.println("로그인 실패");
		}
		mv.setViewName("redirect:../");
		return mv;
	}
	
	@GetMapping("logout")
	public ModelAndView logout(HttpSession session)throws Exception {
		ModelAndView mv = new ModelAndView();
		//1. 
		//session.removeAttribute("member");
	
		//2. 세션의 시간 0으로 만들기 
		session.invalidate();
		mv.setViewName("redirect:../");
		return mv; 
	}
	
	@GetMapping("mypage")
	public ModelAndView mypage()throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/mypage");
		return mv; 
	}
	
	@RequestMapping("delete")
	public String setDelete(MemberDTO memberDTO)throws Exception {
		int result=memberService.setDelete(memberDTO);
		return "redirect:../"; 
	}
	

	
	
	@GetMapping("update")
	public ModelAndView setUpdate(MemberDTO memberDTO)throws Exception {
		ModelAndView mv = new ModelAndView();
		memberDTO = memberService.getSelect(memberDTO);
		mv.addObject("dto",memberDTO);
		mv.setViewName("member/update");
		return mv; 
	}
	
	@PostMapping("update")
	public ModelAndView setUpdate(MemberDTO memberDTO,ModelAndView mv)throws Exception{
		int result = memberService.setUpdate(memberDTO);
		mv.setViewName("redirect:../");
		return mv; 
	}
	
	
	
	
	
	
	
	
	
	
}
