package org.example;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames){
        this.id= id;
        this.name = name;
        this.developerNames = developerNames;
        if(giro>0) this.giro=giro;
    }

    public void addEmployee(int index, String name) {
        if(index<0) System.out.println("index out of bounds");
        else if(developerNames[index] == null) {
            developerNames[index] = name;
        }
        else System.out.println("Related index is already filled");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGiro(double giro) {
        this.giro = giro;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }
}
