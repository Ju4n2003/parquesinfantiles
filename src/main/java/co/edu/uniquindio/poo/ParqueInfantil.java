package co.edu.uniquindio.poo;

import java.util.Collection;

public class ParqueInfantil {
    private String nombreParque;
    private String descripcion;
    private Municipio municipio;
    private Collection<Zona> listaZonas;
    private Material material;
    private double valorTotal;

    public ParqueInfantil(String nombreParque, String descripcion, Municipio municipio, Collection<Zona> listaZonas, Material material) {
        this.nombreParque = nombreParque;
        this.descripcion = descripcion;
        this.municipio = municipio;
        this.listaZonas = listaZonas;
        this.material = material;

    }

    public void agregarZona(Zona zona) {
        for (Zona zonas : listaZonas) {
            if (zonas.getNombreFigura().equals(zonas.getNombreFigura())) {
                throw new IllegalArgumentException("Ya existe una zona con ese nombre en el parque.");
            }
        }
        listaZonas.add(zona);
    }

    public String getNombreParque() {
        return nombreParque;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Collection<Zona> getListaZonas() {
        return listaZonas;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public Material getMaterial() {
        return material;

    }
}
