import java.io.File;
import java.io.IOException;


public class createR {

public static void main(String[] args) {

	try{
    File maestro = new File ("/home/maestro/Documents/myinfo/rahim.txt");
       if (maestro.createNewFile()){

       	System.out.println("succesful");
       }

else { System.out.println("failed");


}
      
	}
	catch(IOException e){ 	System.out.println("get message"+ e.getMessage());

	}
	}	
}



