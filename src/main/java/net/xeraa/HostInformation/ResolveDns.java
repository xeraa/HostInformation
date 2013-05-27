package net.xeraa.HostInformation;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

public class ResolveDns {

	public static String get(String host){
		InetAddress inetAddress;
		try {
			inetAddress = InetAddress.getByName(host);
			return inetAddress.getHostName() + ": " + inetAddress.getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void run(String args[]){

		// Run in a 5 second loop to monitor for changes
		while (true) {

			// Get the IP address of the provided host or google.com
			String host = "google.com";
			if (args.length == 1) {
				host = args[0];
			}

			System.out.println(ResolveDns.get(host));
			System.out.println(new Date() + "\n");

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
