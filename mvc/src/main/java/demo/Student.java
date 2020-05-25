package demo;

public class Student {

    private String name ;
    private String surname;
    private String country;
    private String programingLanguage;

    public String getName() {
        return name;
    }

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public String getSurname() {
        return surname;
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
}
