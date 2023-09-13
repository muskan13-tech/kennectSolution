package org.kennect;

public class Clinic {
    private int clinicID;
    private String name;

    public Clinic(int clinicID, String name) {
        this.clinicID = clinicID;
        this.name = name;
    }

    public int getClinicID() {
        return clinicID;
    }
    public void setClinicID(int clinicID) {
        this.clinicID = clinicID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
