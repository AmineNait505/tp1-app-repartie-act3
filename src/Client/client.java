package Client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
public class client {
	public static void main(String[]args) {
		try {
		Socket socket =new Socket("localhost",1234);
		System.out.println("Connected");
		InputStream is=socket.getInputStream();
		OutputStream os=socket.getOutputStream();
		System.out.println("Enter a number");
		Scanner scanner =new Scanner(System.in);
		int nb=scanner.nextInt();
		os.write(nb);
		System.out.println(nb+" * 5 = "+is.read());
		System.out.println(nb+" + 5 = "+is.read());
		socket.close();
		System.out.println("Closing Connexion");
	}catch(IOException e) {
		e.printStackTrace();
	}
}}
