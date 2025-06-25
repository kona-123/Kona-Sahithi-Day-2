public class Student {
    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() { return id; }
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public void setMarks(double marks) { this.marks = marks; }
    public double getMarks() { return marks; }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Marks: %.2f", id, name, marks);
    }
}
public class Student {
    private int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getMarks() {
        return marks;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Marks: %.2f", id, name, marks);
    }
}



