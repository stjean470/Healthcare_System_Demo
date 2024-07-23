package HealthcareSystem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Hospital <T extends Patient>{
    private List<T> patients;

    public Hospital() {}

    public void addPatient(T patient) {
        if (patients == null) {
            patients = new ArrayList<>();
            patients.add(patient);
        }else {
            patients.add(patient);
        }

    }

    public T getPatient(int patientID) {
        for (T patient: patients) {
            if (patient.getPatientID() == patientID) {
                return patient;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "patients=" + patients +
                '}';
    }
}
