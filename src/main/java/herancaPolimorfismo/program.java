package herancaPolimorfismo;

import herancaPolimorfismo.entities.Employee;
import herancaPolimorfismo.entities.outsourcingEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();
        System.out.println("Enter the numbers of employees: ");
        int n = sc.nextInt();
        for (int i =1; i <= n; i++) {

            System.out.println("Employee # " + i + "data: ");
            System.out.println("Outsourced ?(y/n)");
            char ch = sc.next().charAt(0);
            System.out.println("Name: ");
            sc.nextLine();
            String name =sc.nextLine();
            System.out.println("Hours: ");
            int hours = sc.nextInt();
            System.out.println("Value per hour");
            double valueperhour = sc.nextDouble();
            if (ch =='y'){
                System.out.println("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                list.add(new outsourcingEmployee(name,hours,valueperhour,additionalCharge));
            }
            else {
                list.add(new Employee(name, hours, valueperhour));
            }

            System.out.println();
            System.out.println("PAYMENTS");
            for (Employee emp : list)
            {
                System.out.println(emp.getName() +" - $" + String.format("%.2f",
                        emp.payment()));
            }
        }
        sc.close();
    }
}
