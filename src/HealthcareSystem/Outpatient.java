package HealthcareSystem;

import java.util.List;

public class Outpatient extends Patient{
    private String appointmentDate;
    private String doctorName;

    public Outpatient(int patientID, String name, List<MedicalRecord> medicalHistory, String appointmentDate, String doctorName) {
        super(patientID, name, medicalHistory);
        this.appointmentDate = appointmentDate;
        this.doctorName = doctorName;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public String toString() {
        return "Outpatient{" +
                "appointmentDate='" + appointmentDate + '\'' +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }
}
