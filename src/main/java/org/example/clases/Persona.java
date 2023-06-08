package org.example.clases;

public class Persona {

    // <editor-fold defaultstate="collapsed" desc="Atributos">
    private int Id;
    private String nombreYApellido, dni, telefono, username, password;
//    </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructores">
    public Persona(int id, String nombreYApellido, String dni, String telefono, String username, String password) {
        this.Id = id;
        this.nombreYApellido = nombreYApellido;
        this.dni = dni;
        this.telefono = telefono;
        this.username = username;
        this.password = password;
    }

    public Persona() {
    }
//    </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters & Setters">
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombreYApellido() {
        return nombreYApellido;
    }

    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="To String">

    @Override
    public String toString() {
        return "Id = " + Id
                + "\nNombre y Apellido = " + nombreYApellido
                + "\nDni = " + dni
                + "\nTelefono = " + telefono
                + "\nUsername = " + username
                + "\nPassword = " + password;
    }
//    </editor-fold>
}
