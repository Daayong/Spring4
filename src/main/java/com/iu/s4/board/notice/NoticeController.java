package com.iu.s4.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s4.board.BoardDTO;
import com.iu.s4.util.Pager;

@Controller
@RequestMapping("/notice/**")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	
	@ModelAttribute("board")
	public String getBoard() {
		return "notice";		
	}
	//getBoard는 어디에 활용할 것인가....

//	@RequestMapping(value="list", method=RequestMethod.GET)
	@GetMapping("list")
	public ModelAndView getList(Pager pager) throws Exception {
		
		ModelAndView mv = new ModelAndView();
	
		List<BoardDTO> ar = noticeService.getList(pager);
		mv.addObject("list", ar);
		mv.setViewName("board/list");
		
		return mv;	
	}
	
	@RequestMapping("select")
	public void getSelect(BoardDTO boardDTO, Model model) throws Exception {
		
		boardDTO=noticeService.getSelect(boardDTO);
		model.addAttribute("dto", boardDTO);
	}
	
	@GetMapping("insert")
	public void setInsert() {
		
	}
	
	@PostMapping("insert")
	public String setInsert(BoardDTO boardDTO) throws Exception {
		int result=noticeService.setInsert(boardDTO);
		return "redirect:./list";
	}
	
	@RequestMapping("delete")
	public String setDelete(BoardDTO boardDTO) throws Exception {
		int result=noticeService.setDelete(boardDTO);
		return "redirect:./list"; 
	}
	
	@GetMapping("update")
	public ModelAndView setUpdate(BoardDTO boardDTO) throws Exception {
		boardDTO=noticeService.getSelect(boardDTO);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("board/update");
		mv.addObject("dto", boardDTO);
		return mv; 
	}
	
	
	@PostMapping("update")
	public ModelAndView setUpdate(BoardDTO boardDTO, ModelAndView mv) throws Exception {
		int result=noticeService.setUpdate(boardDTO);
		mv.setViewName("redirect:./list");
		return mv;
	}
	
	
	
	
	
	
}
