class Employee {
    String NIC;
    int id;
    String name;
}

public class customClass {
    public static void main(String[] args) {
        System.out.println("This is Our Custom Class");
        Employee mubashir = new Employee();
        mubashir.NIC = "3520067786327";
        mubashir.name = "Blockchain Scientist";
        mubashir.id = 12;
        System.out.println("Employer Data");
        System.out.print("id : " + mubashir.id + " name  " + mubashir.name + " NIC : " + mubashir.NIC);
    }

}
