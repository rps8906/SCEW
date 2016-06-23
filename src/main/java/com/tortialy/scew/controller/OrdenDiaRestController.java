package com.tortialy.scew.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tortialy.scew.business.OrdenDiaBusiness;
import com.tortialy.scew.service.request.MessageRequest;
import com.tortialy.scew.service.response.MessageResponse;

@RestController
public class OrdenDiaRestController {
	
	@Autowired
	private OrdenDiaBusiness ordenDiaBusiness;
	
	@RequestMapping(value ="/createOrdenDiaByNumTelefono", method=RequestMethod.POST)
	public  MessageResponse createOrdenDiaByNumTelefono(@ModelAttribute MessageRequest messageRequest){
		return ordenDiaBusiness.createOrdenDiaByNumTelefono(messageRequest);
	}

}
