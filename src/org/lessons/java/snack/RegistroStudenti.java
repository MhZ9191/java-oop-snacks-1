package org.lessons.java.snack;

public class RegistroStudenti {
    
private Studente[] students;

public RegistroStudenti(){
    this.students=new Studente[0];
}

public void addStudent(Studente student){
    Studente[] tmp = this.students.clone();
    this.students=new Studente[tmp.length+1];
    
    for(int i=0;i<tmp.length;i++){
        this.students[i]=tmp[i];
    }
    
    this.students[tmp.length]=student;
}

public void listStudents(){
    for(int i=0;i<this.students.length;i++){
        System.out.println(this.students[i].getFullInfo());
    }
}

}
