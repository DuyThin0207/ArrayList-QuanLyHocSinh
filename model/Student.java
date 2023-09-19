package model;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String sex;
    private double[] point;


    public Student(int id, String name, String sex, double[] point) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.point = point;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double[] getPoint() {
        return point;
    }

    public void setPoint(double[] point) {
        this.point = point;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", point=" + Arrays.toString(point) +
                '}';
    }

    public double getAvg() {
        double sum = 0;
        for (double points : point) {
            sum += points;
        }
        return sum / 3;
    }
}
