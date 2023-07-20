/**
 * 
 */
package com.ata.interview.CodeEvaluation.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author yehtut
 *
 */
@Entity
@Table(name = "jobdata")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JobData {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Time_stamp")
	private String timestamp = null;
	
	private String employer = null;
	
	private String location = null;
	
	@Column(name = "Job_Title")
	private String jobTitle = null;
	
	@Column(name = "Years_at_Employer")
	private Double yearAtEmployer = null;
	
	@Column(name = "Years_of_Experience")
	private Double yearOfExperience = null;
	
	private Double salary = null;
	
	@Column(name = "Signing_Bonus")
	private Double singingBonus = null;
	
	@Column(name = "Annual_Bonus")
	private Double annualBonus = null;
	
	@Column(name = "Annual_Stock_Bonus")
	private Double annualStockBonus = null;
	
	private String gender = null;
	
	@Column(name = "Additional_Comments")
	private String comments = null;

	/**
	 * 
	 */
	public JobData() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param timestamp
	 * @param employer
	 * @param location
	 * @param jobTitle
	 * @param yearAtEmployer
	 * @param yearOfExperience
	 * @param salary
	 * @param singingBonus
	 * @param annualBonus
	 * @param annualStockBonus
	 * @param gender
	 * @param comments
	 */
	public JobData(Long id, String timestamp, String employer, String location, String jobTitle, Double yearAtEmployer,
			Double yearOfExperience, Double salary, Double singingBonus, Double annualBonus, Double annualStockBonus,
			String gender, String comments) {
		super();
		this.id = id;
		this.timestamp = timestamp;
		this.employer = employer;
		this.location = location;
		this.jobTitle = jobTitle;
		this.yearAtEmployer = yearAtEmployer;
		this.yearOfExperience = yearOfExperience;
		this.salary = salary;
		this.singingBonus = singingBonus;
		this.annualBonus = annualBonus;
		this.annualStockBonus = annualStockBonus;
		this.gender = gender;
		this.comments = comments;
	}

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
