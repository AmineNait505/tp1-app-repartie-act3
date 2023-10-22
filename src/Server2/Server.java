package Server2;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
	public static void main(String[] args)  {
	      try {
	    	  System.out.println("je suis un serveur");
	          ServerSocket serverSocket = new ServerSocket(1234); 
	          System.out.println("je suis un serveur , j'atend un client");
	          Socket socket=serverSocket.accept();
	          System.out.println("un client est connecté");
	          InputStream is = socket.getInputStream(); 
	          OutputStream os = socket.getOutputStream(); 
	          InputStreamReader isr=new InputStreamReader(is);
	          BufferedReader br = new BufferedReader(isr);
	          int nb=is.read(); 
	          String op=br.readLine(); 
	          int res;
	          switch(op) {
	          case "+":res=nb+5;break;
	          case"-":res=nb-5;break;
	          case"*": res=nb*5;break;
	          case"/":res=nb/5;break;
	          default: res=0;
	          }
	          os.write(res);
	          System.out.println("deconnexion serveur");
	          socket.close();
	          serverSocket.close(); 
	      }
	      catch(Exception e) {e.printStackTrace();}
		}

	}

