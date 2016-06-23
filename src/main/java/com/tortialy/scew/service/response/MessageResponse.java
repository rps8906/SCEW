package com.tortialy.scew.service.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageResponse {
	
	private boolean tipo;
	private String mensaje;
	
	public MessageResponse(){
		
	}
	
	public MessageResponse(boolean tipo, String mensaje){
		super();
		this.tipo = tipo;
		this.mensaje = mensaje;
	}

}