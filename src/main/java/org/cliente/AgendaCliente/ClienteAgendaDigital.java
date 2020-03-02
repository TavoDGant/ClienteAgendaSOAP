package org.cliente.AgendaCliente;

import java.util.List;

import org.tdgames.agenda.service.Contacto;
import org.tdgames.agenda.service.ContactoService;
import org.tdgames.agenda.service.ContactoServiceImplService;

public class ClienteAgendaDigital {

	private ContactoService contactoService = new ContactoServiceImplService().getContactoServiceImplPort();
	
	public Contacto crearContacto(Contacto contacto) {
		return contactoService.crearContacto(contacto);
	}
	
	public List<Contacto> obtenerContactos(){
		return contactoService.obtenerContactos();	}
}
