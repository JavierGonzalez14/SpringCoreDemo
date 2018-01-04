package com.grupo4.springdemo;

/**
 *
 * @author Javier
 */
public class Employee {
    //1
    private int eId;
    private String eName;
    //private String eAddress; 16 ya no se usara este atributo se agrega el siguiente
    Address address;
    
    //Methods
     /**---------------------------------------------------------------------\\
                                      METHODS
     \\---------------------------------------------------------------------/*/
    
    public Employee() {
    //7
        System.out.println("-- Object created --");
    }
    //17 Se crea constructor Injection

    public Employee(Address address){
            this.address = address;
    }
    
    //2
    public Employee(int eId, String eName/*String eAddress 16 ya no se usara*/) {
        this.eId = eId;
        this.eName = eName;
        /*this.eAddress = eAddress; 16 ya no se usara*/
    }
    
     /**---------------------------------------------------------------------\\
                                 SETTERS Y GETTERS
     \\---------------------------------------------------------------------/*/
    
    //3
    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }
    
    /* 16 ya no se usaran
    
    public String geteAddress() {
        return eAddress;
    }

    public void seteAddress(String eAddress) {
        this.eAddress = eAddress;
    }*/
    
    //18 Se crea set para address
    public void setAddress(Address address) {
        this.address = address;
    }
    
    
    //5
    @Override
    public String toString() {
        return "Employee{" + "eId=" + eId + ", eName=" + eName + ", eAddress=" + /*eAddress 16 se cambia a objeto*/ address + '}';
    }
    
    //14 Metodos crear y destruir
    public void myInit()
	{
		System.out.println("-- Object Initializaed --");
	}
	
	public void myDestroy()
	{
		System.out.println("-- Object Destroyed --");
	}
}
