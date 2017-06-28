package pe.edu.upeu.dao;

import java.util.List;
import pe.edu.upeu.model.Paciente;

/**
 *
 * @author David
 */
public interface PacienteDao {
    public List<Paciente> listarEntidad();
    public Paciente buscarEntidadId(int id);
    public void guardarEntidad(Paciente entidad);
    public void eliminarEntidadId(int id);
    public void modificarEntidadId(Paciente entidad); 
    public List<Paciente> listarPorNombre(String dato);
}
