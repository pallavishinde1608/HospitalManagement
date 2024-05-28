package org.hospital.admin.model;

public class Billmodel {
	@Override
	public String toString() {
		return "Billmodel [pid=" + pid + ", date=" + date + ", time=" + time + ", doctorfee=" + doctorfee
				+ ", roomcost=" + roomcost + ", total=" + total + ", billId=" + billId + "]";
	}
	private int pid;
	private String date;
	private String time;
	private int doctorfee;
	private int roomcost;
	private int total;
	private int billId;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getDoctorfee() {
		return doctorfee;
	}
	public void setDoctorfee(int doctorfee) {
		this.doctorfee = doctorfee;
	}
	public int getRoomcost() {
		return roomcost;
	}
	public void setRoomcost(int roomcost) {
		this.roomcost = roomcost;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	

}
