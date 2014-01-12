package daos.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import beans.Tienda;
import daos.interfaces.Dao;
import daos.interfaces.TiendaDAO;

@Repository  
public class TiendaDAOImpl implements TiendaDAO {

	@Autowired
	Dao dao;
	
	public List<Tienda> getAllTienda(){
		
		
		List<Tienda> lstTienda = dao.find(Tienda.class);  
		
//		List<Tienda> lstTienda = new ArrayList<Tienda>();
//		
//		Tienda tiendaAux = new Tienda();
//		
//		tiendaAux.setNombre("La primera tienda");
//		
//		lstTienda.add(tiendaAux);
		
		return(lstTienda);
	}
	
}
