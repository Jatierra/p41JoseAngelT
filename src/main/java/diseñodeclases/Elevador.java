/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package diseñodeclases;

import java.time.LocalDate;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author jatierra
 */
public class Elevador {

    private String numeroSerie = generadorNumeroSerie();
    private int capacidadMaximaPersonas = limitePersonas();
    private double pesoMaximo = limitePeso();
    private LocalDate fechaFabricacion;
    private LocalDate fechaUltimaRevision;

    public static String generadorNumeroSerie() {
        String numSerie = "";

        numSerie = RandomStringUtils.randomNumeric(8);

        return numSerie;
    }

    public static int limitePersonas() {

        int cantidadPersonas = 0;

        if (cantidadPersonas < 0 || cantidadPersonas > 10) {
        }
        return cantidadPersonas;

    }
    
    public static double limitePeso(){
        
       double pesoMax = 0;
       
       if (pesoMax<0||pesoMax>800);
        
        
        return pesoMax;
        
        
        
        
    }

}

