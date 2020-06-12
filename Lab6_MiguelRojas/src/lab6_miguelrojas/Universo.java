package lab6_miguelrojas;

import java.awt.TextArea;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JTextArea;

public class Universo {

    private String nombre;
    private ArrayList<Seres_Vivos> lista_seresVivos = new ArrayList();
    private File archivo = null;

    public Universo() {

    }

    public Universo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public Seres_Vivos getSerVivo(int p) {
        return this.lista_seresVivos.get(p);
    }

    public ArrayList<Seres_Vivos> getLista_seresVivos() {
        return lista_seresVivos;
    }

    public void setSerVivo(Seres_Vivos sv) {
        this.lista_seresVivos.add(sv);
    }

    public void setLista_seresVivos(ArrayList<Seres_Vivos> lista_seresVivos) {
        this.lista_seresVivos = lista_seresVivos;
    }

    @Override
    public String toString() {
        return nombre;
    }

    //Metodos Administrativos
    public void escribirArchivo(String url) throws IOException {

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(url);
            bw = new BufferedWriter(fw);

            for (Seres_Vivos sv : lista_seresVivos) {
                bw.write(sv.getNombre() + "|");
                bw.write(sv.getPoder() + "|");
                bw.write(sv.getYears() + "|");
                bw.write(sv.getPlaneta_procedencia() + "|");
                bw.write(sv.getRaza() + "|\n");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo(File ubicacion) {

        Scanner sc = null;
        lista_seresVivos = new ArrayList();
        try {
            sc = new Scanner(ubicacion);
            sc.useDelimiter("|");
            System.out.println(sc.next());
            while (sc.hasNext()) {
                lista_seresVivos.add(new Seres_Vivos(sc.next(), sc.nextInt(), sc.nextInt(), sc.next(), sc.next()));
            }

        } catch (Exception e) {
        }
        sc.close();
        
    }
}
