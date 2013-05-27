package net.xeraa.HostInformation;

public class Run {
	public static void main(String[] args) {
		System.out.println(DnsTtl.get());
		System.out.println(Hostname.get());
	}
}
