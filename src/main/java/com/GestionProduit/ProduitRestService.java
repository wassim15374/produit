package com.GestionProduit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GestionProduit.dao.ProduitRepoitory;
import com.GestionProduit.entities.Produit;

import jakarta.websocket.server.PathParam;

@RestController
public class ProduitRestService {
	@Autowired
private ProduitRepoitory ProduitRepoitory;
	@GetMapping(value = "/listproduits")
	public List<Produit>listprduit(){
		return ProduitRepoitory.findAll();
	}
	@GetMapping(value = "/listproduits/{id}")
	public Produit listprduit(@PathVariable(name="id") Long id){
		return ProduitRepoitory.findById(id).get();
	}
	@PutMapping(value = "/listproduits/{id}")
	public Produit update(@PathVariable(name="id") Long id ,@RequestBody Produit p){
		p.setId(id);
		return ProduitRepoitory.save(p);
	}
	@PostMapping(value = "/listproduits")
	public Produit post(@RequestBody Produit p){
		
		return ProduitRepoitory.save(p);
	}
	@DeleteMapping(value = "/listproduits/{id}")
	public void supprimer(@PathVariable(name="id") Long id){
		
		ProduitRepoitory.deleteById(id);
	}
}
