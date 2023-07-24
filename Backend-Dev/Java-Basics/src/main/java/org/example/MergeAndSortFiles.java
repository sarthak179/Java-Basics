package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MergeAndSortFiles {

    public static void sortNumbersInFiles() throws IOException {
        List<Integer> l1 = new ArrayList<>();

        FileInputStream fis1 = new FileInputStream("Files/in1.txt");
        Scanner sc1 = new Scanner(fis1);

        while(sc1.hasNextLine()) {
            l1.add(Integer.valueOf(sc1.nextLine()));
        }

        FileInputStream fis2 = new FileInputStream("Files/in2.txt");
        Scanner sc2 = new Scanner(fis2);

        while(sc2.hasNextLine()) {
            l1.add(Integer.valueOf(sc2.nextLine()));
        }
        Collections.sort(l1);

        FileWriter outputWriter = new FileWriter("Files/in3.txt");

        for (int i = 0; i < l1.size(); i++) {
            outputWriter.write(Integer.toString(l1.get(i))+System.getProperty( "line.separator" ));

        }
        outputWriter.flush();
        outputWriter.close();
    }
}
