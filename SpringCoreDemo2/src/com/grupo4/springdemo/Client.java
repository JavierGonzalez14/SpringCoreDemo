package com.grupo4.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author Javier
 */
public class Client {

    //4
    public static void main(String[] args) {
        
 /**---------------------------------------------------------------------\\
                            PRIMER FORMA DE HACERLO
 \\---------------------------------------------------------------------/*/
        //6
//        Employee eRf = new Employee();
//        eRf.seteId(101);
//        eRf.seteName("Sponge Bob Square Pants");
//        eRf.seteAddress("Pineapple at Bikini Bottom");
//
//        System.out.println("Employee details: " + eRf);
//        
        //20    
        Employee eRf = new Employee();
        Address a = new Address();
        a.setCity("Bikini Bottom");
        a.setState("Bottom Island");
        a.setZipCode(44472);
        eRf.seteId(101);
        eRf.seteName("Sponge Bob Square Pants");
        eRf.setAddress(a);

        System.out.println("Employee details: " + eRf);

//        //8
//        //String May | IOC (Inversion Of Control)
//        Resource resource = new ClassPathResource("employeebean.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);
//
//        //11 
//        //Las dos formas de hacerlo / Aqui se mandan llamar del xml
//        Employee emp1 = (Employee) factory.getBean("emp1");
//        Employee emp2 = factory.getBean("emp2", Employee.class);
//        System.out.println("Employee details: "+emp1);
//        System.out.println("Employee details: "+emp2);

 /**---------------------------------------------------------------------\\
                         FIN PRIMER FORMA DE HACERLO
       *  XmlBeanFactory YA ESTA DEPRECIADA (PROXIMA A DEJAR DE EXISTIR)
 \\---------------------------------------------------------------------/*/
 
 /**---------------------------------------------------------------------\\
                            SEGUNDA FORMA DE HACERLO
 \\---------------------------------------------------------------------/*/
 
    //12  Se crea el bean employee
    ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
    Employee e1 = (Employee) context.getBean("emp3");
    
    System.out.println("Employee1 Details: "+e1);
        System.out.println("-- Context opened --");
        
    //13    Deja de existir el bean employee
    ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext) context;
    cxt.close();
        System.out.println("-- Context closed --");
    }

}
