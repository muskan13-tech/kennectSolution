package org.kennect;

public class Appointment {
    private int appointmentID;
    private int patientID;
    private int doctorID;
    private int clinicID;
    private String timeSlot;

    public Appointment(int appointmentID, int patientID, int doctorID, int clinicID, String timeSlot) {
        this.appointmentID = appointmentID;
        this.patientID = patientID;
        this.doctorID = doctorID;
        this.clinicID = clinicID;
        this.timeSlot = timeSlot;
    }
    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public int getDoctorID() {
        return doctorID;
    }
    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public int getClinicID() {
        return clinicID;
    }

    public void setClinicID(int clinicID) {
        this.clinicID = clinicID;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }
}
