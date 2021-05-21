package herancaPolimorfismo;

import herancaPolimorfismo.entities.Employee;

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
        for (int i =1; i < n; i++) {

            System.out.println("Employee # " + i + "data: ");
            System.out.println("Outsourced ?(y/n)");
            char ch = sc.next().charAt(0);
            System.out.println("Name: ");
        }
        13:29.







        sc.close();
    }
}
