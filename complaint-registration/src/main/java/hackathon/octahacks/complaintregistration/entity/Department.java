package hackathon.octahacks.complaintregistration.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Rooms")
public class Department {
	
	@Id
	private String deparId;
	private String deparName;
	private String area;
	private List<info> complaint;
	
	public Department() {
		super();
		
	}
	
	public Department(String deparId, String deparName, String area) {
		super();
		this.deparId = deparId;
		this.deparName = deparName;
		this.area = area;
		
	}
	
	public String getdeparId() {
		return deparId;
	}
	public void setdeparId(String deparId) {
		this.deparId = deparId;
	}
	public String getdeparName() {
		return deparName;
	}
	public void setdeparName(String deparName) {
		this.deparName = deparName;
	}
	public String getarea() {
		return area;
	}
	public void setarea(String area) {
		this.area = area;
	}

	public List<info> getcomplaint() {
		return complaint;
	}

	public void setcomplaint(List<info> complaint) {
		this.complaint = complaint;
	} 
	
}
