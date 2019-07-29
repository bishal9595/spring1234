package com.cg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.entities.Trainee;
import com.cg.services.TraineeService;

@Controller
@RequestMapping("/")
public class HomeController {

	
	@Autowired  private TraineeService service;
	
	@GetMapping
	public String home(Model model)
	{
		model.addAttribute("msg", "Welcome to Login Page");
		
		return "home";
	} 
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(Model model,@RequestParam("q") String query,@RequestParam("p") String query1)
	{
		if(query.equalsIgnoreCase("admin")&&query1.equalsIgnoreCase("admin"))
		{
			return "All";
			
		}
		else
		{
			return "home";
		}
	}
//--------------------------------------------------------------------------------------------------------------------------	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String add(Model model)
	{
		return "add";
	}
	
	@RequestMapping(value="/addtrainee",method=RequestMethod.POST)
	public String addtrainee(Model model,@ModelAttribute("trainee") Trainee trainee)
	{
		model.addAttribute("msg1","Trainee added");
		service.create(trainee);
		return "success";
	}
//---------------------------------------------------------------------------------------------------------------------------	

	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String delete(Model model)
	{
		return "delete";
	}
	
	@RequestMapping(value="/deletetrainee",method=RequestMethod.POST)
	public String deletetrainee(Model model,@RequestParam("traineeId") int id)
	{
		model.addAttribute("list",this.service.find(id));
		
		return "delete";
	}
	@RequestMapping(value="/deletetrainee/{id}",method=RequestMethod.POST)
	public String delete(Model model,@PathVariable("id") int id)
	{
		service.delete(id);
		model.addAttribute("msg1","Trainee Deleted");
		return "success";
	}

//---------------------------------------------------------------------------------------------------------------------------

	@RequestMapping(value="/modify",method=RequestMethod.GET)
	public String modify(Model model)
	{
		return "modify";
	}
	
	@RequestMapping(value="/modifytrainee",method=RequestMethod.POST)
	public String modifytrainee(Model model,@RequestParam("traineeId") int id)
	{
		model.addAttribute("list",this.service.find(id));
		
		return "modify";
	}
	@RequestMapping(value="/modifytraineee",method=RequestMethod.POST)
	public String modify(Model model,@ModelAttribute("trainee") Trainee trainee)
	{
		service.modify(trainee);
		model.addAttribute("msg1","Trainee Updated");
		return "success";
	}
//-------------------------------------------------------------------------------------------------------------------------
	
	@RequestMapping(value="/get",method=RequestMethod.GET)
	public String retrieve(Model model) {
	
		return "get";
	}
	@RequestMapping(value="/gettrainee",method=RequestMethod.POST)
	public String retrievebyid(Model model,@RequestParam("retrieveId") int id ) {
		
		model.addAttribute("list",this.service.find(id));
		
		return "get";
	}

//-----------------------------------------------------------------------------------------------------------------------------
@RequestMapping(value="/getall",method=RequestMethod.GET)
public String retrieveall(Model model) {
	
	model.addAttribute("list", this.service.getAll());
	
	return "getall";
}}