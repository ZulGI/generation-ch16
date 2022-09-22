package com.ramaka.rgm.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramaka.rgm.models.PedidosModel;
import com.ramaka.rgm.services.PedidosService;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {
	@Autowired
	private PedidosService pedidosService;
	
	// obtener todos los posts
	@GetMapping() // http://localhost:8080/pedidos
	public ArrayList<PedidosModel> obtenerPedidos() {
		return pedidosService.obtenerPedidos();
	}

	@GetMapping("/{id}") // http://localhost:8080/pedidos/1
	public PedidosModel getPost(@PathVariable Long id) {
		return pedidosService.obtenerPedidos(id);
	}

	@PostMapping() // http://localhost:8080/posts
	public PedidosModel guardarPedidos(@RequestBody PedidosModel pedidosModel) {
		return pedidosService.guardarPedidos(pedidosModel);
	}

	// Editar pedido
	@PutMapping("/actualizar") // http://localhost:8080/pedidos/actualizar
	public PedidosModel update(@RequestBody PedidosModel pedidosModel) {
		return pedidosService.actualizar(pedidosModel);
	}

	// Eliminar pedido
	@DeleteMapping("/eliminar/{id}") // http://localhost:8080/pedidos/eliminar/1
	public void eliminar(@PathVariable Long id) {
		pedidosService.eliminar(id);
	}

}
