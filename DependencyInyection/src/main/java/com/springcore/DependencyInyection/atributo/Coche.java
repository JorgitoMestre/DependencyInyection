package com.springcore.DependencyInyection.atributo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/*
1--inyeccion de dependencia por atributo
2--inyeccion de dependencia por contructor
3--inyeccion de dependencia mediante setters y getters
 */
@Component
public class Coche {
    //@Value("BMW")  para la inyeccion de dependencia por atributo   1
    private String marca;
    //@Value("S-5") para la inyeccion de dependencia por atributo   1
    private String modelo;
   // @Autowired  //Ejemplo de inyeccion de dependencia a traves de atributo  1
    private Motor motor;

    // cdo hago inyeccion de dependencia por parametros debo tener un constructor por defecto sin
    // codigo dentro  1
    //Al igual que cdo hago la inyeccion de dependencia a traves de setters y getters tmb tengo q tener
    //un constructor por defecto sin codigo

    /*
    //asi se pone el constructor cdo la inyeccion de dependencia se realiza a traves de parametros  1
    public Coche(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }*/
    public Coche(){
    }

    /*
    @Autowired //Ejemplo de inyeccion de dependencia a traves del constructor  2
    public Coche(@Value("BMW") String marca, @Value("S-5") String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

     */

    public String getMarca() {
        return marca;
    }
    @Value("BMW")
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    @Value("S-5")
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }
    @Autowired
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor=" + motor +
                '}';
    }
}
