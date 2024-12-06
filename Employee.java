import java.time.LocalDate;
import java.time.Period;

public class Employee implements Comparable<Employee>{

    private String name;
    private String midlename;
    private String surname;
    private String position;
    private int salary;
    private LocalDate dayOfBirth;
    private LocalDate dayOfDeath;
    private int phoneNumber;

    public Employee(String name, String midlename, String surname, String position,
                    int salary, LocalDate dayOfBirth, LocalDate dayOfDeath, int phoneNumber) {
        this.name = name;
        this.midlename = midlename;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
        this.dayOfBirth = dayOfBirth;
        this.dayOfDeath = dayOfDeath;
        this.phoneNumber = phoneNumber;
    }

    public int returnAge(LocalDate dayOfBirth, LocalDate dayOfDeath){
        if(dayOfDeath == null){
            dayOfDeath = LocalDate.now();
        }
        return Period.between(dayOfBirth, dayOfDeath).getYears();
    }

    @Override
    public String toString() {
        return "Employee " +
                "name: " + name +
                ", midlename: " + midlename +
                ", surname: " + surname +
                ", position: " + position +
                ", salary: " + salary + " rub/day" +
                ", age: " + returnAge(dayOfBirth, dayOfDeath) +
                ", phoneNumber: " + phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMidlename() {
        return midlename;
    }

    public void setMidlename(String midlename) {
        this.midlename = midlename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public int setSalary(int salary) {
        this.salary = salary;
        return salary;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public LocalDate getDayOfDeath() {
        return dayOfDeath;
    }

    public void setDayOfDeath(LocalDate dayOfDeath) {
        this.dayOfDeath = dayOfDeath;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getSalary() - o.getSalary();
        //return this.getSalary() - o.getSalary();
    }

}
