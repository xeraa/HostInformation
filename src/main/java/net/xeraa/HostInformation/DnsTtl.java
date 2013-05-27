package net.xeraa.HostInformation;

import sun.net.InetAddressCachePolicy;

public class DnsTtl {

	public static String get() {
		return "DNS TTL: " + InetAddressCachePolicy.get();
	}

}
