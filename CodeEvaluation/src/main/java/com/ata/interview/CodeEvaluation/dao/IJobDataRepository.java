package com.ata.interview.CodeEvaluation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.ata.interview.CodeEvaluation.models.JobData;

public interface IJobDataRepository extends JpaRepository<JobData, Long>, JpaSpecificationExecutor<JobData> {
	
}
