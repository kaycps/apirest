package com.Cliente.WebService.Repository.ApiRest;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Cliente.WebService.Models.Cliente;
import com.Cliente.WebService.Repository.ClienteRepository;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/api")
@Api(value="API rest Cliente")
@CrossOrigin(origins="*")

public class ClienteResource {
	
	@Autowired
	ClienteRepository cr;
	
	
	@GetMapping("/clientes")
	public List<Cliente> listarClientes(){
		
		return cr.findAll();
		
	}
	
	@GetMapping("/cliente")
	public Cliente  salvarCliente(Cliente cliente) {
		return cr.save(cliente);
	}
	
}
