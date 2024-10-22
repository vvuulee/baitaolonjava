/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;

/**
 *
 * @author lecon
 */
public class Student {

    private String id;
    private String name;
    private String birdday;
    private String className;

    ;
    public Student() {
    }

    public Student(String id, String name, String birdday, String className) {
        this.id = id;
        this.name = name;
        this.birdday = birdday;
        this.className = className;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirdday() {
        return birdday;
    }

    public void setBirdday(String birdday) {
        this.birdday = birdday;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String toString() {
        return "studen :" + name + id + "(" + birdday + ")" + "lop:" + className;

    }

}
