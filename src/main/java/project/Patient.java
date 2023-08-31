package project;

import java.util.Objects;

public class Patient {
    private String name;
    private int age;
    private String medicalHistory;

    public Patient(String name, int age, String medicalHistory) {
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return age == patient.age && Objects.equals(name, patient.name) && Objects.equals(medicalHistory, patient.medicalHistory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, medicalHistory);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", medicalHistory='" + medicalHistory + '\'' +
                '}';
    }
}

