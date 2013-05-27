package net.xeraa.HostInformation;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Hostname {

	public static String get() {
		try {
			return ("Hostname: " + InetAddress.getLocalHost().getHostName());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return null;
	}

}
