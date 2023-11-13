import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;

public class Generate {
	public static void main(String[] args) throws java.io.IOException {
		FileWriter out = new FileWriter("Summa.java");
		FileReader skelReader1 = null;
		FileReader skelReader2 = null;
		Scanner skel1 = null;
		Scanner skel2 = null;
		int maxNum;
		String skelFile1 = "./src/skel1.txt";
		String skelFile2 = "./src/skel2.txt";
		
		try {
			skelReader1 = new FileReader(skelFile1);
			skel1 = new Scanner(skelReader1);

			skelReader2 = new FileReader(skelFile2);
			skel2 = new Scanner(skelReader2);
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		try {
			maxNum = Integer.parseInt(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			Scanner in = new Scanner(System.in);
			maxNum = Integer.parseInt(in.next());
			in.close();
		}

		while(skel1.hasNextLine()) {
			out.append(skel1.nextLine() + '\n');
		}
		skel1.close();

		// Bullshit time!
		for (int i = 1; i <= maxNum; i++) {
			for (int j = 0; j <= maxNum; j++) {
				out.append("\t\telse if((num1 == " + i + ") && (num2 == " + j + ")) {\n");
				out.append("\t\t\tSystem.out.println(" + (i + j) + ");\n");
				out.append("\t\t}\n");
			}
		}
		// EOB (End Of Bullshit)

		while(skel2.hasNextLine()) {
			out.append(skel2.nextLine() + '\n');
		}

		skel2.close();
		out.close();
	}
}
