/**
 * 
 */
package com.ata.interview.CodeEvaluation.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ata.interview.CodeEvaluation.dto.JobDataDTO;
import com.ata.interview.CodeEvaluation.models.JobData;
import com.ata.interview.CodeEvaluation.services.JobDataService;
import jakarta.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yehtu
 *
 */
@RestController
@RequestMapping("/SalaryDS")
public class JobDataController {

	@Autowired
	private JobDataService jobDataService;

	@GetMapping("/jobdata")
	public List<JobDataDTO> getJobData(@RequestParam(value = "fields", required = false) List<String> fields,
			@RequestParam(value = "sort_fields", required = false) List<String> sortFields,
			@RequestParam(value = "attributes", required = false) List<Double> attributes,
			@RequestParam(value = "sort_type", defaultValue = "ASC") String sortType) {

		Specification<JobData> spec = (root, query, criteriaBuilder) -> {
			List<Predicate> predicates = new ArrayList<>();

			return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
		};

		// Get JobData by filter fields
		List<JobData> filteredData = jobDataService.getAllJobData(spec);

		if (fields != null && !fields.isEmpty()) {
			filteredData = filterFields(filteredData, fields);
		}

		if (sortFields != null && !sortFields.isEmpty()) {
			filteredData.sort(getComparator(sortFields, sortType));
		}

		return filteredData.stream().map(this::convertToDTO).collect(Collectors.toList());
	}

