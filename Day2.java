import java.util.*;

public class Day2 {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add  2. View All  3. Search  4. Update  5. Delete  6. Exit");
            System.out.print("Choose an option: ");
            String opt = sc.nextLine();

            switch (opt) {
                case "1": addStudent(); break;
                case "2": viewAll(); break;
                case "3": searchStudent(); break;
                case "4": updateStudent(); break;
                case "5": deleteStudent(); break;
                case "6": System.out.println("Goodbye!"); return;
                default: System.out.println("Invalid option.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter ID: ");
        int id = Integer.parseInt(sc.nextLine());
        if (findById(id) != null) {
            System.out.println("ID already exists.");
            return;
        }
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Marks: ");
        double marks = Double.parseDouble(sc.nextLine());

        students.add(new Student(id, name, marks));
        System.out.println("Student added.");
    }

    private static void viewAll() {
        if (students.isEmpty()) {
            System.out.println("No records.");
            return;
        }
        System.out.println("\n--- All Students ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    private static void searchStudent() {
        System.out.print("Enter ID to search: ");
        Student s = findById(Integer.parseInt(sc.nextLine()));
        System.out.println(s != null ? s : "Not found.");
    }

    private static void updateStudent() {
        System.out.print("Enter ID to update: ");
        Student s = findById(Integer.parseInt(sc.nextLine()));
        if (s == null) { System.out.println("Not found."); return; }
        System.out.print("New name (" + s.getName() + "): ");
        String nm = sc.nextLine();
        System.out.print("New marks (" + s.getMarks() + "): ");
        String ms = sc.nextLine();
        if (!nm.isEmpty()) s.setName(nm);
        if (!ms.isEmpty()) s.setMarks(Double.parseDouble(ms));
        System.out.println("Updated.");
    }

    private static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        Student s = findById(Integer.parseInt(sc.nextLine()));
        if (s == null) { System.out.println("Not found."); return; }
        students.remove(s);
        System.out.println("Deleted.");
    }

    private static Student findById(int id) {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        return null;
    }
}

