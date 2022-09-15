package com.generation.zul.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.generation.zul.models.UsuarioModels;
import com.generation.zul.services.UsuarioServices;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE,
        RequestMethod.PUT })

public class UsuarioController {
	@Autowired
	UsuarioServices usuarioService;
	@GetMapping()
	public ArrayList<UsuarioModels> obtenerUsuarios(){
        return usuarioService.obtenerusuarios();
    }
	@PostMapping()
	public UsuarioModels guardarUsuario(@RequestBody UsuarioModels usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }
	@GetMapping( path = "/{id}")
	public Optional<UsuarioModels> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return this.usuarioService.obtenerPorId(id);
    }
	@GetMapping("/query")
	public ArrayList<UsuarioModels> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad){
        return this.usuarioService.obtenerPorPrioridad(prioridad);
    }
	@DeleteMapping( path = "/{id}")
	public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }
    }






}
