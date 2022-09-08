/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.mcc.dao;

import mx.com.mcc.domain.DatosUsuarios;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Jesus
 */
public interface DatosUsuariosDAO extends CrudRepository<DatosUsuarios, Long>{
    
}
