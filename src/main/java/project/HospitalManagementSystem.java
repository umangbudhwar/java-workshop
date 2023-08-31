package project;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class HospitalManagementSystem {
    private HashMap<String, Patient> patients = new HashMap<>();
    private HashMap<String, Doctor> doctors = new HashMap<>();
    private PriorityQueue<Appointment> appointments = new PriorityQueue<>(
            Comparator.comparing(Appointment::getDateTime)
    );

    public void addPatient(Patient patient) {
        patients.put(patient.getName(), patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.put(doctor.getName(), doctor);
    }

    public void addAppointment(Appointment appointment) {
        appointments.offer(appointment);
    }

    public Patient searchPatientByName(String name) {
        return patients.get(name);
    }

    public Doctor searchDoctorByName(String name) {
        return doctors.get(name);
    }

    public void viewAppointmentsForPatient(String patientName) {
        System.out.println("Appointments for " + patientName + ":");
        for (Appointment appointment : appointments) {
            if (appointment.getPatient().getName().equals(patientName)) {
                System.out.println("Date & Time: " + appointment.getDateTime() +
                        ", Doctor: " + appointment.getDoctor().getName());
            }
        }
    }

    public void viewAppointmentsForDoctor(String doctorName) {
        System.out.println("Appointments for " + doctorName + ":");
        for (Appointment appointment : appointments) {
            if (appointment.getDoctor().getName().equals(doctorName)) {
                System.out.println("Date & Time: " + appointment.getDateTime() +
                        ", Patient: " + appointment.getPatient().getName());
            }
        }
    }

    public void startAppointments() {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        while (!appointments.isEmpty()) {
            Appointment appointment = appointments.poll();
            if (appointment != null) {
                executor.submit(new AppointmentThread(appointment));
            }
        }

        executor.shutdown();
    }

    private class AppointmentThread implements Runnable {
        private Appointment appointment;

        public AppointmentThread(Appointment appointment) {
            this.appointment = appointment;
        }

        @Override
        public void run() {
            Doctor doctor = appointment.getDoctor();
            synchronized (doctor) {
                if (doctor.isAvailable()) {
                    doctor.setAvailable(false);
                    System.out.println(appointment.getPatient().getName() +
                            " is being treated by Dr. " + doctor.getName() +
                            " at " + appointment.getDateTime());
                    doctor.setAvailable(true);
                } else {
                    System.out.println("Dr. " + doctor.getName() + " is busy.");
                }
            }
        }
    }

    public static void main(String[] args) {
        HospitalManagementSystem hospital = new HospitalManagementSystem();

        Patient patient1 = new Patient("Alice", 30, "No significant history");
        Patient patient2 = new Patient("Bob", 40, "Allergies");
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        Doctor doctor1 = new Doctor("Dr. Smith", "Cardiologist");
        Doctor doctor2 = new Doctor("Dr. Johnson", "Pediatrician");
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);


        LocalDateTime dateTime1 = LocalDateTime.of(2023, 8, 30, 10, 0);
        LocalDateTime dateTime2 = LocalDateTime.of(2023, 8, 30, 14, 0);

        Appointment appointment1 = new Appointment(patient1, doctor1, dateTime1);
        Appointment appointment2 = new Appointment(patient2, doctor2, dateTime2);

        hospital.addAppointment(appointment1);
        hospital.addAppointment(appointment2);

        Patient foundPatient = hospital.searchPatientByName("Alice");
        if (foundPatient != null) {
            System.out.println("Found patient: " + foundPatient.getName());
        } else {
            System.out.println("Patient not found.");
        }

        Doctor foundDoctor = hospital.searchDoctorByName("Dr. Smith");
        if (foundDoctor != null) {
            System.out.println("Found doctor: " + foundDoctor.getName());
        } else {
            System.out.println("Doctor not found.");
        }

        hospital.viewAppointmentsForPatient("Alice");
        hospital.viewAppointmentsForDoctor("Dr. Smith");

        // Start appointments using multithreading
        hospital.startAppointments();
    }
}

