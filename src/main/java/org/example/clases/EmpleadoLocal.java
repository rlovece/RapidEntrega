package org.example.clases;

public class EmpleadoLocal extends Empleado {
    private Supervisor supervisor;

    //constructor
    public EmpleadoLocal() {
    }

    public EmpleadoLocal(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    //region Getters and Setters

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    //endregion


    @Override
    public String toString() {
        return "EmpleadoLocal{" +
                "supervisor=" + supervisor +
                '}';
    }
}
