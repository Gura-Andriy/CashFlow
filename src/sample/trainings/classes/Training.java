package sample.trainings.classes;

import sample.languages.Languages;
import sample.trainings.interfaces.TrainingInterface;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Training  implements TrainingInterface {
    private final int price = 10000;
    private Languages language;
    String filePath = "sample/languages/russian/trainings.txt";
    ArrayList<Integer> usedTrainingsList;

    @Override
    public String getRandomTraining() throws IOException {
        Integer newRandomTrainingNumber = (int) Math.random() * 50;
        String trainingText = null;
        if (usedTrainingsList.size() < 50) {
            while (usedTrainingsList.contains(newRandomTrainingNumber)){
                newRandomTrainingNumber = (int) Math.random() * 50;
                trainingText = Files.lines(Paths.get(filePath))
                        .collect(Collectors.toList())
                        .get(newRandomTrainingNumber);
            }
        } else {
            trainingText = Files.lines(Paths.get(filePath))
                    .collect(Collectors.toList())
                    .get(newRandomTrainingNumber);
        }
        return trainingText;
    }

    @Override
    public void setLanguage(Languages language) {
        this.language = language;
    }

    @Override
    public Languages getLanguage() {
        return language;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
