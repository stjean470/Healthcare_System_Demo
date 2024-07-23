package HealthcareSystem;

import java.util.Date;

public class MedicalRecord {
    private String date;
    private String description;

    public MedicalRecord(String data, String description) {
        this.date = data;
        this.description = description;
    }

    public String getData() {
        return date;
    }

    public void setData(String data) {
        this.date = data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MedicalRecord{" +
                "date='" + date + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
