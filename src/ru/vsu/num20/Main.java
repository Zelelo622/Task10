package ru.vsu.num20;

import ru.vsu.num20.common.Sort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String fileInput = "src/ru/vsu/num20/files/students.csv";
        String fileOutput = "src/ru/vsu/num20/files/sortListStudents.csv";
        int option = readInteger("1 - to sort by name\n" +
                "2 - to sort by course\n" +
                "3 - to sort by group number\n" +
                "--> ");
        if (option >= 1 && option <= 3) {
            writeFile(fileOutput, Sort.sortList(readCSVFile(fileInput), option));
        } else {
            System.out.println("Out of range number entered.");
        }
    }

    private static ArrayList<String> readCSVFile(String file) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            list.add(line);
        }
        bufferedReader.close();
        return list;
    }

    private static void writeFile(String fileOutput, ArrayList<Students> studentsList) throws IOException {
        FileWriter fileWriter = new FileWriter(fileOutput);
        for (Students line : studentsList) {
            fileWriter.write(line + "\n");
        }
        fileWriter.close();
    }

    private static int readInteger(String phrase) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter:\n%s", phrase);
        return scanner.nextInt();
    }
}
