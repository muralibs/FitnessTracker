package org.spring.fitnesstracker.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.spring.fitnesstracker.model.Goal;
import org.spring.fitnesstracker.model.GoalReport;
import org.spring.fitnesstracker.service.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * 
 * @author bsmurali
 *
 */
@Controller
@SessionAttributes("goal")
public class GoalController {

	@Autowired
	private GoalService goalService;
	
	@RequestMapping(value="addGoal" , method = RequestMethod.GET)
	public String addGoal(Model model, HttpSession session) {
		Goal goal = (Goal) session.getAttribute("goal");
		if(null == goal) {
			goal = new Goal();
			goal.setMinutes(10);
		}
		model.addAttribute("goal", goal);
		return "addGoal";
	}
	
	@RequestMapping(value="addGoal", method = RequestMethod.POST)
	public String updateGoal(@Valid @ModelAttribute ("goal") Goal goal, BindingResult result) {
		System.out.println("Goal Minutes: " + goal.getMinutes());
		System.out.println("Result has errors: " + result.hasErrors());
		
		if(result.hasErrors()) {
			return "addGoal";
		} else {
			goalService.save(goal);
		}
		return "redirect:index.jsp";
	}
	
	@RequestMapping(value="getGoals", method = RequestMethod.GET)
	public String getGoals(Model model) {
		List<Goal> goals = goalService.findAllGoals();
		model.addAttribute("goals", goals);
		return "getGoals";
	}
	
	@RequestMapping(value="getGoalReports" , method = RequestMethod.GET)
	public String getGoalReports(Model model ) {
		List<GoalReport> goalReports = goalService.findAllGoalReports();
		
		model.addAttribute("goalReports", goalReports);
		
		return "getGoalReports";
	}
}
