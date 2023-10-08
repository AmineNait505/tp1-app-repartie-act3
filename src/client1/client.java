package client1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.Scanner;


public class client {
	
		public static void main(String[]args) {
			try {
			//Socket socket =new Socket("192.168.43.29",1234);
			InetAddress InetAdress=InetAddress.getByName("192.168.43.153");
			InetSocketAddress inetsocketadress=new InetSocketAddress(InetAdress,1234);
			Socket s=new Socket();
			s.connect(inetsocketadress);
			System.out.println("salem");
			InputStream is=s.getInputStream();
			OutputStream os=s.getOutputStream();
			Scanner scanner =new Scanner(System.in);
			int nb=scanner.nextInt();
			os.write(nb);
			System.out.println(is.read()+" "+is.read());
			s.close();
		}catch(IOException e) {}
	}}


