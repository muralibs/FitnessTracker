package org.spring.fitnesstracker.repository;

import org.spring.fitnesstracker.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("exerciseRepository")
public interface ExerciseRepository extends JpaRepository<Exercise, Long>{

}
