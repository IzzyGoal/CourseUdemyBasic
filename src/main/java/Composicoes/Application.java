package Composicoes;

import Composicoes.entities.Departament;
import Composicoes.entities.Enums.WorkerLevel;
import Composicoes.entities.HoursContract;
import Composicoes.entities.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdk =  new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("enter departament name: ");
        String departamentname = sc.nextLine();
        System.out.println("Enter worker data : ");
        System.out.println("Name: ");
        String workerName =sc.nextLine();
        System.out.println("Level: ");
        String workerLevel =sc.nextLine();
        System.out.println("Base Salary: ");
        double baseSalary =sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),baseSalary, new Departament(departamentname));

        System.out.println("how many contracts to tis worker? ");
        int n = sc.nextInt();
        for (int i = 1; i<=n;i ++) {
            System.out.println("Enter contract #" + i + " data");
            System.out.print("Date (DD/MM/YYYY)");
            Date contractDate = sdk.parse(sc.next());
            System.out.println("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            ;
            System.out.println("Duration (hours): ");
            int hours = sc.nextInt();
            HoursContract contract = new HoursContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
            }

            System.out.println();
            System.out.println("Enter month and year to caucule income (MM/YYYY)");
            String monthAndYear = sc.next();
            int month = Integer.parseInt(monthAndYear.substring(0,2));
            int year = Integer.parseInt(monthAndYear.substring(3));
            System.out.println("Name: "+ worker.getName());
            System.out.println("Departament: "+ worker.getDepartament());
            System.out.println("Income for " + monthAndYear
                    + ":"
                    + String.format("%.2f",worker.income(year,month)));

            sc.close();

    }
}
