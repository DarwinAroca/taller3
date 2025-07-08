package historialClinico;
import java.util.ArrayList;

public class Propietario {

    private String nombre;
    private int documento;
    private int telefono;

    private ArrayList<Mascota> mascotas = new ArrayList<>();

    public Propietario(String nombre,int documeto,int telefoono) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
    }

    public void agregarMascota(Mascota m) {
        mascotas.add(m);
    }

    public void mostrarMascotas() {
        for (Mascota m : mascotas) {
            m.mostrarInfo();
        }
    }
}
