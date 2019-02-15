package com.gestion.compte.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gestion.compte.entites.Client;

@Service
public class ClientMockService implements ICRUDService<Client, Long> {

	List<Client> clients;
	
	public ClientMockService() {
		super();
		clients = new ArrayList<Client>();
		clients.add(new Client(1,"Dillo","Alpha yankhouba","771542523"));
		clients.add(new Client(2,"Dillo","yankhouba","771542523"));
		clients.add(new Client(3,"Diallo","Alpha","771542523"));
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Client> getAll() {
		// TODO Auto-generated method stub
		return clients;
	}

	@Override
	public void add(Client entity) {
		// TODO Auto-generated method stub
		this.clients.add(entity);
		
	}

	@Override
	public void update(Client entity) {
		// TODO Auto-generated method stub
		this.clients.remove(entity);
		this.clients.add(entity);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		for(int i=0;i<this.clients.size();i++)
		{
			if(this.clients.get(i).getId()==id)
			{
				this.clients.remove(i); break;
			}
		}
	}

}
