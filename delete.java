import java.io.File;
import java.io.IOException;

public class delete {
public static void main(String[] args) {

File maestro = new File("/home/maestro/Documents/myinfo/rahim.txt");



	if ( maestro.delete() ){

	System.out.println("succesful deleted");

}


else { System.out.println("not deleted");
}



	
}

}