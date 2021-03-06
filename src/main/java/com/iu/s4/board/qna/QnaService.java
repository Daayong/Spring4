package com.iu.s4.board.qna;

import java.io.File;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.s4.board.BoardDTO;
import com.iu.s4.board.BoardFilesDTO;
import com.iu.s4.board.BoardService;
import com.iu.s4.util.FileManager;
import com.iu.s4.util.Pager;
@Service
public class QnaService implements BoardService {
	
	@Autowired
	private QnaDAO qnaDAO;

	@Autowired
	private ServletContext servletContext;
	
	@Autowired
	private FileManager fileManager;
	
	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		Long totalCount = qnaDAO.getCount(pager);
		pager.makeNum(totalCount);
		pager.makeRow();
		return qnaDAO.getList(pager);
	}

	@Override
	public BoardDTO getSelect(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.getSelect(boardDTO);
	}
	
	@Override
	public int setInsert(BoardDTO boardDTO,MultipartFile [] files) throws Exception {
		// TODO Auto-generated method stub
		//1.어느 폴더 
			String realPath = servletContext.getRealPath("/resources/upload/qna");
			System.out.println(realPath);
		
			File file = new File(realPath); 
			
			System.out.println("Before Num:"+boardDTO.getNum());
			
			int result = qnaDAO.setInsert(boardDTO);
			
			System.out.println("after Num:" + boardDTO.getNum());
			//max()
			
			for(MultipartFile multipartFile : files) {
			String fileName=fileManager.fileSave(multipartFile, file);
			System.out.println(fileName);
			BoardFilesDTO boardFilesDTO = new BoardFilesDTO();
			boardFilesDTO.setFileName(fileName);
			boardFilesDTO.setOriName(multipartFile.getOriginalFilename());
			boardFilesDTO.setNum(boardDTO.getNum());
			result=qnaDAO.setFile(boardFilesDTO);
			}
		return result; //noticeDAO.setInsert(boardDTO);
	}

	
	
	
	
	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int setReply(QnaDTO qnaDTO)throws Exception{
		//1. 부모의 정보를 조회 
		QnaDTO parent=(QnaDTO)qnaDAO.getSelect(qnaDTO);  //BoardDTO 대신 QnaDTO로 형변환해서 사용 
		qnaDTO.setRef(parent.getRef());
		qnaDTO.setStep(parent.getStep()+1);
		qnaDTO.setDepth(parent.getDepth()+1);
		//2. update
		int result=qnaDAO.setReplyUpdate(parent);
		
		//insert
		result=qnaDAO.setReply(qnaDTO);
		return result;
	}

}