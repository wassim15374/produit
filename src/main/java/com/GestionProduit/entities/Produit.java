package com.GestionProduit.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
@Entity @Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@RequiredArgsConstructor
public class Produit implements Serializable {
	@Column (length=50)

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
private  String designation = "";
private  double price = 0;
private  int quantite = 0;
/**
 * @return the id
 */
public Long getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(Long id) {
	this.id = id;
}
/**
 * @return the designation
 */
public String getDesignation() {
	return designation;
}
/**
 * @param designation the designation to set
 */
public void setDesignation(String designation) {
	this.designation = designation;
}
/**
 * @return the price
 */
public double getPrice() {
	return price;
}
/**
 * @param price the price to set
 */
public void setPrice(double price) {
	this.price = price;
}
/**
 * @return the quantite
 */
public int getQuantite() {
	return quantite;
}
/**
 * @param quantite the quantite to set
 */
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
@Override
public String toString() {
	return "Produit [id=" + id + ", designation=" + designation + ", price=" + price + ", quantite=" + quantite + "]";
}

}
