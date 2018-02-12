package com.esmond.board.command;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.esmond.board.dao.BDao;
import com.esmond.board.dto.BDto;

@Service
public class BListCommand implements BCommand {
	
	@Inject
	private BDao dao;

	@Override
	public void execute(Model model) {
		
		List<BDto> dtos = dao.selectPost();
		
		model.addAttribute("list", dtos);
	}

}
