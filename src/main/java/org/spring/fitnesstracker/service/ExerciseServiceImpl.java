package org.spring.fitnesstracker.service;

import java.util.ArrayList;
import java.util.List;

import org.spring.fitnesstracker.model.Activity;
import org.spring.fitnesstracker.model.Exercise;
import org.spring.fitnesstracker.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {

	@Autowired
	private ExerciseRepository exerciseRepository;
	
	public List<Activity> findAllActivities() {
		List<Activity> activities = new ArrayList<Activity>();
			
		Activity run = new Activity();
		run.setDesc("run");
		run.setMinutes(10);
		
		activities.add(run);
		
		Activity swim = new Activity();
		
		swim.setDesc("swim");
		swim.setMinutes(20);
		
		activities.add(swim);
		
		Activity bike = new Activity();
		
		bike.setDesc("bike");
		bike.setMinutes(25);
		
		activities.add(bike);
		
		return activities;
		
		
	}

	@Transactional
	public Exercise save(Exercise exercise) {
		return exerciseRepository.save(exercise);
	}
	
	
}
