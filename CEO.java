import java.time.LocalDate;

public class CEO extends Employee{

    public CEO(String name, String midlename, String surname,
               String position, int salary, LocalDate dayOfBirth, LocalDate dayOfDeath, int phoneNumber) {
        super(name, midlename, surname, position, salary, dayOfBirth, dayOfDeath, phoneNumber);
    }


}
