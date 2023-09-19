package Manager;

import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager implements IManager<Student> {
    ArrayList<Student> list;

    public StudentManager() {
        this.list = new ArrayList<>();
    }
    Scanner input = new Scanner(System.in);

    @Override
    public void add(Student student) {
        list.add(student);
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        list.remove(index);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void update(int id, Student student) {
        int index = findIndexById(id);
        list.set(index, student);
    }

    @Override
    public Student searchId(int id) {
        int index = findIndexById(id);
        return list.get(index);
    }

    @Override
    public ArrayList<Student> searchName(String name) {
        ArrayList<Student> std = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().contains(name)){
                std.add(list.get(i));
            }
        }
        return std;
    }

    @Override
    public double mediumPoint() {
        double max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAvg()> max) {
                max = list.get(i).getAvg();
            }
        }
        return max;
    }

    @Override
    public ArrayList<Student> findAll() {
        return list;
    }




    @Override
    public String toString() {
        return "StudentManager{" +
                "list=" + list +
                ", input=" + input +
                '}';
    }
}
