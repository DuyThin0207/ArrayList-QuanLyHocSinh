package Manager;

import java.util.ArrayList;
import model.Student;

public interface IManager<E> {
    void add(E e);
    void delete(int id);
    int findIndexById(int id);
    void update(int id, E e);
    Student searchId(int id);
    ArrayList<Student> searchName(String name);
    double mediumPoint();
    ArrayList<E> findAll();
}
