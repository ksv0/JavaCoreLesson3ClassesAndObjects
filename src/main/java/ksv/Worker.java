package ksv;

public class Worker extends Employee {
    private int seniority;

    public Worker(String name, String surname, int age, double salary, int seniority) {
        super(name, surname, age, salary);
        this.seniority = seniority;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "seniority=" + seniority +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public double averageMonthlySalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
//        if (o instanceof Worker) {
//            return seniority - ((Worker) o).getSeniority();
//        }
        return age - o.getAge();
    }

    private int getSeniority() {
        return seniority;
    }
}
