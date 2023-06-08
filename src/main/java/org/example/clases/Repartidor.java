package org.example.clases;
import org.example.enums.TiposDePaquetes;
import org.example.enums.Zonas;

import java.util.ArrayList;

public class Repartidor extends Empleado {

    private Supervisor supervisor;
    private String licencia;

    private Zonas zona;
    private TiposDePaquetes tiposPaquetes;
    private ArrayList<Paquete> paquetesAsignados;

}
