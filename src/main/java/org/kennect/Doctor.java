package org.kennect;

public class Doctor {
    private int doctorID;
    private String name;

    public Doctor(int doctorID, String name) {
        this.doctorID = doctorID;
        this.name = name;
    }

    public int getDoctorID() {
        return doctorID;
    }
    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
