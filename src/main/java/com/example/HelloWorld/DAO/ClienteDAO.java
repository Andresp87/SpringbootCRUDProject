/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.HelloWorld.DAO;

import com.example.HelloWorld.pojo.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Andrés Patiño
 */
public interface ClienteDAO extends CrudRepository<Cliente, Integer>{
    
    
    
}
