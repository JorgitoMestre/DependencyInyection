package com.springcore.DependencyInyection.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaCalculatorService {
    @Autowired
    private List<Figure> figuras;

    //los 2 metodos hacen lo mismo, una implementacion con foreac y otra com stream

   public double calcAreas(){
        double areas=figuras.stream().mapToDouble(f->f.calcularArea()).sum();
        return areas;
    }

    /*
    public double calcAreas(){
        double areas=0.0;
        for (Figure f: this.figuras) {
            areas+=f.calcularArea();
        }
        return areas;
    }*/
}
