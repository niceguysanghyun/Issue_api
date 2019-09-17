package com.Issue.board.service;

import java.util.List;


import com.Issue.board.entity.Board;
public interface BoardService {
	public List<Board> findAllbyTag(String tag);
}
