package org.spring.fitnesstracker.model;

public class GoalReport {
	
	private int goalMinutes;
	private int exerciseMinutes;
	private String exerciseActivity;
	
	public GoalReport(int goalMinutes, int exerciseMinutes, String exerciseActivity) {
		super();
		this.goalMinutes = goalMinutes;
		this.exerciseMinutes = exerciseMinutes;
		this.exerciseActivity = exerciseActivity;
	}

	public String getExerciseActivity() {
		return exerciseActivity;
	}
	public int getExerciseMinutes() {
		return exerciseMinutes;
	}
	public int getGoalMinutes() {
		return goalMinutes;
	}
	public void setExerciseActivity(String exerciseActivity) {
		this.exerciseActivity = exerciseActivity;
	}
	public void setExerciseMinutes(int exerciseMinutes) {
		this.exerciseMinutes = exerciseMinutes;
	}
	public void setGoalMinutes(int goalMinutes) {
		this.goalMinutes = goalMinutes;
	}
	
	

}
