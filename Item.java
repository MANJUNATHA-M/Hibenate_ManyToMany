package com.hibernate.manytomanyyou.Many_To_Many_You;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Item {
	@Id
	private int iId;
	private int iPrice;

	@ManyToMany
	private	List<Cart> cartlist=new ArrayList<Cart>();

	public int getiId() {
		return iId;
	}

	public void setiId(int iId) {
		this.iId = iId;
	}

	public int getiPrice() {
		return iPrice;
	}

	public void setiPrice(int iPrice) {
		this.iPrice = iPrice;
	}

	public List<Cart> getCartlist() {
		return cartlist;
	}

	public void setCartlist(List<Cart> cartlist) {
		this.cartlist = cartlist;
	}

	@Override
	public String toString() {
		return "Item [iId=" + iId + ", iPrice=" + iPrice + ", cartlist=" + cartlist + "]";
	}
	
	




}
