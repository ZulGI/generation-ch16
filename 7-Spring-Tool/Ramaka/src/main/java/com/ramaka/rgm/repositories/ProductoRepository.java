package com.ramaka.rgm.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramaka.rgm.models.ProductoModel;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoModel, Long> {
	public abstract ArrayList<ProductoModel> findById(Integer id_productos);
	
	ProductoModel findByNombre(String nombre);
}