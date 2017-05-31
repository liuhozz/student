package com.heima.enty;

public class Words {

	private int id;
	private String words;
	public Words() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Words(int id, String words) {
		super();
		this.id = id;
		this.words = words;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWords() {
		return words;
	}
	public void setWords(String words) {
		this.words = words;
	}
	@Override
	public String toString() {
		return "Words [id=" + id + ", words=" + words + "]";
	}
	
	
}
