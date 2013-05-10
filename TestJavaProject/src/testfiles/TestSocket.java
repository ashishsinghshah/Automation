package testfiles;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TestSocket 
{
	
	public static void main (String[] argv)
	{
		Socket soc = new Socket();
		InetSocketAddress inetAddress = new InetSocketAddress("172.28.142.8", 8080);
		try {
			soc.connect(inetAddress, 3000);
			System.out.println("getting connected");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("not connected");
			e.printStackTrace();
		}
	}

}
