package co.edu.uniquindio.poo;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Proyecto {
    private String nombreProyecto;
    private LinkedList<ParqueInfantil> listaParqueInfantils;

    public Proyecto(String nombreProyecto, LinkedList<ParqueInfantil> listaParqueInfantils) {
        this.nombreProyecto = nombreProyecto;
        this.listaParqueInfantils = listaParqueInfantils;

    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public LinkedList<ParqueInfantil> getListaParqueInfantils() {
        return listaParqueInfantils;
    }

    public void agregarParque(ParqueInfantil parqueInfantil) {
        for (ParqueInfantil p : listaParqueInfantils) {
            if (p.getNombreParque().equals(parqueInfantil.getNombreParque())) {
                throw new IllegalArgumentException("Ya existe el parque.");
            }
        }
        listaParqueInfantils.add(parqueInfantil);
    }

    public ParqueInfantil obtenerParquePorNombre(String nombre) {
        for (ParqueInfantil parque : listaParqueInfantils) {
            if (parque.getNombreParque().equals(nombre)) {
                return parque;
            }
        }
        return null; // Retorna null si no se encuentra ningún parque con el nombre dado
    }

    public LinkedList<ParqueInfantil> obtenerParquesPorMunicipio(Municipio municipio) {
        LinkedList<ParqueInfantil> parquesMunicipio = new LinkedList<>();
        for (ParqueInfantil parque : listaParqueInfantils) {
            if (parque.getMunicipio().equals(municipio)) {
                parquesMunicipio.add(parque);
            }
        }
        return parquesMunicipio;
    }

    public LinkedList<ParqueInfantil> listarParquesDiseñados() {
        LinkedList<ParqueInfantil> parquesOrdenados = new LinkedList<>(listaParqueInfantils);

        // Ordenar los parques por valor total de forma ascendente
        Collections.sort(parquesOrdenados, Comparator.comparingDouble(ParqueInfantil::getValorTotal));

        return parquesOrdenados;
    }

}
