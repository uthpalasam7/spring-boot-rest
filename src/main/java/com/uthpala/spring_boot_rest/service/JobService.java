package com.uthpala.spring_boot_rest.service;

import com.uthpala.spring_boot_rest.model.JobPost;
import com.uthpala.spring_boot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class JobService {
	@Autowired
	public JobRepo repo;
	
	
	
	//method to return all JobPosts
	public List<JobPost> getAllJobs() {
		return repo.getAllJobs();

		
	}
	
	
	
	

	// ***************************************************************************


	
	
	
	// method to add a jobPost
	public void addJob(JobPost jobPost) {
		 repo.addJob(jobPost);
	
	}





	public JobPost getJob(int postId) {
		
		return repo.getJob(postId);
	}





	public void updateJob(JobPost jobPost) {
	repo.updateJob(jobPost);
		
	}





	public void deleteJob(int postId) {
		repo.deleteJob(postId);
		
	}

	
}
