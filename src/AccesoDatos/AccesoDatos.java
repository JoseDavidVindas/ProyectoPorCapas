/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Jose
 */
public class AccesoDatos {

 
    private String nombreArchivo,linea;

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }
     public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    public void insert(AccesoDatos objAccesoDatos) throws IOException{
        BufferedWriter objBufferedWriter = new BufferedWriter(new FileWriter(this.nombreArchivo));
        objBufferedWriter.append(this.linea);
        objBufferedWriter.newLine();
        objBufferedWriter.close();
    }
}
