package Extra;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class sandbox {
    public static void main(String[] args) {        

            String path = "C:/Users/Jon/Desktop/Jons Stuff/Java_SE/list.csv";
            String line = "";           

            try {
                BufferedReader br = new BufferedReader(new FileReader(path));
                
                while((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    
                    Random r = new Random();
                    int randomIndex = r.nextInt(values.length);
                    System.out.println(values[randomIndex]);
            }

            } catch (FileNotFoundException e) {
                e.printStackTrace();            
            } catch (IOException e) {
                e.printStackTrace();
            }
    
    }
}