package co.java.practice.sumset.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * esta es una clase  controladora de los libros */
@Controller
@RequestMapping("/principal")//creación de un directorio raiz
public class pageController1 {
	

	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(@RequestParam("nombreUsuario") String nombre,Model modelo) {
		nombre+=" se concatena un mensaje a la practica ";
		
		String mensajeFinal="¿se puede?"+nombre;
		
		//agregando info al modelo
		
		modelo.addAttribute("mensajeClaro",mensajeFinal);
		
		return "pagePrincipal";
	}
	

}
