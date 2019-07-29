package com.cg.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Trainee")
public class Trainee {
	@Id
	private Integer traineeId;
	private String traineeName;
	private String traineeDomain;
	private String traineeLocation;
	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainee( Integer traineeId,String traineeName, String traineeDomain, String traineeLocation) {
		super();
		this.traineeId=traineeId;
		this.traineeName = traineeName;
		this.traineeDomain = traineeDomain;
		this.traineeLocation = traineeLocation;
	}
	public Integer getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(Integer traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getTraineeDomain() {
		return traineeDomain;
	}
	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}
	public String getTraineeLocation() {
		return traineeLocation;
	}
	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}
	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", traineeDomain=" + traineeDomain
				+ ", traineeLocation=" + traineeLocation + "]";
	}
	
}
