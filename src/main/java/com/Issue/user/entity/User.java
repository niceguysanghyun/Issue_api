package com.Issue.user.entity;

import javax.persistence.Entity;
import com.Issue.board.entity.*;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Table(name="tb_user_info")
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@Column(name ="id")
	private String id;
	
	@Column(name ="name")
	private String name;
	
	
	@Column(name ="password",nullable=false)
	private String password;
	
	@Column(name ="email")
	private String email;
	
	
}
