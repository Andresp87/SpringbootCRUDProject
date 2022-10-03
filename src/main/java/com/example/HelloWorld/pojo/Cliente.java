/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.HelloWorld.pojo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author Andrés Patiño
 */

@Data
@Entity
@Table(name="cliente")
public class Cliente implements Serializable{
    
    @Id
    private Integer idcliente;
    private String nombre;
    private String apellidos;
    private String usuario;
    private String password;
    
    
}
