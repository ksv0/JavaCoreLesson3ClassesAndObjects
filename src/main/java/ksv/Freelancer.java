package ksv;

public class Freelancer extends Employee {
    private int rate;

    @Override
    public String toString() {
        return "Freelancer{" +
                "rate=" + rate +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public Freelancer(String name, String surname, int age, double salary, int rate) {
        super(name, surname, age, salary);
        this.rate = rate;
    }

    @Override
    public double averageMonthlySalary() {
        return 20.8*8*salary;
    }

    @Override
    public int compareTo(Employee o) {
//        if (o instanceof Freelancer) {
//            return rate - ((Freelancer) o).getRate();
//        }
        return age - o.getAge();
    }

    private int getRate() {
        return rate;
    }
}
