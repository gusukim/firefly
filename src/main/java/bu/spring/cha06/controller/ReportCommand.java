package bu.spring.cha06.controller;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class ReportCommand {
	private String studentNumber;
	private List<MultipartFile> reports;
	
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public List<MultipartFile> getReports() {
		return reports;
	}
	public void setReports(List<MultipartFile> reports) {
		this.reports = reports;
	}
	@Override
	public String toString() {
		return "ReportCommand [studentNumber=" + studentNumber + ", reports="
				+ reports + "]";
	}
	
	
}