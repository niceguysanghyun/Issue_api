package com.Issue.board.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Issue.auth.service.JwtService;
import com.Issue.board.service.BoardService;
import com.Issue.user.entity.User;
import java.util.List;

import com.Issue.board.entity.Board;
@RestController
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private BoardService Boardservice;
	
	@PostMapping("test")
	public List<Board> test(@RequestParam String tag) {
		return Boardservice.findAllbyTag(tag);
	}
}
