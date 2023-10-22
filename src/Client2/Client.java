package Client2;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;
public class Client {


	public static void main(String[] args)  {
		try{
			System.out.println("je suis un client");
			
		    InetAddress inetAddress = InetAddress.getByName("192.168.100.11");
		    InetSocketAddress inetSocketAdd = new InetSocketAddress(inetAddress,1234);
		    Socket socket = new Socket();
		    socket.connect(inetSocketAdd);
		    System.out.println("je suis un client connecté");
		    
		    InputStream is = socket.getInputStream(); 
		    
		    OutputStream os = socket.getOutputStream(); 
		    Scanner scanner = new Scanner(System.in);
		    PrintWriter pw= new PrintWriter(os,true);		    
		    int nb;
		    System.out.println("nb= "); 
		     nb=scanner.nextInt();
		    String op;
		    do {
		    	System.out.println("choisir l'operateur (+,-,*,/) ");
		    	op=scanner.next(); 
		    }
		    while(!op.equals("+")&& !op.equals("-")&& !op.equals("*")&& !op.equals("/"));
		    os.write(nb); 
		    pw.println(op);
		    int res =is.read();
		    System.out.println(nb+""+op+"5 ="+res); 
		    System.out.println("deconnexion client");
	        socket.close();
		}
		catch(Exception e) {e.printStackTrace();};

	}

}

