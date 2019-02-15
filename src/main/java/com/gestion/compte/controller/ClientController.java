package com.gestion.compte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.compte.entites.Client;
import com.gestion.compte.service.ICRUDService;

@RestController
@RequestMapping("/api/client")
@CrossOrigin
public class ClientController {

	@Autowired
	private ICRUDService<Client, Long> clientService;
	
	@GetMapping
	public List<Client> getAll()
	{
		return this.clientService.getAll();
	}
	
	@PostMapping
	public void add(@RequestBody Client cl)
	{
		System.out.println(" ****** client dangular "+ cl.getNom());
		this.clientService.add(cl);;
	}
	
	@PutMapping
	public void update(@RequestBody Client cl)
	{
		this.clientService.update(cl);;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id)
	{
		System.out.println("suppression du client " + id);
		this.clientService.delete(id);
	}
}