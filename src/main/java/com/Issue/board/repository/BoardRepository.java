package com.Issue.board.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Issue.board.entity.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long>{
	List<Board> findAllByTag(String Tag);
	@SuppressWarnings("unchecked")
	Board saveAndFlush(Board board);
}
