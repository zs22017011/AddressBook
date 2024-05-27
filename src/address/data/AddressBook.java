package address.data;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddressBook {

    Scanner sc = new Scanner(System.in);

    AddressEntry addressEntryList;
    String fileName;

    public void list(){

    }
    public void remove(String lastName){

    }

    public void add (AddressEntry addressEntry)  {
        if (fileName == null || fileName.isEmpty()) {
            System.out.println("Please enter a file name: ");
            fileName = sc.nextLine();
            try (FileWriter writer = new FileWriter(fileName)) {
                writer.write("**Address Book FileSaver**");
                System.out.println("File created successfully!");
            } catch (IOException e) {
                System.out.println("An error occurred while creating the file.");
                e.printStackTrace();
            }
        }

    }

    public void redFromFile(String filename){

    }

    public void find (String startOf_lastName){

    }
}
