package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.TraineeService;
import com.example.demo.Trainee.TraineeEntity;

@RestController
public class TraineeController {
	@Autowired
	TraineeService ts;
	@RequestMapping(value="/pages", method=RequestMethod.POST)
	public String showUser( @ModelAttribute TraineeEntity trainee,BindingResult bindingresult,Model model)
	{
	if(bindingresult.hasErrors())
	return"pages";
	else
	{
			/*
			 * model.addAttribute("traineeid",trainee.getTraineeid());
			 * model.addAttribute("traineename", trainee.getTraineename());
			 * model.addAttribute("traineedomain", trainee.getTraineedomain());
			 * model.addAttribute("traineelocation", trainee.getTraineelocation());
			 */
	ts.saveTraineeEntity(trainee);
	return "Success";
	   
	}
}
}
