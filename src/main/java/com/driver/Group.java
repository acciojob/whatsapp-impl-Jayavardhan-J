package com.driver;

public class Group {
    private String name;

    public Group() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    private int numberOfParticipants;

    public String getName() {
        return name;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public Group(String name, int numberOfParticipants){
        this.name=name;
        this.numberOfParticipants=numberOfParticipants;
    }

}
