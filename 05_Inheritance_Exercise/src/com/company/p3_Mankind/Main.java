package com.company.p3_Mankind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String studentInput = reader.readLine();
        String workerInput = reader.readLine();

        String[] studentTokens = studentInput.split("\\s+");
        String studentFirstName = studentTokens[0];
        String studentLastName = studentTokens[1];
        String facultyNumber = studentTokens[2];
        
        String[] workerTokens = workerInput.split("\\s+");
        String workerFirstName = workerTokens[0];
        String workerLastName = workerTokens[1];
        double weekSalary = Double.parseDouble(workerTokens[2]);
        double hoursPerDay = Double.parseDouble(workerTokens[3]);

        try {
            Human student = new Student(studentFirstName, studentLastName, facultyNumber);
            Human worker = new Worker(workerFirstName, workerLastName, weekSalary, hoursPerDay);
            System.out.println(student);
            System.out.println(worker);

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
