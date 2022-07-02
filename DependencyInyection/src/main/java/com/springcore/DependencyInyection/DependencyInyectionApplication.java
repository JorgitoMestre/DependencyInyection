package com.springcore.DependencyInyection;

import com.springcore.DependencyInyection.lifecycle.ExplicitBean;
import com.springcore.DependencyInyection.lifecycle.LifeCycleBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

//estas 3 anotaciones hacen lo mismo que @SpringBootApplication
//@Configuration
//@ComponentScan
//@EnableAutoConfiguration
public class DependencyInyectionApplication {

    private  static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);

    //ejemplo de declaracion explicita de Bean
    @Bean
    public String getApplicationName(){
        return "Devs4j rules!";
    }
    /*
    //ejemplo de declaracion explicita de Bean para el civlo de vida de Spring
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public ExplicitBean getBean(){
        return new ExplicitBean();
    }*/

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
		//para el ejemplo de inyeccion de dependencia
        //Coche coche=context.getBean(Coche.class);
		//System.out.println(coche);
		/*
		Motor motor=new Motor("xl1","1989");
		Coche coche= new Coche("BMW","2018",motor);
		System.out.println(coche);
		 */
         //{}
        //para el ejemplo de Qualifiers
        /* Asi se haria normalmente sin usar Qualifiers
        Perro perro=context.getBean(Perro.class);
        log.info("Objeto perro {} {}",perro.getNombre(),perro.getEdad());
        Pajaro pajaro=context.getBean(Pajaro.class);
        log.info("Objeto pajaro {} {}",pajaro.getNombre(),pajaro.getEdad());
        Avion avion=context.getBean(Avion.class);
        avion.Volar();*/

        /*  ejemplo de uso de Qualifiers a traves del contexto de spring
        //esto me sirve para cualquier subclase de animal, en el bean solo especifico el nombre de la clase
        //comenzando con minuscula
        Animal animal=context.getBean("pajaro",Animal.class);
        log.info("Animal nombre={} edad={}",animal.getNombre(),animal.getEdad());*/

        /*
        //ejemplo de uso de Qualifiers a traves de inyeccion de dependencia
        Nido nido=context.getBean(Nido.class);
        nido.imprimir();*/

        /*
        //ejemplo de uso de profiles
        EnviromentService enviromentService = context.getBean(EnviromentService.class);
        log.info("Active enviroment {}",enviromentService.getEnviroment());
         */

        /*
        //ejemplo de uso de Scopes
        EjemploScopeService ejemploScopeService = context.getBean(EjemploScopeService.class);
        EjemploScopeService ejemploScopeService1 = context.getBean(EjemploScopeService.class);
        log.info("Are beans equal {}",ejemploScopeService.equals(ejemploScopeService1));
        log.info("Are beans == {}",ejemploScopeService==ejemploScopeService1);
        */

        /* para probar la declaracion explicita de bean
        //ejemplo de declaracion de Beans
        String nombreAplicacion = context.getBean(String.class);
        log.info("Nombre aplicacion {}", nombreAplicacion);
        */

        /*
        //ejemplo de como hacer Autowire en una lista
        AreaCalculatorService area_calculator = context.getBean(AreaCalculatorService.class);
       double a= area_calculator.calcAreas();
        log.info("Area total {}", a);
        */

        /*
        //Ejemplo de Spring Expression Language (SPEL)
        ExpressionParser parser= new SpelExpressionParser();
        int x=10;
        int y=20;
        String expresion=String.valueOf(x)+"!="+String.valueOf(y);
        Expression expression = parser.parseExpression(expresion);
        log.info("Result {}", expression.getValue());
        */

        //--------------------Ciclo de vida
        //LifeCycleBean bean=context.getBean(LifeCycleBean.class);


    }

}
