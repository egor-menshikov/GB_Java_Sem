package Sem_6;

import java.util.Objects;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", salary=" + salary +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public Worker() {
    }

    public Worker(int id, int salary, String firstName, String lastName) {
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object obj) {
        var worker = (Worker) obj;
        return id == worker.id && Objects.equals(firstName, worker.firstName);
    }

    @Override
    public int hashCode() {
        return id;
    }
}
