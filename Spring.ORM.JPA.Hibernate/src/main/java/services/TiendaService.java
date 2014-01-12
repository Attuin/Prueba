package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daos.interfaces.TiendaDAO;

import beans.Tienda;

@Service
public class TiendaService {

	@Autowired
	TiendaDAO tiendaDAO;
	
	public List<Tienda> getAllTienda(){
		
		List<Tienda> lstTienda = tiendaDAO.getAllTienda();
		
		return(lstTienda);
	}
	
}
