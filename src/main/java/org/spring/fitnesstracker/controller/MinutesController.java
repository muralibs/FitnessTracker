package org.spring.fitnesstracker.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.spring.fitnesstracker.model.Activity;
import org.spring.fitnesstracker.model.Exercise;
import org.spring.fitnesstracker.model.Goal;
import org.spring.fitnesstracker.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MinutesController {

	@Autowired
	private ExerciseService exerciseService;
	
	@RequestMapping(value="/addMinutes", method= RequestMethod.GET)
	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise) {
		System.out.println("In add minutes...");
		//model.addAttribute("minutes", 10);
		
		exercise.setMinutes(10);
		return "addMinutes";
	}
	
	@RequestMapping(value="/addMinutes", method = RequestMethod.POST)
	public String updateMinutes(@Valid @ModelAttribute ("exercise") Exercise exercise, HttpSession session, BindingResult result) {
		System.out.println("In Update Minutes...");
		System.out.println("Exercised Minutes : " + exercise.getMinutes());
		if(!result.hasErrors()) {
			Goal goal = (Goal) session.getAttribute("goal");
			exercise.setGoal(goal);
			exerciseService.save(exercise);
		}
		return "addMinutes";
	}
	
	@RequestMapping(value="/activities", method= RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {
		return exerciseService.findAllActivities();
	}
}
