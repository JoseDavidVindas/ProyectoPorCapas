/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import AccesoDatos.AccesoDatos;
import Entidades.Usuario;
import java.io.IOException;

/**
 *
 * @author Jose
 */
public class LogicaUsuario {
    private  AccesoDatos objAccesoDatos;
public void index(Usuario objUsuario){
}

  public void insert(Usuario objUsuario) throws IOException{
         objAccesoDatos = new AccesoDatos();
        objAccesoDatos.setNombreArchivo("usuarios.txt");
        
        objAccesoDatos.setLinea(objUsuario.getNombre() + ","
                + objUsuario.getApellido() + ","
                + objUsuario.getCorreo());
        
        objAccesoDatos.insert(objAccesoDatos);
  }
  public void read(Usuario objUsuario){
      
  }
  public void update(Usuario objUsuario){
      
  }
  public void delete(Usuario objUsuario){
    
}

}    


