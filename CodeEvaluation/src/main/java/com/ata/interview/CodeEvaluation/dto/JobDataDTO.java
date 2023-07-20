/**
 * 
 */
package com.ata.interview.CodeEvaluation.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author yehtu
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JobDataDTO {

	private Long id;
	
	private String timestamp = null;
	
	private String employer = null;
	
	private String location = null;
	
	private String jobTitle = null;
	
	private Double yearAtEmployer = null;
	
	private Double yearOfExperience = null;
	
	private Double salary = null;
	
	private Double singingBonus = null;
	
	private Double annualBonus = null;
	
	private Double annualStockBonus = null;
	
	private String gender = null;
	
	private String comments = null;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the employer
	 */
	public String getEmployer() {
		return employer;
	}

	/**
	 * @param employer the employer to set
	 */
	public void setEmployer(String employer) {
		this.employer = employer;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * @param jobTitle the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * @return the yearAtEmployer
	 */
	public Double getYearAtEmployer() {
		return yearAtEmployer;
	}

	/**
	 * @param yearAtEmployer the yearAtEmployer to set
	 */
	public void setYearAtEmployer(Double yearAtEmployer) {
		this.yearAtEmployer = yearAtEmployer;
	}

	/**
	 * @return the yearOfExperience
	 */
	public Double getYearOfExperience() {
		return yearOfExperience;
	}

	/**
	 * @param yearOfExperience the yearOfExperience to set
	 */
	public void setYearOfExperience(Double yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	/**
	 * @return the singingBonus
	 */
	public Double getSingingBonus() {
		return singingBonus;
	}

	/**
	 * @param singingBonus the singingBonus to set
	 */
	public void setSingingBonus(Double singingBonus) {
		this.singingBonus = singingBonus;
	}

	/**
	 * @return the annualBonus
	 */
	public Double getAnnualBonus() {
		return annualBonus;
	}

	/**
	 * @param annualBonus the annualBonus to set
	 */
	public void setAnnualBonus(Double annualBonus) {
		this.annualBonus = annualBonus;
	}

	/**
	 * @return the annualStockBonus
	 */
	public Double getAnnualStockBonus() {
		return annualStockBonus;
	}

	/**
	 * @param annualStockBonus the annualStockBonus to set
	 */
	public void setAnnualStockBonus(Double annualStockBonus) {
		this.annualStockBonus = annualStockBonus;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
}
