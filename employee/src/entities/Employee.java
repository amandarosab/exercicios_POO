package entities;

public class Employee {
    // definição de variáveis
    public String name;
    public double grossSalary;
    public double tax;

    // cálculo para subtração de imposto no salário bruto
    public double netSalary() { 
        return grossSalary - tax;
    }

    // método para aumentar o salário bruto em uma porcentagem fornecida
    public void increaseSalary(double percentage) {
        grossSalary += grossSalary*percentage/100; // incremento aplicado ao salário bruto
    }

}