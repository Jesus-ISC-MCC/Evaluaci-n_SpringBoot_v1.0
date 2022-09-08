/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.mcc.servicio;

import java.util.List;
import mx.com.mcc.dao.DatosUsuariosDAO;
import mx.com.mcc.domain.DatosUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Jesus
 */
@Service
public class DatosUsuariosServiceImpl implements DatosUsuariosService{
    
    @Autowired
    private DatosUsuariosDAO datosUsuariosDao;

    @Override
    @Transactional(readOnly = true)
    public List<DatosUsuarios> listarDatosUsuarios() {
        return (List<DatosUsuarios>) datosUsuariosDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(DatosUsuarios datosUsuarios) {
        datosUsuariosDao.save(datosUsuarios);
    }

    @Override
    @Transactional
    public void eliminar(DatosUsuarios datosUsuarios) {
        datosUsuariosDao.delete(datosUsuarios);
    }

    @Override
    @Transactional(readOnly = true)
    public DatosUsuarios encontrarUsu(DatosUsuarios datosUsuarios) {
        return datosUsuariosDao.findById(datosUsuarios.getIdusuario()).orElse(null);
    }
    
}
