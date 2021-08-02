import java.io.FileWriter;
import java.io.IOException;

public class write{
public static void main(String[] args) {


try{
FileWriter maestro = new FileWriter("/home/maestro/Documents/myinfo/rahim.txt");
maestro.write("the 2021 ballon dor winner is lionel andres messi aka la pulga ,if you dont like go and argue with your ancestors");
System.out.println(" ");
maestro.close();
System.out.println("done");}


catch(IOException e){
	System.out.println("get the message"+ e.getMessage());
}


	
}


}