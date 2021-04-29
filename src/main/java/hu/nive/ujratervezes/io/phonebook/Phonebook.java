package hu.nive.ujratervezes.io.phonebook;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;

public class Phonebook {

    public static void exportPhonebook(Map<String, String> contacts, String output) throws FileNotFoundException {
        if(contacts == null || output == null) {
            throw new IllegalArgumentException("n must be positive");
        }

        PrintWriter outputFile = new PrintWriter(output);
        for(String key :contacts.keySet()) {
            outputFile.println(key +": "+ contacts.get(key));
        }
        outputFile.close();
    }
}