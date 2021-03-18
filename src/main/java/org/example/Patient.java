package org.example;

public class Patient extends Person{
    private String diagnosis;
    public Patient(String navn, int ID,String diagnosis){
        super.setNavn(navn);
        this.ID=ID;
        this.diagnosis=diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
