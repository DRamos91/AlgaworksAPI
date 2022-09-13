package com.daniel.algaworks.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.algaworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List <Cliente> listar(){
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		return Arrays.asList(cliente1);
	}

}
