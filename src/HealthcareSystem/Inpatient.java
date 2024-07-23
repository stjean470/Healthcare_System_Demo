package HealthcareSystem;

import java.util.List;

public class Inpatient extends Patient{
    private String admissionsDate;
    private String roomNumber;

    public Inpatient(int patientID, String name, List<MedicalRecord> medicalHistory, String admissionsDate, String roomNumber) {
        super(patientID, name, medicalHistory);
        this.admissionsDate = admissionsDate;
        this.roomNumber = roomNumber;
    }

    public String getAdmissionsDate() {
        return admissionsDate;
    }

    public void setAdmissionsDate(String admissionsDate) {
        this.admissionsDate = admissionsDate;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Inpatient{" +
                "admissionsDate='" + admissionsDate + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                '}';
    }
}
