package org.lessons.java.snack;

public class Studente {
    
    private String name;
    private String surname;
    private int age;

    public Studente(String name,String surname,int age){
        if(name.trim()!=""){
            this.name=name;
        }
        if(surname.trim()!=""){
            this.surname=surname;
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
