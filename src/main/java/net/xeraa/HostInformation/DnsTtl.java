package net.xeraa.HostInformation;

import sun.net.InetAddressCachePolicy;

@SuppressWarnings("restriction")
public class DnsTtl {

	public static String get() {
		return "DNS TTL: " + InetAddressCachePolicy.get();
	}

}
