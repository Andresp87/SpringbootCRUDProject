/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.HelloWorld;

import com.example.HelloWorld.DAO.ClienteDAO;
import com.example.HelloWorld.pojo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


/**
 *
 * @author Andrés Patiño
 */

@Controller
public class ControllerInicio {
    
    @Autowired
    private ClienteDAO clienteDao;
    
    @GetMapping("/")
    public String start(){
        return "index";
    }
    
    @GetMapping("/login")
    public String logIn(){
        return "login";
    }
    
    @GetMapping("/loginadmin")
    public String logInAdmin(Model model){
        var clientes = clienteDao.findAll();
        model.addAttribute("clientes", clientes);
        return "loginadmin";
    }
    
    @GetMapping("/crear")
    public String crear() {
        return "crear";
    }
    
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Cliente cliente){
        clienteDao.save(cliente);
        return "redirect:/loginadmin";
    }
    
    @GetMapping("/editar/{idcliente}")
    public String editar(@PathVariable("idcliente") Integer idcliente, Model model){
        
        var cliente = clienteDao.findById(idcliente);
        model.addAttribute("clientes", cliente);
        return "modificar";
    }
    
    @GetMapping("/eliminar/{idcliente}")
        public String eliminar(@PathVariable("idcliente") Integer idcliente){
        
        clienteDao.deleteById(idcliente);
        return "redirect:/loginadmin";
    }
    
   
    
}
