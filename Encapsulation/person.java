package Encapsulation;

import javax.xml.namespace.QName;

public class person {
    //encapsulation
    private String name;
    private int age;


    person(){
    }

    person(String name, int age){//when we have these we don't need public void ya kuset
        this.name= name;
        this.age=age;


    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }


}