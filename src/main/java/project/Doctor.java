package project;

import java.util.Objects;

public class Doctor {
    private String name;
    private String specialty;
    private boolean available;

    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
        this.available = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return available == doctor.available && Objects.equals(name, doctor.name) && Objects.equals(specialty, doctor.specialty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, specialty, available);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", specialty='" + specialty + '\'' +
                ", available=" + available +
                '}';
    }
}

