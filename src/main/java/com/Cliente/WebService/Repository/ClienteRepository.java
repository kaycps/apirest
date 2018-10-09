package com.Cliente.WebService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Cliente.WebService.Models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer >{
	
	

}
