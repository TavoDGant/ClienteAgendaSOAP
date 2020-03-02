package org.cliente.AgendaCliente;

import java.util.List;

import org.tdgames.agenda.service.Contacto;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        	ClienteAgendaDigital cliente = new ClienteAgendaDigital();
        	
        	if(args[0].equals("c")) {
        		Contacto cnt = new Contacto();
        		
        		cnt.setNombre(args[1]);
        		cnt.setApellido(args[2]);
        		cnt.setCorreo(args[3]);
        		cnt.setTelefono(args[4]);
        		cliente.crearContacto(cnt);
        	} else {
        		List<Contacto> contactos = cliente.obtenerContactos();
        		
        		for(Contacto cnt : contactos) {
        			System.out.println(cnt);
        		}
        	}
    }
}
