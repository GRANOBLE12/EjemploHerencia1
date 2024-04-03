/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1059356842
 */
public class SeleccionFutbol {
    protected String id;
    protected String Nombres;
    protected String Apellidos;
    protected int edad;

public SeleccionFutbol(){
    
}    

    public SeleccionFutbol(String id, String Nombres, String Apellidos, int edad) {
        this.id = id;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void Concentrarse()
    {
        System.out.println("En concentracion!");
    }
    public void Viajar()
    {
        System.out.println("Viajando!");
    }
}
