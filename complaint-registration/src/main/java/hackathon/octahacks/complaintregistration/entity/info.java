package hackathon.octahacks.complaintregistration.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.data.annotation.Transient;

public class info {

	private String comp;
	private String userName;
	
	private String roomId;
	@Transient
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();

	String t = formatter.format(date);
	private String timeStamp = t;
	
	public String getcomp() {
		return comp;
	}
	public void setcomp(String comp) {
		this.comp = comp;
	}
	public info() {
		super();
		
	}
	public info(String comp, String userName, String roomId, SimpleDateFormat formatter, Date date, String t,
			String timeStamp) {
		super();
		this.comp = comp;
		this.userName = userName;
		this.setRoomId(roomId);
		this.formatter = formatter;
		this.date = date;
		this.t = t;
		this.setTimeStamp(timeStamp);
	}
	
	
	public String getuserName() {
		return userName;
	}
	public void setuserName(String userName) {
		this.userName = userName;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
	
}
