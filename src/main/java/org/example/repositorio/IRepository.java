package org.example.repositorio;

import java.util.ArrayList;

public interface IRepository<T> {
    
    // <editor-fold defaultstate="collapsed" desc="Metodos abstractos">
 //    Alta
    void agregar(T objeto);
    //    Modificaciom
    T modificacion(int id, T nuevo);//Ingresar dni de usuario a modificar : 

    //Listado
    void mostrar();
    //Busqueda
    T buscar(String dato);
    //Baja
    void eliminar(String dato);

    //Persistencia
    void serializable(ArrayList<T> object, String pathJson);
    ArrayList<T> deserializable(String phatJson, Class<T> clase);
//    </editor-fold>   

}
