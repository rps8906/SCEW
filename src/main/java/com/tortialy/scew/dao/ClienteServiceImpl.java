package com.tortialy.scew.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tortialy.scew.data.model.Cliente;

@Service
@Transactional
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteRepository clienteRepository;

	public Cliente createCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteRepository.save(cliente);
	}

	public Cliente getClienteById(Integer idCliente) {
		// TODO Auto-generated method stub
		Cliente clienteBuscar = clienteRepository.findOne(idCliente);
		if(!clienteBuscar.equals(null)){
			return clienteBuscar;
		}else{
			return null;
		}
	}

	public List<Cliente> getAllClientes() {
		// TODO Auto-generated method stub
		List<Cliente> clientes = clienteRepository.findAll();
		return clientes;
	}

	public Cliente updateCliente(Cliente cliente){
		// TODO Auto-generated method stub
		Cliente clienteACambiar = getClienteById(cliente.getIdCliente());
		if(clienteACambiar == null)
			return null;
		clienteACambiar.updateCliente(clienteACambiar);
		return clienteACambiar;
	}

	public void deleteClienteById(Integer idCliente) {
		// TODO Auto-generated method stub
		Cliente cliente = getClienteById(idCliente);
		clienteRepository.delete(cliente);
	}
}