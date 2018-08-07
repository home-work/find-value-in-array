import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String[] students = {"Tâm","Long","Trường","Hậu","Tiến","Sáng","Đạt","Tuấn Anh","Sơn"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        String nameStudent = scanner.nextLine();
        boolean isStudent = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(nameStudent)) {
                System.out.println(nameStudent + " có tên và nằm ở vị trí thứ " + (i + 1) + " trong danh sách");
                isStudent = true;
                break;
            }
        }
        if (!isStudent) {
            System.out.println(nameStudent + " không có trong danh sách");
        }
    }
}
