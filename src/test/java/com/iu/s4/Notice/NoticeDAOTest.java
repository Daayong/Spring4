package com.iu.s4.Notice;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import com.iu.s4.MyJunitTest;
import com.iu.s4.notice.NoticeDAO;
import com.iu.s4.notice.NoticeDTO;
import com.iu.s4.util.Pager;

public class NoticeDAOTest extends MyJunitTest {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	//@Test
	public void getListTest(Pager pager) {
		List<NoticeDTO> ar = noticeDAO.getList(pager);
		assertNotEquals(1, ar.size());
	}
	
	//@Test
	public void getSelectTest() {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNum(1);
		noticeDTO=noticeDAO.getSelect(noticeDTO);
		System.out.println(noticeDTO.getNum());
		assertNotNull(noticeDTO);
	}
	
	//@Test
	public void setDelete() {
		int result=noticeDAO.setDelete(1L);
		assertEquals(1, result);
	}
	
	@Test
	public void setInsert() throws Exception {
		Random random = new Random();
		for(int i=0; i<200; i++) {
			NoticeDTO noticeDTO = new NoticeDTO();
			noticeDTO.setTitle("Title"+i);
			noticeDTO.setContents("Contents"+i);
			noticeDTO.setWriter("Writer"+i);
			int result=noticeDAO.setInsert(noticeDTO);
			
			if(i%10==0) {
				Thread.sleep(500);
			}
		}
		System.out.println("Finish");
	}
	
	
	

}
