package com.iu.s4.util;

public class Pager {
	//파라미터 처리 
	private Long pn; 
	//한페이지에 출력할 갯수(글의 갯수)
	private Long perPage; 
	
	private Long startRow; 
	
	private Long lastRow; 
	
	private Long startNum; 
	
	private Long lastNum; 
	
	private Long totalPage; 
	//한페이지에 출력할 pn의 갯수(페이지 버튼) 
	private Long perBlock; 
	
	private String kind; 
	private String search;
	
	//-- rownum 계산 
	public void makeRow() {
		this.startRow=(this.getPn()-1)*this.getPerPage()+1;
		this.lastRow=this.getPn()*this.getPerPage();
	}
	//startNUm lastNum jsp번호 출력 
	public void makeNum(Long totalCount) {
		//1. totalCount : 전체 글의 갯수 
		//2. totalCount로 totalPage 계산 : 전체 페이지 갯수 
		totalPage=totalCount/this.getPerPage();
		if(totalCount%this.getPerPage() != 0) {
			totalPage++;
		}
		
		//totalpage로 totalBlock 구하기 
		Long totalBlock=totalPage/this.getPerBlock();
		if(totalPage%this.getPerBlock() != 0) {
			totalBlock++;
		}
		//totalPage이상 넘어가지 않게 제한해주기
		if(totalPage < this.getPn()) {
			this.setPn(totalPage);
		}
		
		//pn으로 curBlock(현재 블럭번호) 구하기
		Long curBlock=this.getPn()/this.getPerBlock();
		if(this.getPn()%this.getPerBlock() !=0) {
			curBlock++;
		}
		
		//curBlock으로 시작번호와 마지막 번호 구하기 
		this.startNum=(curBlock-1)*this.getPerBlock()+1;
		this.lastNum=curBlock*this.getPerBlock();
		
		if(curBlock==totalBlock) {
			this.lastNum=totalPage;
		}
		
	}
	
	public Long getPn() {
		if(this.pn==null || this.pn<1) {
			this.pn=1L;
			//pn은 Long 타입으로, 레퍼런스 타입임. 레퍼런스타입은 기본값이 Null값이 들어간다. 
			// pn 파라미터 값에 음수 혹은 null 값이 들어가면 에러가 나거나 이상한 페이지가 나올수 있으니
			// 그런경우에는 무조건 1번 페이지로 갈것 
		}
		
		return pn;
	}
	public void setPn(Long pn) {
		this.pn = pn;
	}
	public Long getPerPage() {
		//다시 잘 이해해보기
		if(this.perPage==null || this.perPage<1) {
			this.perPage=10L;
			//getPn과 같은 이유로 null 혹은 1보다 작을 경우를 처리해주기 
		}
		return perPage;
	}
	
	public void setPerPage(Long perPage) {
		this.perPage = perPage;
	}
	public Long getStartRow() {
		return startRow;
	}
	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}
	public Long getLastRow() {
		return lastRow;
	}
	public void setLastRow(Long lastRow) {
		this.lastRow = lastRow;
	}
	public Long getStartNum() {
		return startNum;
	}
	public void setStartNum(Long startNum) {
		this.startNum = startNum;
	}
	public Long getLastNum() {
		return lastNum;
	}
	public void setLastNum(Long lastNum) {
		this.lastNum = lastNum;
	}
	public Long getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getSearch() {
		if(this.search==null) {
			this.search="";
			//검색창에 아무것도 안써있으면 null값이 들어가서 에러나니까 빈 문자열 넣어주기 
		}
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	} 
	
	public Long getPerBlock() {
		this.perBlock=5L;
		
		return perBlock;
	}

	public void setPerBlock(Long perBlock) {
		this.perBlock = perBlock;
	}
	
	
}
