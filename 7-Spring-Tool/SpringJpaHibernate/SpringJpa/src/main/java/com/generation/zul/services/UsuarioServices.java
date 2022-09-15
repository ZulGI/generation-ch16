package com.generation.zul.services;

import org.springframework.stereotype.Service;

import com.generation.zul.models.UsuarioModels;
import com.generation.zul.repositories.UsuarioRepositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@Service

public class UsuarioServices {
	@Autowired
	UsuarioRepositories usuariorepository;
	
	public ArrayList<UsuarioModels> obtenerusuarios(){
		return (ArrayList<UsuarioModels>)usuariorepository.findAll();
    }
	//Guardar usuarios
	public UsuarioModels guardarUsuario(UsuarioModels usuario){
        return usuariorepository.save(usuario);
    }
	//Obtener por ID
	public Optional<UsuarioModels> obtenerPorId(Long id){
        return usuariorepository.findById(id);
    }
	//Obtener usuario por prioridad
	public ArrayList<UsuarioModels>  obtenerPorPrioridad(Integer prioridad) {
        return usuariorepository.findByPrioridad(prioridad);
    }
	//Eliminar usuario
	public boolean eliminarUsuario(Long id) {
        try{
            usuariorepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }



	}


