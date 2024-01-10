package com.hibernate.manytomanyrelation.Many_To_Many_You1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	
	@Id
	private int eId;
	private String eName;
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	@Override
	public String toString() {
		return "Emp [eId=" + eId + ", eName=" + eName + "]";
	}
	
	
	

}
