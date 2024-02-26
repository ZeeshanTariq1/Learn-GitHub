public class EmployeeTest {
    public static void main(String[] args) {
        Employe e = new Employe(134,"asad","co-founder",2300000.32);
        Employe e1 = new Employe(122,"sawood",23.2);
        System.out.println("ID :" + e.getId());
        System.out.println("NAME: "+e.getName());
        System.out.println("DESIGNATION: "+e.getDesignation());
        System.out.println("SALARY: "+e.getSalary());
        System.out.println("ID :" + e1.getId());
        System.out.println("NAME: "+e1.getName());

        System.out.println("SALARY: "+e1.getSalary());


    }
}

