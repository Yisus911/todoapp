package com.spring.todoapp.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.spring.todoapp.persistence.entity.Task;
import com.spring.todoapp.persistence.entity.TaskStatus;

public interface TaskRepository extends JpaRepository<Task, Long>{
	
	public List<Task> findAllByTaskStatus(TaskStatus status);
	
	@Modifying
	@Query(value = "Update task set finished = true Where id=:id", nativeQuery = true)
	public void markTaskAsFinished(@Param("id") Long id);
	
	
}
