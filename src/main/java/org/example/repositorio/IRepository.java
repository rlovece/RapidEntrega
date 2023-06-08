package org.example.repositorio;

import java.util.ArrayList;

public interface IRepository<T> {

    // <editor-fold defaultstate="collapsed" desc="Metodos abstractos">

    void agregar(T objeto); //Alta

    T modificacion(int id, T nuevo); //Modificaciom

    void mostrar();//Listado

    T buscar(String dato); //Busqueda

    void eliminar(String dato);//Baja

    //Persistencia
    void serializable(ArrayList<T> object, String pathJson);

    ArrayList<T> deserializable(String phatJson, Class<T> clase);
//    </editor-fold>   

}
