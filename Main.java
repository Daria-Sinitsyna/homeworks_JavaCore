import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    /**
     * 2. Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий
     * две даты, представленные в виде трёх чисел гггг-мм-дд, без использования
     * условного оператора.
     *
     * 3. Опишите класс руководителя, наследник от сотрудника. Перенесите статический
     * метод повышения зарплаты в класс руководителя, модифицируйте метод таким
     * образом, чтобы он мог поднять заработную плату всем, кроме руководителей. В
     * основной программе создайте руководителя и поместите его в общий массив
     * сотрудников. Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата
     * руководителя не повысилась.
     * @param args
     */

    public static void main(String[] args) {

        Employee employee1 = new Employee("Dan", "-", "Summer",
                "cleaner", 2500, LocalDate.of(1970,01,12),
                null, 8888);

        Employee employee2 = new Employee("Denis", "-", "Smith",
                "head of department", 5000, LocalDate.of(1978, 05, 18),
                null, 9999);
        Employee employee3 = new Employee("Daria", "Eduardovna", "Sinitsyna",
                "enginier", 4000, LocalDate.of(1962, 01, 12), null,
                77777);
        Employee ceo1 = new CEO("Jon", "-", "Bikford", "CEO",50_000,
                LocalDate.of(1965, 01, 15), null, 1111);


        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(ceo1);

        for(Employee employee : employees){
            System.out.println(employee);
        }

        System.out.println();
        increaseSalary(employees);

        for(Employee employee : employees){
            System.out.println(employee);
        }

    }

    public static void increaseSalary(ArrayList<Employee> employees){

        for(Employee employee : employees){
            int overSalary = 5000;
            if(employee.returnAge(employee.getDayOfBirth(), employee.getDayOfDeath()) > 45 &&
                    employee.getPosition().toUpperCase() != "CEO"){
                employee.setSalary((employee.getSalary() + overSalary));
            }
        }
    }
}
