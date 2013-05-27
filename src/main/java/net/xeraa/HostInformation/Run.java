package net.xeraa.HostInformation;

public class Run {
	public static void main(String[] args) {

		// Get the host's DNS TTL
		System.out.println(DnsTtl.get());

		// Get the hostname
		System.out.println(Hostname.get());

		// Resolve a DNS entry and loop to monitor for changes
		ResolveDns.run(args);
	}
}
