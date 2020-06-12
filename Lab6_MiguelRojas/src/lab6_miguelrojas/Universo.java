package lab6_miguelrojas;

import java.io.File;
import java.util.ArrayList;

public class Universo {

    private String nombre;
    private ArrayList<Seres_Vivos> lista_seresVivos = new ArrayList();
    private File archivo = null;
    
    public Universo(){
        
    }
    
    public Universo(String nombre){
        this.nombre = nombre;
        archivo = new File(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Seres_Vivos getSerVivo(int p){
        return this.lista_seresVivos.get(p);
    }

    public ArrayList<Seres_Vivos> getLista_seresVivos() {
        return lista_seresVivos;
    }
    
    public void setSerVivo(Seres_Vivos sv){
        this.lista_seresVivos.add(sv);
    }

    public void setLista_seresVivos(ArrayList<Seres_Vivos> lista_seresVivos) {
        this.lista_seresVivos = lista_seresVivos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    

}
