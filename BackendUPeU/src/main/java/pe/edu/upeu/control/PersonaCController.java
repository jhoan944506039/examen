
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
import pe.edu.upeu.model.Persona;
import pe.edu.upeu.service.PersonaServis;

@Controller
@RequestMapping("/persona")
public class PersonaCController {
    @Autowired
    PersonaServis service;	
    @Autowired
    MessageSource messageSource;     

    @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
    public ModelAndView listPersona(ModelMap model) {
        List<Persona> lista=service.listarEntidad();
        Map<String, Object> modelo=new HashMap<String, Object> ();
        modelo.put("ListaPersona", lista);
        modelo.put("mensaje", "Reporte de Personas");                    
        return new ModelAndView("persona/mainPersona", modelo);
    }        
    

    @RequestMapping(value = "buscarPersona", method = RequestMethod.POST)
    public  ModelAndView buscarPersona(HttpServletRequest r) {
        String dato=r.getParameter("dato")==null ? "":r.getParameter("dato");
        List<Persona> lista=service.listarEntidadNombre(dato);            
        Map<String, Object> modelo=new HashMap<String, Object> ();
        modelo.put("ListaPersona", lista);
       return new ModelAndView("persona/mainPersona",modelo);
    } 
    
    @RequestMapping(value = "eliminarPersona", method = RequestMethod.GET)
    public  ModelAndView eliminarPersona(HttpServletRequest r) {
        int idEntidad=Integer.parseInt(r.getParameter("id"));
        service.eliminarEntidadId(idEntidad);
        System.out.println("si llego al metodo");
        return new ModelAndView(new RedirectView("persona/list"));
    }    
}

    
    
    