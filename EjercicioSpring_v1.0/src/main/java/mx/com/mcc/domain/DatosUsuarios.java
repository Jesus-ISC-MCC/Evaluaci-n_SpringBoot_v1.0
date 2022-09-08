/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.mcc.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author Jesus
 */
@Data
@Entity
@Table(name = "datosusuarios")
public class DatosUsuarios implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idusuario;
    
    @NotEmpty
    private String nombreusuario;
    
    @NotEmpty
    @Email
    private String emailusuario;
    
    @NotEmpty
    private String generousuario;
    
    @NotEmpty
    private String statususuario;
    
    //@NotEmpty
    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private String fotoperfil;
}
