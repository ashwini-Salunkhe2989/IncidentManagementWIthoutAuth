package com.finleap.incidentManagement.incidentcreation.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class playground {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "equip_id")
	private Long equipid;
	
	private String type;
	private String color;
	private String location;
	
	
	@Column(name = "install_date")
	private Date install_date;


	public Long getEquipid() {
		return equipid;
	}


	public void setEquipid(Long equipid) {
		this.equipid = equipid;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Date getInstall_date() {
		return install_date;
	}


	public void setInstall_date(Date install_date) {
		this.install_date = install_date;
	}


	@Override
	public String toString() {
		return "playground [equipid=" + equipid + ", type=" + type + ", color=" + color + ", location=" + location
				+ ", install_date=" + install_date + "]";
	}

		
}
