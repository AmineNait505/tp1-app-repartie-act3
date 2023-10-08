package Server;


import java.io.*;
import java.net.*;


public class server {
	public static void main(String[]args)  {
		try {
		System.out.println("je suis un serveur");
		ServerSocket serverSocket=new ServerSocket(1234);
		System.out.println("waiting");
		Socket socket=serverSocket.accept();
		System.out.println("connected");
		InputStream is=socket.getInputStream();
		OutputStream os=socket.getOutputStream();
		int nb=is.read();
		int rep=nb*5;
		int rep1=nb+5;
		os.write(rep);
		os.write(rep1);
		socket.close();
		serverSocket.close();
	}catch(IOException e){
		e.printStackTrace();
	}
		}

	}

