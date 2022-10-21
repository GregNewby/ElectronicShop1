/**
 * 
 */
package com.electronicshop.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Greg N.
 * @date :
 * 
 */
@Entity
@Table(name = "purchases")
public class Purchase {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String prodname;
	private double cost;
	private LocalDate dateOfPurchase;
	private LocalDate deliveryDate;
	private String feedback;

	public Purchase() {
		super();
	}

	public Purchase(int id, String prodname, double cost, LocalDate dateOfPurchase, LocalDate deliveryDate,
			String feedback) {
		super();
		this.id = id;
		this.prodname = prodname;
		this.cost = cost;
		this.dateOfPurchase = dateOfPurchase;
		this.deliveryDate = deliveryDate;
		this.feedback = feedback;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public LocalDate getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(LocalDate dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	@Override
	public String toString() {
		return "Purchase [id=" + id + ", prodname=" + prodname + ", cost=" + cost + ", dateOfPurchase=" + dateOfPurchase
				+ ", deliveryDate=" + deliveryDate + ", feedback=" + feedback + "]";
	}

}
