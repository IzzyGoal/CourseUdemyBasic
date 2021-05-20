package herancaPolimorfismo.entities;

public class Employee {
    private String name;
    private Integer hour;
    private double valuePerHour;

    public Employee(){

    }

    public Employee(String name, Integer hour, double valuePerHour) {
        this.name = name;
        this.hour = hour;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }
    public double payment(){
        return hour * valuePerHour;
    }
}

