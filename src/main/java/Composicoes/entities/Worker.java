package Composicoes.entities;

import Composicoes.entities.Enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Departament departament;

    private List<HoursContract> contracts = new ArrayList<>();

    public Worker(){

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HoursContract> getContracts() {
        return contracts;
    }

    public void setContracts(List<HoursContract> contracts) {
        this.contracts = contracts;
    }

    public void addContract(HoursContract contract){
        contracts.add(contract);
    }
    public void removeContrat(HoursContract contract){
        contracts.remove(contract);
    }
    public double income(int year , int month){
        double sum = baseSalary;
        Calendar cal =Calendar.getInstance();
        for (HoursContract c: contracts){
            cal.setTime((c.getDate()));
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if(year == c_year && month == c_month) {
                sum += c.totalValue();
            }
            }
        return sum;

    }
}

