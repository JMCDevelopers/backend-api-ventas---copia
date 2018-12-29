package com.jmc.backend.ventas.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jmc.backend.ventas.apirest.models.dao.IClienteDao;
import com.jmc.backend.ventas.apirest.models.entity.Cliente;

@Service
public class ClienteServiceImplement implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;
	
	
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteDao.findAll();
	}


	@Override
	@Transactional(readOnly=true)
	public Cliente findById(Long ID) {
		// TODO Auto-generated method stub
		return clienteDao.findById(ID).orElse(null);
	}


	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteDao.save(cliente);
	}


	@Override
	@Transactional
	public void delete(Long ID) {
		// TODO Auto-generated method stub
		clienteDao.deleteById(ID);
	}

	
}