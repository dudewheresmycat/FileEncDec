
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Encoder {

	public static void main(String[] args) throws IOException {
		
		
		System.out.println("What is your message?");
		Scanner keyboard = new Scanner(System.in);
		String message = keyboard.nextLine();
		
		System.out.println("What is the key? (0 to 1000)");
		int key = keyboard.nextInt();
		
		FileOutputStream fos = new FileOutputStream("secret.msg");
		DataOutputStream dos = new DataOutputStream(fos);
		
		StringBuilder sb = new StringBuilder(message.length());
		for(char c : message.toCharArray()){
			sb.append((char)(c + key));
		}
		
		dos.writeUTF(sb.toString());
		dos.close();
	}

}