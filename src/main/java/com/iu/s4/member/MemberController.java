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
	public ModelAndView join(MemberDTO memberDTO)throws Exception {
		ModelAndView mv = new ModelAndView();
		int result = memberService.setJoin(memberDTO); //insert하러 가는 코드
		
		String message ="회원가입실패";
		if(result>0) {
			message="회원 가입 성공";
		}		
		mv.addObject("msg",message);
		mv.addObject("url", "../");
		mv.setViewName("common/result");
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
	
	@GetMapping("delete")
	public ModelAndView setDelete(HttpSession session)throws Exception {
		ModelAndView mv = new ModelAndView();
		MemberDTO memberDTO=(MemberDTO)session.getAttribute("member");
		int result=memberService.setDelete(memberDTO);
		session.invalidate();
		mv.setViewName("redirect:../");
		return mv; 
	}
	
	@GetMapping("update")
	public ModelAndView setUpdate()throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/update");
		return mv; 
	}
	
	@PostMapping("update")
	public ModelAndView setUpdate(MemberDTO memberDTO,HttpSession session)throws Exception{
		//수정전 데이터
		MemberDTO sessionDTO = (MemberDTO)session.getAttribute("member");
		//수정후 데이터
		memberDTO.setId(sessionDTO.getId());
		
		int result = memberService.setUpdate(memberDTO);
		
		memberDTO.setName(sessionDTO.getName());
		session.setAttribute("member", memberDTO);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:../");
		return mv; 
	}
	
	
	
	
	
	
	
	
	
	
}
