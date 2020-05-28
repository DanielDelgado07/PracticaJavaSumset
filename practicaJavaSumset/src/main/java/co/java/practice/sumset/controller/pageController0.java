package co.java.practice.sumset.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*pagina que se encarga de iniciar la pagina web para iniciar la interaccion
 * */

@Controller
public class pageController0 {
	/*
	 * se crear el metodo de bienvenida para la primera vista de la pagina inicial
	 * 
	 */
	
	@RequestMapping//Encargado de mapear cual es el archivo paginaBienvenida
	public String  generarPagina() {
		return "paginaBienvenida";
	}
	
}
