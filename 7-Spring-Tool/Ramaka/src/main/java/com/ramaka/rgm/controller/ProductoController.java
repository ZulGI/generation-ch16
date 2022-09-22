package com.ramaka.rgm.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ramaka.rgm.models.ProductoModel;
import com.ramaka.rgm.services.ProductosService;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	@Autowired
	ProductosService productosService;
	
	//obtener todos los usuarios
		@GetMapping() // http://localhost:8080/productos
		public ArrayList<ProductoModel> obtenerUsuarios(){
	        return productosService.obtenerProductos();
	    }
		
		@GetMapping("/{id}")  // http://localhost:8080/usuario/1
		public Optional <ProductoModel> getProducto(@PathVariable ("id") Long id) {
			return productosService.obtenerProductos(id);
		}
		
		//Buscar por ID   
		@GetMapping("/query")  // http://localhost:8080/usuario/query?prioridad=4
		public ArrayList<ProductosService> obtenerProductoPorId(@RequestParam("id") Long id){
			return this.productosService.obtenerProductos(id);
	    }

		
		@PostMapping()  // http://localhost:8080/usuario
		public ProductoModel guardarUsuario(@RequestBody ProductoModel usuario){
	        usuario.setPassword(bCryptPasswordEncoder.encode(usuario.getPassword()));
			return productoService.guardarUsuario(usuario);
	    }

		// Editar usuario
		@PutMapping("/actualizar") //http://localhost:8080/usuario/actualizar
		public ProductoModel update(@RequestBody ProductoModel usuarioModel) {
			return productoService.actualizar(usuarioModel);
		}
		
		//Eliminar usuario
		@DeleteMapping("/eliminar/{id}") //http://localhost:8080/usuario/eliminar/1
			public String eliminarPorId(@PathVariable("id") Long id){
	        boolean ok = this.productoService.eliminar(id);
	        if (ok){
	            return "Se elimin� el usuario con id " + id;
	        }else{
	            return "No pudo eliminar el usuario con id " + id;
	        }

}
