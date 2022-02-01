package com.exercise_will.week03.day1.garage_classes_exercises;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GarageDAO {

    public void postMapping(Garage garage) {

        String dirName = "/Users/williamburdett/Desktop/Intellij/IdeaProjects/BNTA_updated/src/com/exercise_will/week03/day1/garage_classes_exercises";
        String fileName = "garageDB_" + garage.getGarageNumber() + ".txt";

        File file = new File(dirName, fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            // create fileWriter with our txt file as an argument
            FileWriter fileWriter = new FileWriter(file);
            // create printWriter with fileWriter as argument
            PrintWriter myWriter = new PrintWriter(fileWriter);

            myWriter.println("Data for " + garage.getOwner().getName() + "'s Garage No." + garage.getGarageNumber());
            for (Car car : garage.getCars()) {
                if (car == null) {
                    myWriter.println("Free space.");
                } else {
                    myWriter.println(car.toStringCsv());
                }
                ;
            }
            // end of writing
            myWriter.flush();
            myWriter.close();

        } catch (Exception e) {
            System.out.println("Couldn't write to file.");
        }
    }

    public void readGarage(Garage garage) {

        String dirName = "/Users/williamburdett/Desktop/Intellij/IdeaProjects/BNTA_updated/src/com/exercise_will/week03/day1/garage_classes_exercises";
        String fileName = "garageDB_" + garage.getGarageNumber() + ".txt";

        File file = new File(dirName, fileName);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + ": when attempting to read " + fileName);
        }
    }

    public List<Car> findByManufacturer(Garage garage, String make) {
        String dirName = "/Users/williamburdett/Desktop/Intellij/IdeaProjects/BNTA_updated/src/com/exercise_will/week03/day1/garage_classes_exercises";
        String fileName = "garageDB_" + garage.getGarageNumber() + ".txt";

        File file = new File(dirName, fileName);


        if (!file.exists()) {
            System.out.println("Garage Database does not exist.");
        }
        List<Car> matches = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            scanner.nextLine(); // skips the first line
            while (scanner.hasNext()) {
                if (scanner.nextLine().equals("Free space.")) {
                    break;
                } else {
                    String[] split = scanner.nextLine().split(",");
                    Car car = new Car(split[0], split[1], Boolean.parseBoolean(split[2])); // how to grab a boolean
                    if (car.getMake().equalsIgnoreCase(make)) {
                        matches.add(car);
                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage() + ": when attempting to read " + fileName);
        }
        return matches;
    }

    public Car findByRegNum(Garage garage, String regNum) {
        String dirName = "/Users/williamburdett/Desktop/Intellij/IdeaProjects/BNTA_updated/src/com/exercise_will/week03/day1/garage_classes_exercises";
        String fileName = "garageDB_" + garage.getGarageNumber() + ".txt";

        File file = new File(dirName, fileName);

            if (!file.exists()) {
                System.out.println("Garage Database does not exist.");
            }
            try {
                Scanner scanner = new Scanner(file);
                scanner.nextLine();
                while (scanner.hasNext()) {
                    String carStr = scanner.nextLine();
                    if (carStr.equalsIgnoreCase("Free space.")){
                        continue;
                    } else {
                        String[] split = carStr.split(",");
                        Car car = new Car(split[0], split[1], Boolean.parseBoolean(split[2])); // how to grab a boolean
                        // System.out.println(car.toStringCsv());
                        if (car.getRegNumber().equals(regNum)) {
                            return car;
                        }
                    }
                }

            } catch (Exception e) {
                System.out.println(e.getMessage() + ": when attempting to read " + fileName);
            }
            System.out.println("Car not in Garage " + garage.getGarageNumber() + ".");
            return null;
        }

        public void deleteByRegNum(Garage garage, String regNum){
            Car car = findByRegNum(garage, regNum);
            if (car == null){
                System.out.println("Car not in Garage " + garage.getGarageNumber() + ".");
            } else {
                for (int i = 0; i < garage.getCars().length; i++) {
                    if (garage.getCars()[i].getRegNumber().equalsIgnoreCase(regNum) && garage.getCars()[i] != null) {
                        garage.getCars()[i] = null;
                        break;
                    }
                }
                postMapping(garage);
            }
        }
    }

