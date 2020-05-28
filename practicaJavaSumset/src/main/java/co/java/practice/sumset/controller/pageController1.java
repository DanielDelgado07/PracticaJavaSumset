package co.java.practice.sumset.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * esta es una clase  controladora dela pages */
@Controller
public class pageController1 {
	

	@RequestMapping("/pageRegistroBiblioteca")//Hacer una petición de una URL
	public String pageRegistroBiblioteca() {//proporciona pagina biblioteca
		return "paginaRegistro";
	}

	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(HttpServletRequest request, Model modelo) {
		String nombre=request.getParameter("nombreUsuario");
		nombre+=" es el nombre del usurio ";
		
		String mensajeFinal="¿Quien es el mejor alumno?"+nombre;
		
		//agregando info al modelo
		
		modelo.addAttribute("mensajeClaro",mensajeFinal);
		
		return "pagePrincipal";
	}

//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("in EmployeeController");
//		ModelAndView mv = new ModelAndView("userList");
//		mv.addObject("userList", this.userManager.getUserList());
//		return mv;
//	}

}
