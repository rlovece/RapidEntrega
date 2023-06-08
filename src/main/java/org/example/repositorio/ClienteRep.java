// <editor-fold defaultstate="collapsed" desc="Paquetes y Librerias">
package org.example.repositorio;

import org.example.repositorio.IRepository;
import org.example.clases.Cliente;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//</editor-fold>

public class ClienteRep implements IRepository<Cliente>, Serializable {

    // <editor-fold defaultstate="collapsed" desc="Atributos">
    private final String ruta = "E:/Proyecto Json/RapidEntrega version 2/RapidEntrega/Cliente.json";
    private final String archivo = "Cliente.json";
    private ArrayList<Cliente> listaClientes;
    private Cliente user = new Cliente() {
    };
//    </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public ClienteRep() {
        this.listaClientes = new ArrayList<>();
    }
//    </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Alta / Baja / Modificacion / Listado">
    @Override
    public void agregar(Cliente objeto) {
        listaClientes = deserializable(ruta, Cliente.class);

        listaClientes.add(objeto);
        serializable(listaClientes, ruta);
    }

    @Override
    public void mostrar() {
        listaClientes = deserializable(ruta, Cliente.class);
        System.out.print(listaClientes);
    }

    @Override
    public void eliminar(String dato) {
        listaClientes = deserializable(ruta, Cliente.class);
        Cliente aux = null;
        for (Cliente user : listaClientes) {
            if (user.getDni().equals(dato)) {
                aux = user;
                break;
            }
        }
        listaClientes.remove(aux);
        serializable(listaClientes, ruta);
    }

    @Override
    public Cliente buscar(String dato) {
        listaClientes = deserializable(ruta, Cliente.class);
        Cliente aux = null;
        try {
            for (Cliente user : listaClientes) {
                if (user.getDni().equals(dato)) {
                    aux = user;
                    break;
                }
            }
        } catch (NullPointerException e) {
            return null;
        }
        return aux;
    }

    @Override
    public Cliente modificacion(int id, Cliente nuevo) {
        listaClientes = deserializable(ruta, Cliente.class);
        try {
            for (Cliente user : listaClientes) {
                if (user.getId() == id) {
                    user.setNombreYApellido(nuevo.getNombreYApellido());
                    user.setDni(nuevo.getDni());
                    user.setTelefono(nuevo.getTelefono());
                    user.setDomicilio(nuevo.getDomicilio());
                    user.setUsername(nuevo.getUsername());
                    user.setPassword(nuevo.getPassword());
                    
                }
            }
        } catch (NullPointerException e) {
            return null;
        }
        serializable(listaClientes, ruta);
        return user;
    }

    public int cantidad() {
        listaClientes = deserializable(ruta, Cliente.class);
        return listaClientes.size();
    }

//    </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Serializacion & Deserealizacion">
    @Override
    public void serializable(ArrayList<Cliente> object, String pathJson
    ) {
        File files = new File(pathJson);
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(files, object);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<Cliente> deserializable(String phatJson, Class<Cliente> clase
    ) {
        File file = new File(phatJson);
        ObjectMapper mapper = new ObjectMapper();
        ArrayList<Cliente> lista = new ArrayList<>();
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            lista = objectMapper.readValue(file, new TypeReference<ArrayList<Cliente>>() {
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            return lista;
        }
    }
    //    </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Validacion">
    public boolean validacion_Login(String username, String password) {
        listaClientes = deserializable(ruta, Cliente.class
        );
        Cliente aux = null;
        try {
            for (Cliente user : listaClientes) {
                if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                    return true;
                }
            }
        } catch (Exception e) {

        }
        return false;
    }

    public boolean validacion_Dni(String dni) {
        listaClientes = deserializable(ruta, Cliente.class
        );
        Cliente aux = null;
        for (Cliente user : listaClientes) {
            if (!user.getDni().equals(dni)) {
                return true;
            }
        }
        return false;
    }

//    </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="To String">
    @Override
    public String toString() {
        return String.format("%s", listaClientes).replace("[", "").replace("]", "");
    }
//    </editor-fold>

}
