package com.cg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.entities.Trainee;
import com.cg.services.TraineeService;
import java.util.*;

@RestController
public class TraineeController {
	@Autowired
	private TraineeService service;

	@GetMapping("/")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}

	@PostMapping("/login")
	public ModelAndView login_validate(@RequestParam("username") String user, @RequestParam("password") String pass) {
		boolean check = service.authenticate(user, pass);
		if (check) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("menu");
			return mv;
		} else {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("login");
			mv.addObject("check", "Login Unsuccessful");
			return mv;
		}
	}

	@GetMapping("/add")
	public ModelAndView add_page() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("add");
		return mv;
	}

	@PostMapping("/add-trainee")
	public ModelAndView add(@RequestParam("traineeId") Integer id, @RequestParam("traineeName") String name,
			@RequestParam("traineeDomain") String domain, @RequestParam("traineeLocation") String location) {
		Trainee t = new Trainee(id, name, domain, location);
		service.add(t);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("add");
		mv.addObject("result", "Record Added");
		return mv;
	}

	@GetMapping("/delete")
	public ModelAndView del_page() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("delete");
		return mv;
	}

	@PostMapping("/delete-trainee")
	public ModelAndView delete(@RequestParam("traineeId") Integer id) {

		Trainee del_trainee = service.findById(id);
		System.out.println(del_trainee);
		if (del_trainee != null) {
			Map<String, String> delMap = new HashMap<String, String>();
			delMap.put("del_traineeId", del_trainee.getTraineeId().toString());
			delMap.put("del_traineeName", del_trainee.getTraineeName());
			delMap.put("del_traineeDomain", del_trainee.getTraineeDomain());
			delMap.put("del_traineeLocation", del_trainee.getTraineeLocation());
			ModelAndView mv = new ModelAndView();
			mv.setViewName("delete");
			mv.addAllObjects(delMap);
			System.out.println("In Delete");
			return mv;
		} else {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("delete");
			mv.addObject("check_record", "Record Not Found");
			return mv;
		}
	}

	@PostMapping("/delete-trainee-confirm")
	public ModelAndView deleteConfirm(@RequestParam("traineeId") Integer id) {

		service.delete(id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("delete");
		mv.addObject("del_result", "Record Deleted");
		return mv;

	}

	@GetMapping("/modify")
	public ModelAndView modify_page() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("modify");
		return mv;
	}

	@PostMapping("/modify-trainee")
	public ModelAndView modify(@RequestParam("traineeId") Integer id) {

		Trainee modify_trainee = service.findById(id);
		System.out.println(modify_trainee);
		if (modify_trainee != null) {
			Map<String, String> modifyMap = new HashMap<String, String>();
			modifyMap.put("modify_traineeId", modify_trainee.getTraineeId().toString());
			modifyMap.put("modify_traineeName", modify_trainee.getTraineeName());
			modifyMap.put("modify_traineeDomain", modify_trainee.getTraineeDomain());
			modifyMap.put("modify_traineeLocation", modify_trainee.getTraineeLocation());
			ModelAndView mv = new ModelAndView();
			mv.setViewName("modify");
			mv.addAllObjects(modifyMap);
			System.out.println("In Modify");
			return mv;
		} else {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("modify");
			mv.addObject("check_record", "Record Not Found");
			return mv;
		}
	}

	@PostMapping("/modify-trainee-confirm")
	public ModelAndView modifyConfirm(@RequestParam("modify_traineeId") Integer id,
			@RequestParam("modify_traineeName") String name, @RequestParam("modify_traineeDomain") String domain,
			@RequestParam("modify_traineeLocation") String location) {
		Trainee modify_ob = new Trainee(id, name, domain, location);
		service.modify(modify_ob);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("modify");
		mv.addObject("modify_result", "Record Updated");
		return mv;

	}

	@GetMapping("/retrieve")
	public ModelAndView retrieve_page() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("retrieve");
		return mv;
	}

	@PostMapping("/retrieve-trainee")
	public ModelAndView retrieve(@RequestParam("traineeId") Integer id) {

		Trainee retrieve_trainee = service.findById(id);
		System.out.println(retrieve_trainee);
		if (retrieve_trainee != null) {
			Map<String, String> retrieveMap = new HashMap<String, String>();
			retrieveMap.put("retrieve_traineeId", retrieve_trainee.getTraineeId().toString());
			retrieveMap.put("retrieve_traineeName", retrieve_trainee.getTraineeName());
			retrieveMap.put("retrieve_traineeDomain", retrieve_trainee.getTraineeDomain());
			retrieveMap.put("retrieve_traineeLocation", retrieve_trainee.getTraineeLocation());
			ModelAndView mv = new ModelAndView();
			mv.setViewName("retrieve");
			mv.addAllObjects(retrieveMap);
			System.out.println("In retrieve");
			return mv;
		} else {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("retrieve");
			mv.addObject("check_record", "Record Not Found");
			return mv;
		}
	}
	
	@GetMapping("/getall")
	public ModelAndView getAllTrainees() {
		ModelAndView mv = new  ModelAndView();
		List<Trainee> list=service.getAll();
		mv.setViewName("findall");
		mv.addObject("list",list);
		return mv;
	}

}
