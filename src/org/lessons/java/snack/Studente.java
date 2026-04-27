package org.lessons.java.snack;

import java.util.Random;

public class Studente {
    
    String[] nomi={"Mario","Luca","Giulia","Tommaso","Francesca","Aieie"};
    String[] cognomi={"Brazorf","Rossi","Verdi","Bianchi","Bros","Da Vinci","Ronaldo","Aranzulla"};

    private String name;
    private String surname;
    private int age;

    public Studente(){
        Random rnd=new Random();
            this.name=nomi[rnd.nextInt(nomi.length)];
            this.surname=cognomi[rnd.nextInt(cognomi.length)];
            this.age=rnd.nextInt(99);
        }   

    public Studente(String name,String surname,int age){
        if(name!=null&&name.trim()!=""){
            this.name=name;
        }else{
            Random rnd=new Random();
            this.name=nomi[rnd.nextInt(nomi.length)];
        }
        if(surname!=null&&surname.trim()!=""){
            this.surname=surname;
        }else{
            Random rnd=new Random();
            this.surname=cognomi[rnd.nextInt(cognomi.length)];
        }
        if(age>=6){
            this.age=age;
        }else{
            this.age=6;
        }
    }



    //GETTER & SETTER
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        if(name!=null&&name.trim()!=""){
            this.name=name;
        }
    }
    public String getSurname(){
        return this.surname;
    }
    public void setSurname(String surname){
        if(surname!=null&&surname.trim()!=""){
            this.surname=surname;
        }
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if(age>=6){
            this.age=age;
        }
    }
    
    public String getFullInfo(){
        return this.name+" "+this.surname+", "+this.age+" anni";
    }

}
