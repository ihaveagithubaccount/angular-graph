package com.programmingfree.springservice;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface WeatherRepository extends CrudRepository<Weather, Integer> {
	
	//List<Task> findByTaskArchived(@Param("archivedfalse") int taskArchivedFalse);
//	List<Task> findByTaskStatus(@Param("status") String taskStatus);
//	List<Task> findByTaskName(@Param("name") String taskName);
	List<Weather> findByYear(@Param("year") int year);
	//List<Weather> findByHour(@Param("hour") String hour);

	@Query("select w from Weather w " +
	        "where w.hour = :hour ")
	  List<Weather> findByHour(@Param("hour") String hour);
	
	//i limit to 17
	
	
	 
}
