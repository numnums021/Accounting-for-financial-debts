package com.danya.spring.mvc_hibernate_aop.entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.*;

@Entity
@Table(name = "debtors")
public class Debtors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @Size(min=2, max=25)
    private String name;

    @Column(name = "surname")
    @Size(min=2, max=25)
    private String surname;

    @Column(name = "patronymic")
    @Size(min=2, max=25)
    private String patronymic;

    @Column(name = "debtor_val")
    private int debtor_val;

    public Debtors() {
    }

    public Debtors(String name, String surname, String patronymic, int debtor_val) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.debtor_val = debtor_val;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getDebtor_val() {
        return debtor_val;
    }

    public void setDebtor_val(int debtor_val) {
        this.debtor_val = debtor_val;
    }

}
