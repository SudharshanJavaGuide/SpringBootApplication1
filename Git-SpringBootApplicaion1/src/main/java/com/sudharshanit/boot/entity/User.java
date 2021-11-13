package com.sudharshanit.boot.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class User {

	private Integer userId;
	private String userName;
	private String userEmail;
	private String userAddress;
	private Long userNumber;
}
