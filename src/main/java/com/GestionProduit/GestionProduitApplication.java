package com.GestionProduit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.GestionProduit.dao.ProduitRepoitory;
import com.GestionProduit.entities.Produit;


@SpringBootApplication
public class GestionProduitApplication implements CommandLineRunner {
@Autowired
private ProduitRepoitory ProduitRepoitory;
@Autowired
private RepositoryRestConfiguration  restConfiguration;
	public static void main(String[] args)  {
		ApplicationContext cxt=SpringApplication.run(GestionProduitApplication.class, args);
		ProduitRepoitory bdDemandeur=cxt.getBean(ProduitRepoitory.class);
		bdDemandeur.findAll().forEach(p->{
			System.out.println(p.toString());});
	}
@Override
	public void run(String... args) throws Exception {
	restConfiguration.exposeIdsFor(Produit.class);
	}

}
