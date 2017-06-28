package pe.edu.upeu.service;

import java.util.List;
import pe.edu.upeu.model.Paciente;

/**
 *
 * @author David
 */
public interface PacienteServis {
    public List<    Paciente> listarEntidad();
    public Paciente buscarEntidadId(int id);
    public void guardarEntidad(Paciente entidad);
    public void eliminarEntidadId(int id);
    public void modificarEntidadId(Paciente entidad);  
    public List<Paciente> listarEntidadNombre(String dato);
    
}
