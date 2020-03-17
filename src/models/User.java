package models;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kapx3
 */
public class User {
    
    private int id;
    private String nombre;
    private String alias;
    private int edad;
    private String colonia;
    private String calle;
    private int no_Ext;
    private String no_Int;
    private int CP;
    private int contacto;
    private String comunidad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNo_Ext() {
        return no_Ext;
    }

    public void setNo_Ext(int no_Ext) {
        this.no_Ext = no_Ext;
    }

    public String getNo_Int() {
        return no_Int;
    }

    public void setNo_Int(String no_Int) {
        this.no_Int = no_Int;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    public String getComunidad() {
        return comunidad;
    }

    public void setComunidad(String comunidad) {
        this.comunidad = comunidad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", alias=" + alias + ", edad=" + edad + ", colonia=" + colonia + ", calle=" + calle + ", no_Ext=" + no_Ext + ", no_Int=" + no_Int + ", CP=" + CP + ", contacto=" + contacto + ", comunidad=" + comunidad + '}';
    }
    
}
