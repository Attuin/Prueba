package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import services.TiendaService;
import beans.Tienda;

@Controller
public class TiendaController {

	@Autowired
	TiendaService tiendaService;
	
	@RequestMapping(value="/lstTiendas", method = RequestMethod.GET)
	public String listarTiendas(ModelMap model) {
 
		List<Tienda> lstTienda = tiendaService.getAllTienda();
		
		String firtTienda = null;
		
		if(lstTienda != null && lstTienda.size() != 0){
			firtTienda = lstTienda.get(0).getNombre();
		}
		
		model.addAttribute("message", firtTienda);
 
		return "tienda";
	}
	
}
