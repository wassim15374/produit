package com.GestionProduit.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p1",types = Produit.class)
public interface ProduitProjection {
public double getprice();
}
