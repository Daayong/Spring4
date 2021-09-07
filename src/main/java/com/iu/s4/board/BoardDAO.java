package com.iu.s4.board;

import java.util.List;

import com.iu.s4.util.Pager;

public interface BoardDAO {

	//전체 갯수 
	public abstract Long getCount(Pager pager) throws Exception;
	
	//List
	public abstract List<BoardDTO> getList(Pager pager) throws Exception;
	
	//상세
	public abstract BoardDTO getSelect(BoardDTO boardDTO) throws Exception; 
	
	//글쓰기 
	public abstract int setInsert(BoardDTO boardDTO) throws Exception;
	
	//글삭제 
	public abstract int setDelete(BoardDTO boardDTO) throws Exception;
	
	//글수정 
	public abstract int setUpdate(BoardDTO boardDTO) throws Exception;
	
	
}
