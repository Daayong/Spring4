package com.iu.s4.member;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s4.MyJunitTest;

public class MemberDAOTest extends MyJunitTest {
	@Autowired
	private MemberDAO memberDAO;
	
	//@Test
	public void getIdCheck() throws Exception{
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("ld210dddddd");
		memberDTO=memberDAO.getIdCheck(memberDTO);
		assertNotNull(memberDTO);
	}
	
	@Test	
	public void setUpdateCheck()throws Exception{
		MemberDTO memberDTO = new MemberDTO(); 
		memberDTO.setId("dayong");
		memberDTO.setPw("dayong");
		memberDTO.setName("dayong");
		memberDTO.setPhone("0105555");
		memberDTO.setEmail("5555467@hanmail.net");
		
		int result=memberDAO.setJoin(memberDTO);
		
	}
	
	

}
