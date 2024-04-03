/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1059356842
 */
public class Futbolista extends SeleccionFutbol {
    public String Dorsal;
    public String Posicion;
    
    public Futbolista(){
        
    }

    public Futbolista(String id, String Nombres, String Apellidos, int edad, String Dorsal, String Posicion) {
        super(id, Nombres, Apellidos, edad);
        this.Dorsal = Dorsal;
        this.Posicion = Posicion;
    }

    public String getDorsal() {
        return Dorsal;
    }

    public void setDorsal(String Dorsal) {
        this.Dorsal = Dorsal;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public void JugarPartido()
    {
        System.out.println("Jugando Partido!");
    }
    public void Entrenar()
    {
        System.out.println("Entrenando!");
    }
}
