package com.tortialy.scew.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.tortialy.scew.dao.ClienteTelefonoDao;
import com.tortialy.scew.dao.OrdenDiaDao;
import com.tortialy.scew.data.model.ClienteTelefono;
import com.tortialy.scew.data.model.OrdenDia;
import com.tortialy.scew.service.request.MessageRequest;
import com.tortialy.scew.service.response.MessageResponse;

@Component
@Transactional
public class OrdenDiaBusiness {
	
	@Autowired
	private OrdenDiaDao ordenDiaDao;
	
	@Autowired
	private ClienteTelefonoDao clienteTelefonoDao;
	
	public MessageResponse createOrdenDiaByNumTelefono(final MessageRequest messageRequest){
		ClienteTelefono clienteTelefono = clienteTelefonoDao.findByTelefono(messageRequest.getNumTelefonoCliente());
		if(clienteTelefono != null){
			OrdenDia ordenDia = new OrdenDia();
			ordenDia.setIdCliente(clienteTelefono.getCliente().getIdCliente());
			ordenDia.setCliente(clienteTelefono.getCliente());
			ordenDia.setMensaje(messageRequest.getMensaje());
			ordenDia.setFecha(messageRequest.getFecha());
			ordenDiaDao.create(ordenDia);
			return new MessageResponse(true, "Orden generada");
		}else{
			return new MessageResponse(false, "El Cliente no existe");		
		}		
	}
}
