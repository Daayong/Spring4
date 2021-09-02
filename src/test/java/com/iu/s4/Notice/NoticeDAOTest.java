package com.iu.s4.Notice;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s4.MyJunitTest;
import com.iu.s4.notice.NoticeDAO;
import com.iu.s4.notice.NoticeDTO;

public class NoticeDAOTest extends MyJunitTest {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	//@Test
	public void getListTest() {
		List<NoticeDTO> ar = noticeDAO.getList();
		assertNotEquals(1, ar.size());
	}
	
	@Test
	public void getSelectTest() {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNum(1);
		noticeDTO=noticeDAO.getSelect(noticeDTO);
		System.out.println(noticeDTO.getNum());
		assertNotNull(noticeDTO);
	}
	

}
