/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1059356842
 */
public class Entrenador extends SeleccionFutbol {
    
    public String id_Federacion;
    
    public Entrenador(){
        
    }

    public Entrenador(String id, String Nombres, String Apellidos, int edad, String id_Federacion) {
        super(id, Nombres, Apellidos, edad);
        this.id_Federacion = id_Federacion;
    }

    public Entrenador(String id_Federacion) {
        this.id_Federacion = id_Federacion;
    }

    public String getId_Federacion() {
        return id_Federacion;
    }

    public void  DirigirPrtido()
    {
        System.out.println("Dirigiendo Partido!");
    }
    public void DirigirEntrenamiento()
    {
        System.out.println("Dirigiendo Entrenamiento!");
    }
}
