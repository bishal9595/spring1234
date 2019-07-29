package com.cg.iocdemo1;

import java.util.List;

public class SBU {

	private int sbuId;
	private String sbuName;
	private String sbuHead;
	List <Employee> empList;
	public SBU() {
		// TODO Auto-generated constructor stub
	}
	
	public SBU(int sbuId, String sbuName, String sbuHead, List<Employee> empList) {
		super();
		this.sbuId = sbuId;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
		this.empList = empList;
	}

	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	@Override
	public String toString() {
		return "SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + ", empList=" + empList + "]";
	}
	
	
}
