package demo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
    @NotNull(message="name is required")
    @Pattern(regexp = "[A-Z][a-z]*", message = "Surname should start with a capital letter")
    private String name;

    @NotNull(message="name is required")
    @Pattern(regexp = "[A-Z][a-z]*", message = "Name should start with a capital letter")
    private String surname;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    @CourseCode
    private String courseCode;

    private String country;
    private String programingLanguage;
    private String[] operatingSystems;

    public String getName() {
        return name;
    }

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public String getSurname() {
        return surname;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setProgramingLanguage(String programingLanguage) {
        this.programingLanguage = programingLanguage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
