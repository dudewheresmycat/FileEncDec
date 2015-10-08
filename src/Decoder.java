import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Decoder {

	public static void main(String[] args) throws Exception{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the key to decode this message: ");
		int key = keyboard.nextInt();
		keyboard.close();
		
		DataInputStream dataIn = new DataInputStream(new FileInputStream("secret.msg"));
		StringBuilder sb = new StringBuilder();
		String decodedMessage="";
		decodedMessage = dataIn.readUTF();
		
		char[] chars;
		chars = decodedMessage.toCharArray();
		
		for(int i = 0 ; i < chars.length; i++){

			char characterB = (char)(chars[i]-key);
			
			sb.append(characterB);
		}
		System.out.println(sb);
//		for(int i = 0 ; i < length ; i ++ ){
//			int dataFrom = dataIn.readInt();
//			System.out.println(dataFrom);
//			dataIn.readChar();
//		}
		dataIn.close();
	}

}