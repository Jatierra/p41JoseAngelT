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
    private LocalDate fechaFabricacion = LocalDate.now();
    private LocalDate fechaUltimaRevision = LocalDate.now();
    private int plantaActual;
    private String estadoAscensor;
    private int plantaAMoverse;

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

    public static double limitePeso() {

        double pesoMax = 0;

        if (pesoMax < 0 || pesoMax > 800);

        return pesoMax;

    }
    
    public void moverAscensor() {
        
        if (plantaActual<plantaAMoverse);
        
        for (plantaActual=0;plantaActual<=plantaAMoverse;plantaActual++)
        
        if (plantaActual==plantaAMoverse);
    }

    public Elevador(String numeroSerie, int capacidadMaximaPersonas, double pesoMaximo, LocalDate fechaFabricacion, LocalDate fechaUltimaRevision, int plantaActual, String estadoAscensor) {
        this.numeroSerie = numeroSerie;
        this.capacidadMaximaPersonas = capacidadMaximaPersonas;
        this.pesoMaximo = pesoMaximo;
        this.fechaFabricacion = fechaFabricacion;
        this.fechaUltimaRevision = fechaUltimaRevision;
        this.plantaActual = plantaActual;
        this.estadoAscensor = estadoAscensor;
        
        
    }

    public Elevador(int plantaAMoverse) {
        this.plantaAMoverse = plantaAMoverse;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public int getCapacidadMaximaPersonas() {
        return capacidadMaximaPersonas;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public LocalDate getFechaUltimaRevision() {
        return fechaUltimaRevision;
    }

    public int getPlantaActual() {
        return plantaActual;
    }

    public String getEstadoAscensor() {
        return estadoAscensor;
    }

    public void setFechaUltimaRevision(LocalDate fechaUltimaRevision) {
        this.fechaUltimaRevision = fechaUltimaRevision;
    }

    public void setPlantaActual(int plantaActual) {
        this.plantaActual = plantaActual;
    }
    
    

    public void setEstadoAscensor(String estadoAscensor) {
        this.estadoAscensor = estadoAscensor;
    }

    @Override
    public String toString() {
        return "Elevador{" + "numeroSerie=" + numeroSerie + ", capacidadMaximaPersonas=" + capacidadMaximaPersonas + ", pesoMaximo=" + pesoMaximo + ", fechaFabricacion=" + fechaFabricacion + ", fechaUltimaRevision=" + fechaUltimaRevision + ", plantaActual=" + plantaActual + ", estadoAscensor=" + estadoAscensor + '}';
    }

    
    
    
    

}
