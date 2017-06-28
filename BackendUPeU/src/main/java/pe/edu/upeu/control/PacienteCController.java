
package pe.edu.upeu.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import pe.edu.upeu.model.Paciente;
import pe.edu.upeu.service.PacienteServis;

@Controller
@RequestMapping("/paciente")
public class PacienteCController {
    @Autowired
    PacienteServis service;	
    @Autowired
    MessageSource messageSource;     

    @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
    public ModelAndView listPaciente(ModelMap model) {
        List<Paciente> lista=service.listarEntidad();
        Map<String, Object> modelo=new HashMap<String, Object> ();
        modelo.put("ListaPaciente", lista);
        modelo.put("mensaje", "Reporte de Pacientes");                    
        return new ModelAndView("paciente/mainPaciente", modelo);
    }        
    

    @RequestMapping(value = "buscarPaciente", method = RequestMethod.POST)
    public  ModelAndView buscarPaciente(HttpServletRequest r) {
        String dato=r.getParameter("dato")==null ? "":r.getParameter("dato");
        List<Paciente> lista=service.listarEntidadNombre(dato);            
        Map<String, Object> modelo=new HashMap<String, Object> ();
        modelo.put("ListaPaciente", lista);
       return new ModelAndView("paciente/mainPaciente",modelo);
    } 
    
    @RequestMapping(value = "eliminarPaciente", method = RequestMethod.GET)
    public  ModelAndView eliminarPaciente(HttpServletRequest r) {
        int idEntidad=Integer.parseInt(r.getParameter("id"));
        service.eliminarEntidadId(idEntidad);
        System.out.println("si llego al metodo");
        return new ModelAndView(new RedirectView("paciente/list"));
    }    
}
