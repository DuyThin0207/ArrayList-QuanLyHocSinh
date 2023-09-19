package view;

import Manager.StudentManager;
import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuStudent {
    StudentManager studentManager = new StudentManager();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("========= Menu Student Manager ====== \n1. Thêm mới học sinh\n2. Sửa học sinh\n3. Xóa học sinh\n4. Tìm kiếm theo ID\n5. Hiển thị danh sách sinh viên theo tên\n6. Học viên có điểm trung bình lớn nhất. \n7. Hiển thị tất cả\n0. Thoát");
            System.out.println("Nhập lựa chọn");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    showMenuAdd();
                    break;
                case 2:
                    showMenuEdit();
                    break;
                case 3:
                    showMenuDelete();
                    break;
                case 4:
                    showSearchId();
                    break;
                case 5:
                    showSearchName();
                    break;
                case 6:
                    showMaxMediumPoint();
                    break;
                case 7:
                    showAll();
                    break;

            }
        } while (choice != 0);
    }

    public void showMenuEdit() {
        System.out.println("===== Menu edit ======");
        System.out.println("Nhập id muốn sửa: ");
        int idEdit = inputInt.nextInt();
        System.out.println("Nhập tên: ");
        String name = inputString.nextLine();
        System.out.println("Nhập giới tính: ");
        String sex = inputString.nextLine();
        System.out.println("Nhập điểm Toán: ");
        double score1 = inputInt.nextDouble();
        System.out.println("Nhập điểm Văn: ");
        double score2 = inputInt.nextDouble();
        System.out.println("Nhập điểm Anh: ");
        double score3 = inputInt.nextDouble();


        Student newStudent = new Student(idEdit, name, sex, new double[]{score1,score2,score3});
        studentManager.update(idEdit, newStudent);
        System.out.println("====> Sửa thành công");
    }

    public void showMenuDelete() {
        System.out.println("==== Xóa học sinh ======");
        System.out.println("Nhập id: ");
        int idDelete = inputInt.nextInt();
        studentManager.delete(idDelete);
        System.out.println("======> Xóa thành công");
    }

    public void showMenuAdd() {
        System.out.println("==== Đây là menu thêm mới ====");
        System.out.println("Nhập ID: ");
        int id = inputInt.nextInt();
        System.out.println("Nhập tên: ");
        String name = inputString.nextLine();
        System.out.println("Nhập giới tính: ");
        String sex = inputString.nextLine();
        System.out.println("Nhập điểm Toán: ");
        double score1 = inputInt.nextDouble();
        System.out.println("Nhập điểm Văn: ");
        double score2 = inputInt.nextDouble();
        System.out.println("Nhập điểm Anh: ");
        double score3 = inputInt.nextDouble();

        Student student = new Student(id, name, sex, new double[]{score1,score2,score3});
        studentManager.add(student);
        System.out.println("====> Thêm thành công");
    }

    public void showSearchId() {
        System.out.println("Nhập ID sinh viên muốn tìm: ");
        int checkID = inputInt.nextInt();
        System.out.println(studentManager.searchId(checkID));

    }

    public void showSearchName() {
        System.out.println("Nhập tên sinh viên muốn tìm: ");
        String checkName = inputString.nextLine();
        System.out.println(studentManager.searchName(checkName));

    }

    public void showMaxMediumPoint() {
        System.out.println("Sinh viên có điểm cao nhất là : ");

        System.out.println(studentManager.mediumPoint());
    }
    public void showAll() {
        System.out.println("Danh sách sinh viên là: ");
        ArrayList<Student> list = studentManager.findAll();
        for (Student student : list) {
            System.out.println(student);
        }
    }
}

