package org.kennect;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Doctor doctor1 = new Doctor(1, "Dr. Smith");
        Clinic clinic1 = new Clinic(101, "City Clinic");
        Patient patient1 = new Patient(1001, "John Doe");

        // Test case
        patient1.bookAppointment(1, doctor1.getDoctorID(), clinic1.getClinicID(), "2023-09-15 10:00 AM");
    }
}