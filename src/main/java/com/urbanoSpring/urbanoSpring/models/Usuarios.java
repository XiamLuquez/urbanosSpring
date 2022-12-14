package com.urbanoSpring.urbanoSpring.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String identificacion;
    private String nombre;
    private String username;
    private String email;
    private String direccion;
    private String telefono;
    private String tipo;
    private String password;

public Usuarios() {

    
}


public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getUsername() {
    return username;
}

public void setUsername(String username) {
    this.username = username;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getDireccion() {
    return direccion;
}

public void setDireccion(String direccion) {
    this.direccion = direccion;
}

public String getTelefono() {
    return telefono;
}

public void setTelefono(String telefono) {
    this.telefono = telefono;
}

public String getTipo() {
    return tipo;
}

public void setTipo(String tipo) {
    this.tipo = tipo;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}


public String getIdentificacion() {
    return identificacion;
}


public void setIdentificacion(String identificacion) {
    this.identificacion = identificacion;
}




}


