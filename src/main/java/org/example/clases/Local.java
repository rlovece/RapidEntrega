package org.example.clases;

import org.example.enums.Areas;

import java.util.ArrayList;
import java.util.TreeMap;

public class Local {
    private int id;
    private Areas area;
    private ArrayList<Empleado> empleados;
    private TreeMap<Integer,Paquete> paquetes;

    //constructores
    public Local() {
    }

    public Local(int id, Areas area, ArrayList<Empleado> empleados, TreeMap<Integer, Paquete> paquetes) {
        this.id = id;
        this.area = area;
        this.empleados = empleados;
        this.paquetes = paquetes;
    }

    //region Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Areas getArea() {
        return area;
    }

    public void setArea(Areas area) {
        this.area = area;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public TreeMap<Integer, Paquete> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(TreeMap<Integer, Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    //endregion


    @Override
    public String toString() {
        return "Local{" +
                "id=" + id +
                ", area=" + area +
                ", empleados=" + empleados +
                ", paquetes=" + paquetes +
                '}';
    }
}
