/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1059356842
 */
public class Masajista extends SeleccionFutbol{
    public String Titulacion;
    public int Años_Experiencia;
    
   public Masajista(){
       
   }

    public Masajista(String id, String Nombres, String Apellidos, int edad,String Titulacion, int Años_Experiencia) {
        super(id, Nombres, Apellidos, edad);
        this.Titulacion = Titulacion;
        this.Años_Experiencia = Años_Experiencia;
    }

    public String getTitulacion() {
        return Titulacion;
    }

    public void setTitulacion(String Titulacion) {
        this.Titulacion = Titulacion;
    }

    public int getAños_Experiencia() {
        return Años_Experiencia;
    }

    public void setAños_Experiencia(int Años_Experiencia) {
        this.Años_Experiencia = Años_Experiencia;
    }
    
   
    
}
