package org.kennect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Patient {
    private int patientID;
    private String name;

    public Patient(int patientID, String name) {
        this.patientID = patientID;
        this.name = name;
    }

    // Getter and setter methods
    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bookAppointment(int appointmentID, int doctorID, int clinicID, String time) {
        // Implement appointment booking logic here
        try {
            Connection conn = Database.connect();
            String sql = "INSERT INTO Appointments (AppointmentID, PatientID, DoctorID, ClinicID, TimeSlot) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, appointmentID);
            pstmt.setInt(2, getPatientID());
            pstmt.setInt(3, doctorID);
            pstmt.setInt(4, clinicID);
            pstmt.setString(5, time);
            pstmt.executeUpdate();
            pstmt.close();
            System.out.println("Appointment booked successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Database.disconnect();
        }
    }
}
