package org.spring.fitnesstracker.service;

import java.util.List;

import org.spring.fitnesstracker.model.Goal;
import org.spring.fitnesstracker.model.GoalReport;

public interface GoalService {

	Goal save(Goal goal);

	List<Goal> findAllGoals();

	List<GoalReport> findAllGoalReports();
	
}
