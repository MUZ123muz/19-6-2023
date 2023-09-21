package com.amber;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="LapTop_Table")
public class Laptop {

	
	@Id
	@GeneratedValue(generator="lap_seq")
	@SequenceGenerator(name="lap_seq",initialValue=111,allocationSize=1)
	private int lapid;
	private String name;
	private String brand;
	@OneToOne
	@JoinColumn(name="sid")
	private Student sd;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int lapid, String name, String brand, Student sd) {
		super();
		this.lapid = lapid;
		this.name = name;
		this.brand = brand;
		this.sd = sd;
	}
	public int getLapid() {
		return lapid;
	}
	public void setLapid(int lapid) {
		this.lapid = lapid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Student getSd() {
		return sd;
	}
	public void setSd(Student sd) {
		this.sd = sd;
	}
	@Override
	public String toString() {
		return "Laptop [lapid=" + lapid + ", name=" + name + ", brand=" + brand + ", sd=" + sd + "]";
	}
	



	
	
	
}
