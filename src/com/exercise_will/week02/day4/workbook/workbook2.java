package com.exercise_will.week02.day4.workbook;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class workbook2 {
    public static void main(String[] args) throws IOException {
        // create file
        File file = new File("src/hello.txt");

        try{
            // checks if file exists, if not it creates a new one with the name above (.txt)
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e){
                    System.out.println("failed to create file");
                }
            }

            // create a writer
            FileWriter fileWriter = new FileWriter(file); // 'file, true' will append
            PrintWriter printWriter = new PrintWriter(fileWriter);

            // print to file
            printWriter.println("hello");
            printWriter.println("world");
            printWriter.println(":)");

            // once you are done writing to the file
            printWriter.flush();
            printWriter.close();

            // reads example
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
