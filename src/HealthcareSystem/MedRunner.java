package HealthcareSystem;

import java.util.ArrayList;
import java.util.List;

public class MedRunner {
    public static void main(String[] args) {

        List<MedicalRecord> records = MedRunner.createMedicalRecord();

        MedicalRecord mr = new MedicalRecord("7/11/22", "Surgery admission");
        Patient p1 = new Patient(1232, "Steven");
        p1.addMedicalRecord(mr);
        System.out.println(p1.getMedicalHistory());
        Inpatient i1 = new Inpatient(1, "John", records, "2/11/22", "1211");
        i1.updateMedicalRecord(2, mr);
        System.out.println(i1.getMedicalHistory());
        Outpatient o1 = new Outpatient(3, "Venessa", records, "3/11/20", "Elom");
        //System.out.println(o1.getMedicalRecord(0));


        Hospital<Patient> h1 = new Hospital<>();
        h1.addPatient(p1);
        h1.addPatient(i1);
        h1.addPatient(o1);
        System.out.println(h1.getPatient(1));
        System.out.println(h1.getPatient(1232));

        //System.out.println();



    }
    private static List<MedicalRecord> createMedicalRecord() {
        MedicalRecord m1 = new MedicalRecord("4/11/23", "Check up visit");
        MedicalRecord m2 = new MedicalRecord("2/13/21", "Check up visit");
        MedicalRecord m3 = new MedicalRecord("2/13/22", "Check up visit");
        List<MedicalRecord> records = new ArrayList<>();
        records.add(m1);
        records.add(m2);
        records.add(m3);
        return records;
    }
}
