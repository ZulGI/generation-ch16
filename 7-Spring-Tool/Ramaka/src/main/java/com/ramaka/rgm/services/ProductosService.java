package com.ramaka.rgm.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ramaka.rgm.models.ProductoModel;
import com.ramaka.rgm.repositories.ProductoRepository;

public class ProductosService {
	@Autowired
	private ProductoRepository productosRepository;

	public ArrayList<ProductoModel> obtenerProductos(){
		return (ArrayList<ProductoModel>) productosRepository.findAll();
    }
	
	//obtener usuario por id
	public Optional<ProductoModel> obtenerProductos(Long id) {
		return productosRepository.findById(id);
	}
	
	public ProductoModel guardarProductos(ProductoModel productosModel){
        return productosRepository.save(productosModel);
    }

	
	// eliminar
	public void eliminar(Long id) {
		productosRepository.deleteById(id);	
	}

	//actualizar
	public ProductoModel actualizar(ProductoModel productosModel) {
		return productosRepository.save(productosModel);
	}

}
