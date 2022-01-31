import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Sandbox {
    public static void main(String[] args) throws IOException {
        //identify the path to the csv file alternatively if it is located in your root file you can just use the file name
        String path = "list.csv";
        String line = "";

        BufferedReader br = new BufferedReader(new FileReader(path));

        while((line = br.readLine()) != null) {
            String[] values = line.split(",");

            Random rand = new Random();
            int indexNum = rand.nextInt(values.length);
            String insult = values[indexNum];
            System.out.println(insult);              
        }        
    }
}
