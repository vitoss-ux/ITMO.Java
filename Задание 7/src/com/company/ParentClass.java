package com.company;

public class ParentClass {

    public String str = "Дочерний класс от класса-родителя";
}
class ChildClass extends ParentClass{

    public String outPut(){
        return super.str;
    }
}