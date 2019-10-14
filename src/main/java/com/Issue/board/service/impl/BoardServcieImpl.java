package com.Issue.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Issue.board.entity.Board;
import com.Issue.board.repository.BoardRepository;
import com.Issue.board.service.BoardService;
@Service("Boardservice")
public class BoardServcieImpl implements BoardService{

	@Autowired
	BoardRepository Boardrepository;
	
	@Override
	public List<Board> findAllbyTag(String tag) {
	
		return Boardrepository.findAllByTag(tag);
	}

	@Override
	public Boolean InsertOne(Board data) {
		
		
		return true;
	}

	@Override
	public Boolean isDuplicate(Board data) {
		return null;
	}


}
