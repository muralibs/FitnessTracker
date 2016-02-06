package org.spring.fitnesstracker.service;

import java.util.List;

import org.spring.fitnesstracker.model.Goal;
import org.spring.fitnesstracker.model.GoalReport;
import org.spring.fitnesstracker.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service ("goalService")
public class GoalServiceImpl implements GoalService {

	@Autowired
	private GoalRepository goalRepository;
	
	@Transactional
	public Goal save(Goal goal) {
		return goalRepository.save(goal);
	}

	public List<Goal> findAllGoals() {
		return goalRepository.findAll();
	}

	public List<GoalReport> findAllGoalReports() {
		return goalRepository.findAllGoalReports();
	}

}
