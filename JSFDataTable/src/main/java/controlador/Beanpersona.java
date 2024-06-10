package controlador;

import jakarta.faces.bean.*;
import java.io.Serializable;
import java.util.*;



@ManagedBean(name = "beanpersona")
@SessionScoped


public class Beanpersona implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private List<Persona> lstPersonas;
           

    public Beanpersona() {
        lstPersonas = new ArrayList<>();

        lstPersonas.add(new Persona("JUAN", "PEREZ", 20));
        lstPersonas.add(new Persona("MARIA", "GOMEZ", 22));
        lstPersonas.add(new Persona("JOSE", "HURTADO", 21));
    }

    public List<Persona> getlstPersonas() {
        return lstPersonas;
    }

    
    
    
    
}
