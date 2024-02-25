package ksv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            if (random.nextInt(2) == 0) {
                list.add(new Worker("name" + i, "surname" + i, random.nextInt(23 ,65), random.nextDouble() * 100000, random.nextInt(10)));
            } else {
                list.add(new Freelancer("name" + i, "surname" + i, random.nextInt(18,100), random.nextDouble() * 1000, random.nextInt(80,100)));
            }
        }
        list.forEach(employee -> System.out.println(employee));
        System.out.println();
        System.out.println();
        System.out.println();
        Collections.sort(list);
        list.forEach(employee -> System.out.println(employee));
    }
}