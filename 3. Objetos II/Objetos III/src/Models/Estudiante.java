package Models;

import java.time.LocalDate;

public class Estudiante extends Persona{
    private LocalDate dateAdmission;
    private Double monthlyFee;
    private String career;

    public Estudiante(){}

    public Estudiante(LocalDate dateAdmission, Double monthlyFee, String career) {
        this.dateAdmission = dateAdmission;
        this.monthlyFee = monthlyFee;
        this.career = career;
    }

    public Estudiante(Integer DNI, String name, String lastName, String email, String direction, Double monthlyFee, String career) {
        super(DNI, name, lastName, email, direction);
        this.dateAdmission = LocalDate.now();
        this.monthlyFee = monthlyFee;
        this.career = career;
    }

    public LocalDate getDateAdmission() {
        return dateAdmission;
    }

    public void setDateAdmission(LocalDate dateAdmission) {
        this.dateAdmission = dateAdmission;
    }

    public Double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(Double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
}
