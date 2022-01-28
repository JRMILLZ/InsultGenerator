import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Sandbox {
    public void insultGenerated() {        

            String path = "C:/Users/Jon/Desktop/Random_Insult/list.csv";
            String line = "";                      

            try {
                BufferedReader br = new BufferedReader(new FileReader(path));
                                
                while((line = br.readLine()) != null) {
                    String[] values = line.split(",");                    
                    Random r = new Random();
                    int randomIndex = r.nextInt(values.length);
                    String insult = (values[randomIndex]); 
                    System.out.println(insult);                                       
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();            
            } catch (IOException e) {
                e.printStackTrace();
            }
    
        }        
}
