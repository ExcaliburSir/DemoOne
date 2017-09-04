package com.wuly.ssm.entity;

/**
 * 用户
 * @author wly
 */
public class Merchant {
	
	private Integer mid;
	
	private String name;
	
	private String realname;
	
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	
	@Override
	public String toString() {
		return "Merchant [mid=" + mid + ", name=" + name + ", realname="
				+ realname + "]";
	}
	
}
