import java.util.Scanner;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class WriteCustomerList {

	public static void main(String[] args) {
		String id, fname, lname;
		double balanceOwed;
		Scanner input = new Scanner(System.in);
		
		Path file = Paths.get("C:\\Users\\brian\\OneDrive\\Documents\\GitHub\\in-class-chapters-13-kmlindgren");
		String[] array = new String[3];
		String s = "";
		final String DELIMITER = ",";
		final String QUIT = "q";
		try {
			OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
			
			while(id != QUIT) {
				System.out.print("Enter ID or 'q' to quit: ");
				input.nextLine();
				id = input.nextLine();
				System.out.print("Customer's first name: ");
				fname = input.nextLine();
				System.out.print("Customer's last name: ");
				lname = input.nextLine();
				System.out.print("Customer's balance owed: ");
				balanceOwed = input.nextInt();
				
			}	
		} catch (IOException e) {
			System.out.println("IO Exception");
		}
	}

}
