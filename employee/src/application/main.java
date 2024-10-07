package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Employee;

public class main {
    public static void main(String[] args) {
        // TÍTULO: Cálculo de Salário de Funcionário com Imposto e Incremento Percentual :)
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        // usuário insere o nome do colaborador
        System.out.println("Inform the name of your employee: ");
        employee.name = sc.nextLine();
        
        // usuário preenche com salário bruto do colaborador
        System.out.println("\nInform the gross salary of your employee in dollars: ");
        employee.grossSalary = sc.nextDouble();

        // usuário preenche com o valor do imposto sob o salário bruto do colaborador
        System.out.println("\nApply the tax value required in dollars, based on your ocuppation: ");
        employee.tax = sc.nextDouble();

        // exibição na tela: nome do colaborador e salário liquído
        System.out.printf("\nEmployee: %s, $ %.2f\n",employee.name, employee.netSalary());
        
        // usuário preenche com o valor da porcentagem a acrescentar sob o salário liquído do colaborador
        System.out.println("\nWhat percentage value will be added to the employee's liquid salary?");
        double percentage = sc.nextDouble();

        // exibição na tela: nome do colaborador e salário incrementado
        employee.increaseSalary(percentage);
        System.out.printf("\nUpdated information: %s, $ %.2f", employee.name, employee.netSalary());

        sc.close();
    }
}