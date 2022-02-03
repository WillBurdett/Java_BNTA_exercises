package com.exercise_will.week02.day2.classes_files_exercises.Exercise5;

import java.io.File;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Questionnaire {
    private int id;
    private LocalDate dateCreated;
    private String companyName;
    private String questionnaireName;
    private List questions;
    private List<File> completed;

    public Questionnaire(int id, LocalDate dateCreated, String companyName, String questionnaireName, List questions, List<File> completed) {
        this.id = id;
        this.dateCreated = dateCreated;
        this.companyName = companyName;
        this.questionnaireName = questionnaireName;
        this.questions = questions;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getQuestionnaireName() {
        return questionnaireName;
    }

    public void setQuestionnaireName(String questionnaireName) {
        this.questionnaireName = questionnaireName;
    }

    public List getQuestions() {
        return questions;
    }

    public void setQuestions(List questions) {
        this.questions = questions;
    }

    public List<File> getCompleted() {
        return completed;
    }

    public void setCompleted(List<File> completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Questionnaire{" +
                "id=" + id +
                ", dateCreated=" + dateCreated +
                ", companyName='" + companyName + '\'' +
                ", questionnaireName='" + questionnaireName + '\'' +
                ", questions=" + questions +
                ", completed=" + completed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Questionnaire that = (Questionnaire) o;
        return id == that.id && Objects.equals(dateCreated, that.dateCreated) && Objects.equals(companyName, that.companyName) && Objects.equals(questionnaireName, that.questionnaireName) && Objects.equals(questions, that.questions) && Objects.equals(completed, that.completed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateCreated, companyName, questionnaireName, questions, completed);
    }
}
