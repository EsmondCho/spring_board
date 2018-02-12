package com.esmond.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.esmond.board.command.BCommand;
import com.esmond.board.command.BListCommand;
import com.esmond.board.command.BWriteCommand;

@Controller
public class BController {
	
	BCommand command;
	
	@Autowired BListCommand blc;
	@Autowired BWriteCommand bwc;
	
	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("----------list()----------");

		blc.execute(model);
		
		return "list";
	}

	@RequestMapping("/write_view")
	public String write_view() {
		return "write_view";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/write")
	public String write(HttpServletRequest request, Model model) {
		System.out.println("----------write()----------");
		
		model.addAttribute("request",  request);
		bwc.execute(model);
		
		return "redirect:list";
	}
	
	
	
}
