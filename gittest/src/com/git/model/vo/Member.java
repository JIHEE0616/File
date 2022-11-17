package com.git.model.vo;

public class Member {
	private String memberID;
	private String memberPwd;
	private String MemberName;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Member(String memberID, String memberPwd, String memberName) {
		super();
		this.memberID = memberID;
		this.memberPwd = memberPwd;
		this.MemberName = memberName;
	}
	

	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberName() {
		return MemberName;
	}

	public void setMemberName(String memberName) {
		this.MemberName = memberName;
	}
	
	
}
