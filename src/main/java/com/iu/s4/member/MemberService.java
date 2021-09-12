package com.iu.s4.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	@Autowired
	private MemberDAO memberDAO;
	
	public MemberDTO getIdCheck(MemberDTO memberDTO) throws Exception{
		return memberDAO.getIdCheck(memberDTO);
	}
	
	public MemberDTO getLogin(MemberDTO memberDTO)throws Exception{
		return memberDAO.getLogin(memberDTO);
	}
	
	public int setDelete(MemberDTO memberDTO)throws Exception{
		return memberDAO.setDelete(memberDTO);
	}
	
	public int setUpdate(MemberDTO memberDTO)throws Exception{
		return memberDAO.setUpdate(memberDTO);
	}
	
	public int setInsert(MemberDTO memberDTO)throws Exception{
		return memberDAO.setInsert(memberDTO);
	}
	
	public MemberDTO getSelect(MemberDTO memberDTO)throws Exception{
		return memberDAO.getSelect(memberDTO);
	}
	
	
}
