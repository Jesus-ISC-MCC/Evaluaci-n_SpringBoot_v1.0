/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.mcc.servicio;

import java.util.List;
import mx.com.mcc.domain.DatosUsuarios;

/**
 *
 * @author Jesus
 */
public interface DatosUsuariosService {
    
    public List<DatosUsuarios> listarDatosUsuarios();
    
    public void guardar(DatosUsuarios datosUsuarios);
    
    public void eliminar (DatosUsuarios datosUsuarios);
    
    public DatosUsuarios encontrarUsu(DatosUsuarios datosUsuarios);
    
}
