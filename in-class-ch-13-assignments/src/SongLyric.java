import java.nio.file.*;
import java.io.IOException;

public class SongLyric {
	
	public static void main(String[] args) {
		Path notepadPath = Paths.get("C:\\Users\\brian\\OneDrive\\Documents\\GitHub\\in-class-chapters-13-kmlindgren\\SongLyric.txt");
		Path msPath = Paths.get("C:\\Users\\brian\\OneDrive\\Documents\\GitHub\\in-class-chapters-13-kmlindgren\\MSSongLyric.docx");
		
		try {
			long notepadBytes = Files.size(notepadPath);
			System.out.println(String.format("Notepad file: " + "%, d bytes", notepadBytes));
			long msBytes = Files.size(msPath);
			System.out.println(String.format("MS file: " + "%, d bytes", msBytes));
		} catch(IOException e) {
			System.out.println("An exception occurred.");
		}
	}

}
