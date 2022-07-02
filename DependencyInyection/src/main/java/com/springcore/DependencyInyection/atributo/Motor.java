package com.springcore.DependencyInyection.atributo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/*
1--inyeccion de dependencia por atributo
2--inyeccion de dependencia por contructor
3--inyeccion de dependencia mediante setters y getters
 */
@Component
public class Motor {
  // @Value("XL1") para la inyeccion de dependencia por atributo   1
    private String marca;
   // @Value("2018") para la inyeccion de dependencia por atributo  1
   private String modelo;

   ////asi se pone el constructor cdo la inyeccion de dependencia se realiza a traves de parametros  1 y 3
   public Motor(){
   }

   /*
    //asi se pone el constructor cdo la inyeccion de dependencia se realiza a traves de parametros  1
    public Motor(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }*/

    /*
    //Ejemplo de inyeccion de dependencia a traves del constructor  2
   public Motor(@Value("XL1") String marca, @Value("2018") String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

     */

    public String getMarca() {
        return marca;
    }
    @Value("XL1") //asi se hace la inyeccion de dependencia a traves de setters y getters 3
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    @Value("2018") //asi se hace la inyeccion de dependencia a traves de setters y getters 3 (no se pone construcror
    // x parametros)
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
