package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.from.EchoForm;

@Controller
@RequestMapping(value="echo")
public class Echo {
	@Autowired EchoForm echoform;

	@RequestMapping(method=RequestMethod.GET)
	public String viewInput(Model model){
//		EchoForm form = new EchoForm();
		model.addAttribute("echoform",echoform);
		return "echo/input";
	}

	@RequestMapping(method=RequestMethod.POST)
	public String echo(@ModelAttribute EchoForm echoform,Model m){
		m.addAttribute("echoform",echoform);
		return "echo/output";
	}

}
