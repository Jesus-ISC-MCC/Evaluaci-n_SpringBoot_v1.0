/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.mcc.web;

import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import mx.com.mcc.domain.DatosUsuarios;
import mx.com.mcc.servicio.DatosUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private DatosUsuariosService datosUsuariosService;
    
    @GetMapping("/")
    public String inicio(Model model){
        var datosUsuarios = datosUsuariosService.listarDatosUsuarios();
        log.info("Ejecutando el controlador Spring MVC");
        model.addAttribute("datosUsuarios", datosUsuarios);
        System.out.println("\n Dato de los Usuarios: " + datosUsuarios + "\n");
        return "index";
    }
    
    @GetMapping("/agregar")
    public String agregar(DatosUsuarios datosUsuarios){
        return "altausuario";
    }
    
    @PostMapping("/guardar")
    public String guardar(@Valid DatosUsuarios datosUsuarios, Errors errores){
        if(errores.hasErrors()){
            return "perfilusuario";
        }
        datosUsuariosService.guardar(datosUsuarios);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{idusuario}")
    public String editar(DatosUsuarios datosUsuarios, Model model){
        datosUsuarios = datosUsuariosService.encontrarUsu(datosUsuarios);
        model.addAttribute("datosUsuarios", datosUsuarios);
        System.out.println("\n ID de Usuarios: " + datosUsuarios + "\n");
        return "perfilusuario";
    }
    
    @GetMapping("/eliminar/{idusuario}")
    public String eliminar(DatosUsuarios datosUsuarios){
        datosUsuariosService.eliminar(datosUsuarios);
        return "redirect:/";
    }
}