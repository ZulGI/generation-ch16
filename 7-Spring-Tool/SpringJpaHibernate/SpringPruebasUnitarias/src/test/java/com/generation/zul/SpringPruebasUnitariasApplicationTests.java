package com.generation.zul;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;


import com.generation.zul.Models.UsuarioModel;
import com.generation.zul.Repositories.UsuarioRepository;

@SpringBootTest
class SpringPruebasUnitariasApplicationTests {

	@Autowired 
	private UsuarioRepository usuariorepository;
	
	@Test
	void crearUsuarioTest() {
		
		UsuarioModel usuariomodelo = new UsuarioModel();
		
		usuariomodelo.setId(2);
		usuariomodelo.setNombre("Zul");
		usuariomodelo.setClave("4321");
		
		UsuarioModel r = usuariorepository.save(usuariomodelo);
		
		assertTrue(r.getClave().equalsIgnoreCase(usuariomodelo.getClave()));
		
		System.out.println(usuariomodelo.getNombre());

	}

}
