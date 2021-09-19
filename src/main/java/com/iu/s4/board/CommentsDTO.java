package com.iu.s4.board;

import java.sql.Date;

public class CommentsDTO {

	private long commentsNum;
	private long num; 
	private String writer;
	private String contents; 
	public long getCommentsNum() {
		return commentsNum;
	}
	public void setCommentsNum(long commentsNum) {
		this.commentsNum = commentsNum;
	}
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getBoard() {
		return board;
	}
	public void setBoard(String board) {
		this.board = board;
	}
	private Date regDate;
	private String board; 
	
	
}
