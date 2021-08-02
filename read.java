import java.io.FileReader;
import java.io.IOException;

public class read {

    public static void main(String[] args) {
        try {
            FileReader maestro = new FileReader("/home/maestro/Documents/myinfo/rahim.txt");
            int i;
            while ((i = maestro.read()) != -1){
                System.out.print((char) i);
                
            }            
            maestro.close();
        }

        catch (IOException e) {
            System.out.println("get the message" + e.getMessage());
        }
    }

    read master = new read();

}
