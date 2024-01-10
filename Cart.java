package com.hibernate.manytomanyyou.Many_To_Many_You;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Cart {
	@Id
	private int cId;
	private int cNo;

	@ManyToMany(mappedBy = "cartlist", fetch = FetchType.EAGER)
	private List<Item> itemlist=new ArrayList<Item>();

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public int getcNo() {
		return cNo;
	}

	public void setcNo(int cNo) {
		this.cNo = cNo;
	}

	public List<Item> getItemlist() {
		return itemlist;
	}

	public void setItemlist(List<Item> itemlist) {
		this.itemlist = itemlist;
	}

	@Override
	public String toString() {
		return "Cart [cId=" + cId + ", cNo=" + cNo + ", itemlist=" + itemlist + "]";
	}




}
