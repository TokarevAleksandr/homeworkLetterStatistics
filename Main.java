package homeworkLetterStatistics;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		ProofreadTextFromFile filereader = new ProofreadTextFromFile();
	        File file = new File("C:\\Java 24.11.21\\homeworkLetterStatistics\\textFile.txt");

	        filereader.reader(file);

	        System.out.println(filereader);
	}

}
