public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee() {
        this.id = "N/A";
        this.name = "Chưa có tên";
        this.salary = 0;
    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
        this.salary = 0;
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Mã NV: " + id);
        System.out.println("Tên NV: " + name);
        System.out.println("Lương: " + salary);
        System.out.println("---------------------");
    }
}
