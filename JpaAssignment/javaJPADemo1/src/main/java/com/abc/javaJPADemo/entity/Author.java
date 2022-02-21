package com.abc.javaJPADemo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table
public class Author {
@Id
@Column(name = "authorId")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int authorId;



@Column(name = "firstname", length = 40)
private String firstName;



@Column(name = "middlename", length = 40)
private String middleName;



@Column(name = "lastname", length = 40)
private String lastName;



private String phoneNo;



public int getAuthorId() {
return authorId;
}



public void setAuthorId(int authorId) {
this.authorId = authorId;
}



public String getFirstName() {
return firstName;
}



public void setFirstName(String firstName) {
this.firstName = firstName;
}



public String getMiddleName() {
return middleName;
}

public void setMiddleName(String middleName) {
this.middleName = middleName;
}



public String getLastName() {
return lastName;
}



public void setLastName(String lastName) {
this.lastName = lastName;
}



public String getPhoneNo() {
return phoneNo;
}



public void setPhoneNo(String phoneNo) {
this.phoneNo = phoneNo;
}
}