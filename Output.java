import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Output {
    Scanner scanner = new Scanner(System.in);
    public void display() {
        String csvFileName = "data.csv"; // Name of the CSV file

        try {
            BufferedReader reader = new BufferedReader(new FileReader(csvFileName));
            String line;

            // Read each line from the CSV file
            System.out.println("\n\n\n\t================================================== Display all the soft drinks ===============================================\n");
            System.out.println("\t\tID\t\t\tName soft drinks\tQuantity\t\tPrice\t\t\tDeley\n");
            while ((line = reader.readLine()) != null) {
                // Split the line by comma (assuming CSV format)
                String[] data = line.split(",");

                // Process the data as needed
                for (String value : data) {
                    System.out.print("\t\t"+value.trim()+"\t"); // Print each value (trim removes leading/trailing spaces)
                }
                System.out.println(); // Move to the next line
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
        }
    }
    public void filed() throws IOException{
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        System.out.println();
        try (FileReader reade = new FileReader("diplay.txt")) {
            int dat = reade.read();
            while(dat != -1){
                System.out.print((char)dat);
                dat = reade.read();
            }
        }
    }
    public void gomenu() throws IOException{
        System.out.println("\t==============================================================================================================================\n");
            System.out.print("\n\t\t\t\t\t\tEnter Number 1 go to menu: ");
            int i = scanner.nextInt();
            if(i == 1){
                Menu menu1 = new Menu();
                menu1.menu();
            }
            scanner.close();
    }
}
