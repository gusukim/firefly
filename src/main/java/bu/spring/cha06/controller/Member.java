package bu.spring.cha06.controller;


import java.io.Serializable;
import java.util.Date;

public class Member implements Serializable {
	private String	userid;		//
	private String	password;	//
	private String	name;	//
	private char	gender;	//
	private Date	birthday;	//
	private String	email;	//
	private String	mobile;	//
	private String	phone;	//
	private String	zipcode;	//
	private String	address1;	//
	private String	address2;	//
	private int		userLevel;	//
	private Date	joinDate;	//
	 
	public Member() {}
	
	
	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getZipcode() {
		return zipcode;
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}


	public String getAddress1() {
		return address1;
	}


	public void setAddress1(String address1) {
		this.address1 = address1;
	}


	public String getAddress2() {
		return address2;
	}


	public void setAddress2(String address2) {
		this.address2 = address2;
	}


	public int getUserLevel() {
		return userLevel;
	}


	public void setUserLevel(int userLevel) {
		this.userLevel = userLevel;
	}


	public Date getJoinDate() {
		return joinDate;
	}


	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public String toString() {
		return "Member [userid=" + userid + ", password=" + password
				+ ", name=" + name + ", gender=" + gender + ", birthday="
				+ birthday + ", email=" + email + ", mobile=" + mobile
				+ ", phone=" + phone + ", zipcode=" + zipcode + ", address1="
				+ address1 + ", address2=" + address2 + ", userLevel="
				+ userLevel + ", joinDate=" + joinDate + "]";
	}
}
