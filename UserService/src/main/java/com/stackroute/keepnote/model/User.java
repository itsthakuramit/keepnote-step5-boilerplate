package com.stackroute.keepnote.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/*
 * Please note that this class is annotated with @Document annotation
 * @Document identifies a domain object to be persisted to MongoDB.
 *  */

@Document
public class User {

	/*
	 * This class should have five fields (userId,userName,
	 * userPassword,userMobile,userAddedDate). Out of these five fields, the field
	 * userId should be annotated with @Id (This annotation explicitly specifies the document
	 * identifier). This class should also contain the getters and setters for the
	 * fields, along with the no-arg , parameterized constructor and toString
	 * method.The value of userAddedDate should not be accepted from the user but
	 * should be always initialized with the system date.
	 */
	
	@Id
	private String userId;
	private String userName;
	private String userPassword;
	private String userMobile;
	private Date userAddeDate;
	
	public User() {
		super();
	}
	
	
	public User(String string, String string1, String string2, String string3, Date date) {
		userId=string;
		userName=string1;
		userPassword=string2;
		userMobile=string3;
		userAddeDate=date;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String string) {
		userId=string;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String string) {
		userName=string;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String string) {
		userPassword=string;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String string) {
		userMobile=string;
	}
	
	public Date getUserAddedDate() {
		return userAddeDate;
	}

	public void setUserAddedDate(Date date) {
		userAddeDate=date;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userMobile="
				+ userMobile + ", userAddeDate=" + userAddeDate + "]";
	}

	 
}
