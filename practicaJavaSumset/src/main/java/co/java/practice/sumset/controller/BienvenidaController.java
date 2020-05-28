package co.java.practice.sumset.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BienvenidaController {
	
	
	@RequestMapping //Encargado de mapear cual es el archivo paginaBienvenida
	public String  generarPagina() {
		return "paginaBienvenida";
	}

	
}
