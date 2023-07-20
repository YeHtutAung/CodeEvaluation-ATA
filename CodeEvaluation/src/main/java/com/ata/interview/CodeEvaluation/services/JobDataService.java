package com.ata.interview.CodeEvaluation.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.ata.interview.CodeEvaluation.dao.IJobDataRepository;
import com.ata.interview.CodeEvaluation.models.JobData;

@Service
public class JobDataService {

	@Autowired
	private IJobDataRepository jobDataRespository;

	public List<JobData> getAllJobData() {
		List<JobData> jobDatas = jobDataRespository.findAll();

		if (jobDatas.size() > 0) {
			return jobDatas;
		} else {
			return new ArrayList<JobData>();
		}
	}

	public List<JobData> getAllJobData(Specification<JobData> spec) {
		List<JobData> jobDatas = jobDataRespository.findAll(spec);

		if (jobDatas.size() > 0) {
			return jobDatas;
		} else {
			return new ArrayList<JobData>();
		}
	}

	public List<JobData> getBySalaryGreaterThanEqual(Double minSalary) {
		List<JobData> jobDatas = jobDataRespository.findBySalaryGreaterThanEqual(minSalary);

		if (jobDatas.size() > 0) {
			return jobDatas;
		} else {
			return new ArrayList<JobData>();
		}
	}

}
