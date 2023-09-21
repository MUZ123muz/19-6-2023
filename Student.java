package com.amber;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;


@Entity
public class Student {

	
	@Id
	@GeneratedValue(generator="sd_seq")
	@SequenceGenerator(name="sd_seq",initialValue=111,allocationSize=1)
	private int sid;
	private String sname;
	private String saddress;
	@OneToOne(mappedBy="sd",cascade=CascadeType.ALL)
	private Laptop lap;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, String saddress, Laptop lap) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddress = saddress;
		this.lap = lap;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public Laptop getLap() {
		return lap;
	}
	public void setLap(Laptop lap) {
		this.lap = lap;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", lap=" + lap + "]";
	}
	
	

	
	

	
}
