package co.java.practice.sumset.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * esta es una clase  controladora dela pages */
@Controller
@RequestMapping("/principal")//creación de un directorio raiz
public class pageController1 {
	

	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(@RequestParam("nombreUsuario") String nombre,Model modelo) {
		nombre+=" es el nombre del usurio ";
		
		String mensajeFinal="¿Quien es el mejor alumno?"+nombre;
		
		//agregando info al modelo
		
		modelo.addAttribute("mensajeClaro",mensajeFinal);
		
		return "pagePrincipal";
	}
	

}
