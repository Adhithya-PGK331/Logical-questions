package Logicalquestions;

import java.util.Scanner;

public class Caeser_cipher_decryption {

	public static void main(String[] args) {
		String message, decryptedMessage = "";
		int key;char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a message: ");
		message = sc.nextLine();//message reading
		System.out.println("Enter the key: ");//inputing the key
		key = sc.nextInt();
		for(int i = 0; i < message.length(); i++){
			ch = message.charAt(i);
			if(ch >= 'a' && ch <= 'z'){
	            ch = (char)(ch - key);//by shifting
	            decryptedMessage += ch;//subtract character - key value
	        }
	        else if(ch >= 'A' && ch <= 'Z'){
	            ch = (char)(ch - key);
	            decryptedMessage += ch;
	        }
	        else {
	        	decryptedMessage += ch;
	        }
		}
		System.out.println("Decrypted Message = " + decryptedMessage);
	}

}
