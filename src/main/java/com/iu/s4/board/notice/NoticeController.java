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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s4.board.BoardDTO;
import com.iu.s4.board.BoardFilesDTO;
import com.iu.s4.board.CommentsDTO;
import com.iu.s4.util.Pager;

import oracle.jdbc.proxy.annotation.Post;

@Controller
@RequestMapping("/notice/**")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	
	@ModelAttribute("board")
	public String getBoard() {
		return "notice";		
	}
	
	@GetMapping("getCommentList")
	public ModelAndView getCommentList(CommentsDTO commentsDTO, Pager pager)throws Exception{
		ModelAndView mv = new ModelAndView(); 
		commentsDTO.setBoard("N");
		List<CommentsDTO> ar=noticeService.getCommentList(commentsDTO,pager);
		mv.addObject("comments", ar);
		mv.addObject("pager", pager);
		mv.setViewName("common/ajaxList");
		return mv;
	}
	
	
	
	//setComment
	@PostMapping("comment")
	public ModelAndView setComment(CommentsDTO commentsDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		commentsDTO.setBoard("N");
		
		int result = noticeService.setComment(commentsDTO);
		mv.setViewName("common/ajaxResult");
		mv.addObject("result", result);
		return mv; 
	}
	
	
	
	
	
	
	@GetMapping("down")
	public ModelAndView fileDown(BoardFilesDTO boardFilesDTO)throws Exception {
		ModelAndView mv = new ModelAndView(); 
		mv.addObject("dto", boardFilesDTO);
		mv.setViewName("fileDown");
		return mv; 
	}
	
	
	
//	@RequestMapping(value="list", method=RequestMethod.GET)
	@GetMapping("list")
	public ModelAndView getList(Pager pager) throws Exception {
		
		ModelAndView mv = new ModelAndView();
	
		List<BoardDTO> ar = noticeService.getList(pager);
		mv.addObject("list", ar);
		mv.addObject("pager", pager);
		mv.setViewName("board/list");
		
		return mv;	
	}
	
	@GetMapping("select")
	public ModelAndView getSelect(BoardDTO boardDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		boardDTO=noticeService.getSelect(boardDTO);
		List<BoardFilesDTO> ar=noticeService.getFiles(boardDTO);
		//List<CommentsDTO> comments = noticeService.getCommentList();
	//	mv.addObject("comments", comments);
		//mv.addObject("fileList", ar);
		mv.addObject("dto", boardDTO);
		mv.setViewName("board/select");
		return mv; 
	}
	
	@GetMapping("insert")
	public ModelAndView setInsert() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/insert");
		return mv;
	}
	
	@PostMapping("insert")
	public ModelAndView setInsert(BoardDTO boardDTO,MultipartFile[] files) throws Exception {
		//original file name ?????? 
		for(MultipartFile muFile:files) {
			System.out.println(muFile.getOriginalFilename());
		}
		
		ModelAndView mv = new ModelAndView();
		int result=noticeService.setInsert(boardDTO,files);
		
		mv.setViewName("redirect:./list");
		return mv;
	}
	
	@GetMapping("delete")
	public ModelAndView setDelete(BoardDTO boardDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		int result=noticeService.setDelete(boardDTO);
			String message="Delete Fail";
		if(result>0) {
			message="Delete Success";
		}
		mv.addObject("url", "./list");
		mv.addObject("msg", message);
		mv.setViewName("common/result");
		return mv; 
	}
	@PostMapping("commentUpdate")
	public ModelAndView setCommentUpdate(CommentsDTO commentsDTO)throws Exception {
		ModelAndView mv = new ModelAndView();
		int result = noticeService.setCommentUpdate(commentsDTO);
		mv.setViewName("common/ajaxResult");
		mv.addObject("result",result);
		return mv; 
		
	}
	
	
	
	
	
	
	@PostMapping("commentDel")
	public ModelAndView setCommentDelete(CommentsDTO commentsDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = noticeService.setCommentDelete(commentsDTO);
		
		mv.setViewName("common/ajaxResult");
		mv.addObject("result", result);
		return mv;
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
