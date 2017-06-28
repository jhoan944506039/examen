package pe.edu.upeu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.dao.PacienteDao;
import pe.edu.upeu.model.Paciente;

/**
 *
 * @author David
 */
@Service("pacienteServis")
@Transactional
public class PacienteServisImpl implements PacienteServis{
    @Autowired
    public PacienteDao dao;
 
    @Override
    public List<Paciente> listarEntidad(){return dao.listarEntidad();}
    @Override
    public Paciente buscarEntidadId(int id) {return dao.buscarEntidadId(id);}
    @Override
    public void guardarEntidad(Paciente entidad) {dao.guardarEntidad(entidad); }  
    @Override
    public void eliminarEntidadId(int id) {dao.eliminarEntidadId(id);}    
    @Override
    public void modificarEntidadId(Paciente entidad) {dao.modificarEntidadId(entidad);}       
    @Override
    public List<Paciente> listarEntidadNombre(String dato){return dao.listarPorNombre(dato);}    
}
