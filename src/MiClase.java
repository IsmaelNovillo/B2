import java.io.Serializable;

import java.io.Serializable;
public class MiClase implements Serializable {
    private static final long   serialVersionUID=1L;
    private String name;
    private int edad;

    public MiClase(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }
    public MiClase() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString (){
        return "Nombre"+ name +"edad "+ edad;
    }
}
