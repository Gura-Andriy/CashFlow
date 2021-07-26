package sample.trainings.interfaces;

import sample.languages.Languages;

import java.io.IOException;

public interface TrainingInterface {
    String getRandomTraining() throws IOException;
    void setLanguage(Languages language);
    Languages getLanguage();
    int getPrice();
}
