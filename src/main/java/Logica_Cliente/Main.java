/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.HelperImpresion;
import Logica_Negocio.Entrenador;
import Logica_Negocio.Futbolista;
import Logica_Negocio.Masajista;
import Logica_Negocio.SeleccionFutbol;
import java.util.ArrayList;

/**
 *
 * @author 1059356842
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Entrenador objentrenador = new Entrenador("1", "Vicente", "Del Bosque", 60, "284EZ89");
        Futbolista objfutbolista = new Futbolista("2", "Andres", "Iniesta", 29, "6", "Interior Derecho");
        Masajista objmasajista = new Masajista("3", "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);
       
        ArrayList<SeleccionFutbol> integrantes = new ArrayList<>();
       
        integrantes.add(objentrenador);
        integrantes.add(objfutbolista);
        integrantes.add(objmasajista);
       
        HelperImpresion.ImprimirViajeros(integrantes);
       
        System.out.println("\n"+"12 horas despues" +"\n");
       
        HelperImpresion.ImprimirConcentracion(integrantes);
    }
    
}
