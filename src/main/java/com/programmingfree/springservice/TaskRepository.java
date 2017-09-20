package com.programmingfree.springservice;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TaskRepository extends CrudRepository<Task, Integer> {
	
	List<Task> findByTaskArchived(@Param("archivedfalse") int taskArchivedFalse);
	List<Task> findByTaskStatus(@Param("status") String taskStatus);
	List<Task> findByTaskName(@Param("name") String taskName);
	List<Task> findById(@Param("id") int id);
	
	@Query("select t from Task t " +
	        "where t.date between :date and :enddate ")
	  List<Task> findByDate(@Param("date") String date, @Param("enddate") String enddate);

}
