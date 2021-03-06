package com.company.p1_Person;

public class Child extends Person {

    public Child() {

    }

    public Child(String name, int age) {
        super.setName(name);
        this.setAge(age);
    }
    @Override
    protected void setAge(int age) {
        if (age > 15) {
            throw new IllegalArgumentException("Child's age must be lesser than 15!");
        }
        super.setAge(age);
    }
}
