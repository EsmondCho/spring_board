package com.esmond.board.dto;

public class BDto {

	int sid;
	String title;
	String content;
	String writer;
	
	public BDto() {}
	
	public BDto(int sid, String title, String content, String writer) {
		this.sid = sid;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
}
