package com.cg.one.service;

public class SBUDetails {

	int sbuId;
	String sbuName;
	String sbuHead;
	
	public SBUDetails() {
		super();
	}
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	
	public void display1(){
		System.out.println("SBU Details:");
		System.out.println("-------------------------");
		System.out.println("SBU ID : "+sbuId);
		System.out.println("SBU Name : "+sbuName);
		System.out.println("SBU HEAD : "+sbuHead);
		
	}
	public SBUDetails(int sbuId, String sbuName, String sbuHead) {
		
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
	}
}
