package pe.edu.upeu.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.configuration.SysDataAccess;
import pe.edu.upeu.model.Paciente;

/**
 *
 * @author David
 */
@Repository("/pacienteDao")
public class PacienteDaoImpl extends SysDataAccess<Integer, Paciente> implements PacienteDao{
    @SuppressWarnings("unchecked")
    public List<Paciente> listarEntidad(){ return getListAll();}
    public Paciente buscarEntidadId(int id) {return getByKey(id);}
    public void guardarEntidad(Paciente entidad) {savev(entidad); }  
    public void eliminarEntidadId(int id) {delete(id);}    
    public void modificarEntidadId(Paciente entidad) {update(entidad);}         
    public List<Paciente> listarPorNombre(String dato){
    return (List<Paciente>)sessionFactory.getCurrentSession()
            .createQuery("select a from Paciente a where a.idPersona.dni like ? ")        
            .setString(0, "%"+dato+"%")
            .list();
    }     
}

