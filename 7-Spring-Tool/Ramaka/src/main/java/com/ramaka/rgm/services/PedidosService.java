package com.ramaka.rgm.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramaka.rgm.models.PedidosModel;
import com.ramaka.rgm.repositories.PedidosRepository;

@Service
public class PedidosService {
	@Autowired
	PedidosRepository pedidosRepository;
	
	public ArrayList<PedidosModel> obtenerPedidos(){
		return (ArrayList<PedidosModel>) pedidosRepository.findAll();
    }
	
	//obtener usuario por id
	public Optional<PedidosModel> obtenerPedidos(Long id) {
		return pedidosRepository.findById(id);
		
	}
	
	public PedidosModel guardarPedidos(PedidosModel pedidosModel){
        return pedidosRepository.save(pedidosModel);
    }

	
	// eliminar pedidos
	public void eliminar(Long id) {
		pedidosRepository.deleteById(id);	
	}

	//actualizar pedidos
	public PedidosModel actualizar(PedidosModel pedidosModel) {
		return pedidosRepository.save(pedidosModel);
	}

}
