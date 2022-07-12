
class Employee {
    String NIC;
    int id;
    String name;

    public void printdetails() {
        System.out.println("My Id is " + id);
        System.out.println("My NAME IS " + name);
        System.out.println("and MY NIC is " + NIC);
    }
}

public class customClass {
    public static void main(String[] args) {
        System.out.println("This is Our Custom Class");
        Employee mubashir = new Employee();
        mubashir.NIC = "3520067786327";
        mubashir.name = "Blockchain Scientist";
        mubashir.id = 12;
        System.out.println("Employer Data");
        mubashir.printdetails();
    }

}