	@GetMapping("/jobdata/benefit")
	public List<JobDataDTO> getJobDataBySalary(@RequestParam(value = "salary", required = false) Double minSalary,
			@RequestParam(value = "singingBonus", required = false) Double sBonus,
			@RequestParam(value = "annualBonus", required = false) Double aBonus,
			@RequestParam(value = "annualStockBonus", required = false) Double asBonus,
			@RequestParam(value = "compare_type", defaultValue = "GT") String cType) {

		Specification<JobData> spec = (root, query, criteriaBuilder) -> {
			List<Predicate> predicates = new ArrayList<>();

			if (cType.equalsIgnoreCase("GT")) {
				if (minSalary != null) {
					predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.get("salary"), minSalary));
				}

				if (sBonus != null) {
					predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.get("singingBonus"), sBonus));
				}
				if (aBonus != null) {
					predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.get("annualBonus"), aBonus));
				}
				if (asBonus != null) {
					predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.get("annualStockBonus"), asBonus));
				}
			} else {
				if (minSalary != null) {
					predicates.add(criteriaBuilder.lessThanOrEqualTo(root.get("salary"), minSalary));
				}

				if (sBonus != null) {
					predicates.add(criteriaBuilder.lessThanOrEqualTo(root.get("singingBonus"), sBonus));
				}
				if (aBonus != null) {
					predicates.add(criteriaBuilder.lessThanOrEqualTo(root.get("annualBonus"), aBonus));
				}
				if (asBonus != null) {
					predicates.add(criteriaBuilder.lessThanOrEqualTo(root.get("annualStockBonus"), asBonus));
				}
			}
			return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
		};

		List<JobData> filteredData = jobDataService.getAllJobData(spec);

		return filteredData.stream().map(this::convertToDTO).collect(Collectors.toList());
	}

	private JobDataDTO convertToDTO(JobData jobData) {
		JobDataDTO dto = new JobDataDTO();
		dto.setId(jobData.getId());
		dto.setTimestamp(jobData.getTimestamp());
		dto.setEmployer(jobData.getEmployer());
		dto.setLocation(jobData.getLocation());
		dto.setYearAtEmployer(jobData.getYearAtEmployer());
		dto.setYearOfExperience(jobData.getYearOfExperience());
		dto.setSalary(jobData.getSalary());
		dto.setJobTitle(jobData.getJobTitle());
		dto.setSingingBonus(jobData.getSingingBonus());
		dto.setAnnualBonus(jobData.getAnnualBonus());
		dto.setAnnualStockBonus(jobData.getAnnualStockBonus());
		dto.setGender(jobData.getGender());
		dto.setComments(jobData.getComments());
		return dto;
	}
	
	private List<JobData> filterFields(List<JobData> data, List<String> fields) {
		// Create new JobData objects with only the specified fields
		// Return the filtered data
		List<JobData> filteredList = new ArrayList<>();
		for (JobData jobData : data) {
			JobData filteredJobData = new JobData();
			if (fields.contains("id")) {
				filteredJobData.setId(jobData.getId());
			}
			if (fields.contains("Time_stamp")) {
				filteredJobData.setTimestamp(jobData.getTimestamp());
			}
			if (fields.contains("employer")) {
				filteredJobData.setEmployer(jobData.getEmployer());
			}
			if (fields.contains("location")) {
				filteredJobData.setLocation(jobData.getLocation());
			}
			if (fields.contains("job_title")) {
				filteredJobData.setJobTitle(jobData.getJobTitle());
			}
			if (fields.contains("years_at_employer")) {
				filteredJobData.setYearAtEmployer(jobData.getYearAtEmployer());
			}
			if (fields.contains("years_of_experience")) {
				filteredJobData.setYearOfExperience(jobData.getYearOfExperience());
			}
			if (fields.contains("salary")) {
				filteredJobData.setSalary(jobData.getSalary());
			}
			if (fields.contains("signing_bonus")) {
				filteredJobData.setSingingBonus(jobData.getSingingBonus());
			}
			if (fields.contains("annual_bonus")) {
				filteredJobData.setAnnualBonus(jobData.getAnnualBonus());
			}
			if (fields.contains("annual_stock_value")) {
				filteredJobData.setAnnualStockBonus(jobData.getAnnualStockBonus());
			}
			if (fields.contains("gender")) {
				filteredJobData.setGender(jobData.getGender());
			}
			if (fields.contains("additional_comments")) {
				filteredJobData.setGender(jobData.getGender());
			}
			filteredList.add(filteredJobData);
		}
		return filteredList;

	}

	private Comparator<JobData> getComparator(List<String> sortFields, String sortType) {
		Comparator<JobData> returnList = (jobData1, jobData2) -> {
			int comparison = 0;
			for (String sortField : sortFields) {
				switch (sortField.toLowerCase()) {
				case "id":
					comparison = compareLongs(jobData1.getId(), jobData2.getId());
					break;
				case "time_stamp":
					comparison = compareStrings(jobData1.getTimestamp(), jobData2.getTimestamp());
					break;
				case "employer":
					comparison = compareStrings(jobData1.getEmployer(), jobData2.getEmployer());
					break;
				case "location":
					comparison = compareStrings(jobData1.getLocation(), jobData2.getLocation());
					break;
				case "job_title":
					comparison = compareStrings(jobData1.getJobTitle(), jobData2.getJobTitle());
					break;
				case "years_at_employer":
					comparison = compareDoubles(jobData1.getYearAtEmployer(), jobData2.getYearAtEmployer());
					break;
				case "years_of_experience":
					comparison = compareDoubles(jobData1.getYearOfExperience(), jobData2.getYearOfExperience());
					break;
				case "salary":
					comparison = compareDoubles(jobData1.getSalary(), jobData2.getSalary());
					break;
				case "signing_bonus":
					comparison = compareDoubles(jobData1.getSingingBonus(), jobData2.getSingingBonus());
					break;
				case "annual_bonus":
					comparison = compareDoubles(jobData1.getAnnualBonus(), jobData2.getAnnualBonus());
					break;
				case "annual_stock_bonus":
					comparison = compareDoubles(jobData1.getAnnualStockBonus(), jobData2.getAnnualStockBonus());
					break;
				case "gender":
					comparison = compareStrings(jobData1.getGender(), jobData2.getGender());
					break;
				default:
					// If sortField is not recognized, consider it as equal (no sorting)
					comparison = 0;
				}
				if (comparison != 0) {
					break;
				}
			}
			return sortType.equalsIgnoreCase("DESC") ? -comparison : comparison;
		};
		return returnList;
	}

	private int compareStrings(String str1, String str2) {
		if (str1 == null && str2 == null) {
			return 0;
		} else if (str1 == null) {
			return -1;
		} else if (str2 == null) {
			return 1;
		}
		return str1.compareToIgnoreCase(str2);
	}

	private int compareDoubles(Double d1, Double d2) {
		if (d1 == null && d2 == null) {
			return 0;
		} else if (d1 == null) {
			return -1;
		} else if (d2 == null) {
			return 1;
		}
		return Double.compare(d1, d2);
	}

	private int compareLongs(Long d1, Long d2) {
		if (d1 == null && d2 == null) {
			return 0;
		} else if (d1 == null) {
			return -1;
		} else if (d2 == null) {
			return 1;
		}
		return Double.compare(d1, d2);
	}
}
