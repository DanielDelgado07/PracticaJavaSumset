package co.java.practice.sumset.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import co.java.practice.sumset.model.UserDTO;

/*Clase que  permite hacer la conexion con el UserDTO que esta en el modelo
 * */
@Controller
@RequestMapping("/registro")
public class UserRegisterContoller {
	
	@RequestMapping("/muestraFormularioRegistro")
	public String muestraFormularioRegistro(Model modelo) {
		UserDTO userDTO=new UserDTO();
		
		modelo.addAttribute("userDTO",userDTO);
		
		return "paginaRegistro";
				
	}

	/*Confirmación de la creación de un usuario*
	 * 
	 */
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(@ModelAttribute("useDTO") UserDTO userDTO) {
		
		return "confirmacionRegistroUsuario";
	}
	
}
