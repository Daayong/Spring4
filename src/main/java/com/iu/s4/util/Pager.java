package com.iu.s4.util;

public class Pager {

	private Long pn; 
	private Long perPage; 
	private Long startRow; 
	private Long lastRow; 
	private Long startNum; 
	private Long lastNum; 
	private Long totalPage; 
	
	private String kind; 
	private String search;
	
	
	public void makeRow() {
		this.startRow=(this.getPn()-1)*this.getPerPage()+1;
		this.lastRow=this.getPn()*this.getPerPage();
	}
	
	public void makeNum(Long totalCount) {
		//totalPage 구하기 
		//Long totalCount=212L;
		
		totalPage=totalCount/this.getPerPage();
		if(totalCount%this.getPerPage() != 0) {
			totalPage++;
		}
		
		//totalBlock 구하기 
		Long totalBlock=totalPage/5;
		if(totalPage%5 != 0) {
			totalBlock++;
		}
		//totalPage이상 넘어가지 않게 제한해주기
		if(totalPage < this.getPn()) {
			this.setPn(totalPage);
		}
		
		//pn으로 curBlock 구하기
		Long curBlock=this.getPn()/5;
		if(this.getPn()%5 !=0) {
			curBlock++;
		}
		
		//curBlock으로 시작번호와 마지막 번호 구하기 
		this.startNum=(curBlock-1)*5+1;
		this.lastNum=curBlock*5;
		
		if(curBlock==totalBlock) {
			this.lastNum=totalPage;
		}
		
	}
	
	public Long getPn() {
		if(this.pn==null || this.pn<0) {
			this.pn=1L;
			
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
		if(this.perPage==null || this.perPage==0) {
			this.perPage=10L;
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
	
}
