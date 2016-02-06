package org.spring.fitnesstracker.service;

import java.util.List;

import org.spring.fitnesstracker.model.Activity;
import org.spring.fitnesstracker.model.Exercise;

public interface ExerciseService {

	List<Activity> findAllActivities();

	Exercise save(Exercise exercise);

}