package com.Issue.board.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="tb_board_info")
@NoArgsConstructor
@AllArgsConstructor
@IdClass(PK_Board.class)
public class Board {
	
	@Id
	@Column(name="tag")
	String TAG;
	
	@Id
	@Column(name="BOARD_NO")
	long BOARD_NO;
	
	@Column(name="REG_ID")
	String REG_ID;
	
	@Column(name="VIEW_CNT")
	int VIEW_CNT;
	
	@Column(name="TITLE")
	String TITLE;
	
	@Column(name="CONTENT")
	String CONTENT;
	
	
}
