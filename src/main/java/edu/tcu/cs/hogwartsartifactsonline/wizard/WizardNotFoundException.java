package edu.tcu.cs.hogwartsartifactsonline.wizard;

public class WizardNotFoundException extends RuntimeException{
    public WizardNotFoundException(String objectName, String id) {
        super("Could not find " + objectName + " with Id " + id + " :(");
    }

    public WizardNotFoundException(String objectName, Integer id) {
        super("Could not find " + objectName + " with Id " + id + " :(");
    }
}