/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.SeleccionFutbol;
import java.util.ArrayList;

/**
 *
 * @author 1059356842
 */
public class HelperImpresion {
    
    public static void ImprimirConcentracion(ArrayList<SeleccionFutbol> integrantes)
    {
         for (int i=0; i<integrantes.size();i++) {
            System.out.print(integrantes.get(i).getNombres()+" "+integrantes.get(i).getApellidos()+" -> ");
            integrantes.get(i).Concentrarse();
        }

    }
   
      public static void ImprimirViajeros(ArrayList<SeleccionFutbol> integrantes)
    {
         for (int i=0; i<integrantes.size();i++) {
            System.out.print(integrantes.get(i).getNombres()+" "+integrantes.get(i).getApellidos()+" -> ");
            integrantes.get(i).Viajar();
        }

    }
}
