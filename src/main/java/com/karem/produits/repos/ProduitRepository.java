package com.karem.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.karem.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
