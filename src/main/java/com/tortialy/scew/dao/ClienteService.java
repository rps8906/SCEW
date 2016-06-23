package com.tortialy.scew.dao;

import java.util.List;

import com.tortialy.scew.data.model.Cliente;

public interface ClienteService {
	public Cliente createCliente(Cliente cliente);
	public Cliente getClienteById(Integer idCliente);
	public List<Cliente> getAllClientes();
	public Cliente updateCliente(Cliente cliente);
	public void deleteClienteById(Integer idCliente);
}
