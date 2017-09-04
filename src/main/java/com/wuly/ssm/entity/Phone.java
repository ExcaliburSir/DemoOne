package com.wuly.ssm.entity;

/**
 * 手机
 * @author wly
 */
public class Phone {
	
	private Integer id;
	
	private Integer mid;
	
	private Integer phone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", mid=" + mid + ", phone=" + phone + "]";
	}
	
}
