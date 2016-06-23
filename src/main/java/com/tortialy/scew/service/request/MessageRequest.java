package com.tortialy.scew.service.request;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageRequest {
	
	private String numTelefonoCliente;
	private String mensaje;
	private Date fecha;
	
	public MessageRequest(){
		
	}
	
	public MessageRequest(String numTelefonoCliente, String mensaje, Date fecha){
		this.numTelefonoCliente = numTelefonoCliente;
		this.mensaje = mensaje;
		this.fecha = fecha;
	}
}