package HealthcareSystem;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private int patientID;
    private String name;
    private List<MedicalRecord> medicalHistory;

    public Patient(int patientID, String name) {
        this.patientID = patientID;
        this.name = name;
        this.medicalHistory = new ArrayList<>();
    }

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

    public List<MedicalRecord> getMedicalHistory() {
        return medicalHistory;
    }

    public void addMedicalRecord(MedicalRecord record) {
        medicalHistory.add(record);
    }

    public void updateMedicalRecord(int index, MedicalRecord newRecord) {
        medicalHistory.add(index, newRecord);
    }

    public MedicalRecord getMedicalRecord(int index) {
        if (index >= 0 && index < medicalHistory.size()) {
            return medicalHistory.get(index);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientID=" + patientID +
                ", name='" + name + '\'' +
                ", medicalHistory=" + medicalHistory +
                '}';
    }
}
