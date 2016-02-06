package org.spring.fitnesstracker.repository;

import java.util.List;

import org.spring.fitnesstracker.model.Goal;
import org.spring.fitnesstracker.model.GoalReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository("goalRepository")
public interface GoalRepository extends JpaRepository<Goal, Long>{

	@Query("Select new org.spring.fitnesstracker.model.GoalReport(g.minutes, e.minutes, e.activity)"
			+ " from Goal g, Exercise e WHERE g.id = e.goal.id")
	List<GoalReport> findAllGoalReports();
}
