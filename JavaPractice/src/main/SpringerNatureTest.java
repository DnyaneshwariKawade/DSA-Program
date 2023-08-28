package main;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SpringerNatureTest {

	private static Set<TaxiTicket> loadData() {
		TaxiTicket t1 = new TaxiTicket("PUNE", "MUMBAI", 120);
		TaxiTicket t2 = new TaxiTicket("PUNE", "NASIK", 200);
		TaxiTicket t3 = new TaxiTicket("MUMBAI", "GOA", 350);
		TaxiTicket t4 = new TaxiTicket("MUMBAI", "NASIK", 180);

		Set<TaxiTicket> list = new HashSet<>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		return list;
	}

	public static void main(String[] args) {
		Set<TaxiTicket> dataSet = loadData();
		prepareTaxiTicket("NASIK", "DELHI", dataSet, 2);

	}

	public static void prepareTaxiTicket(String s, String d, Set<TaxiTicket> setData, 
			int noOfTranveller) {
		int fair = 0;
		int limitKM = 100;
		
		
		for (TaxiTicket ticket : setData) {
			if ((ticket.getSource().equals(s) && ticket.getDestination().equals(d))
					|| (ticket.getDestination().equals(s) && ticket.getSource().equals(d))) {
				long distance = ticket.getDistance();
				int rem = (int) (distance - limitKM);
				fair = rem * 5 + 750;
			}
		}
		if(fair == 0) {
			System.out.println("Rout not found");
		}
		
		int result = fair * noOfTranveller;
		System.out.println(result);
	}
}

class TaxiTicket {
	private String source;
	private String destination;
	private long distance;

	public TaxiTicket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TaxiTicket(String source, String destination, long distance) {
		super();
		this.source = source;
		this.destination = destination;
		this.distance = distance;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public long getDistance() {
		return distance;
	}

	public void setDistance(long distance) {
		this.distance = distance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(destination, distance, source);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaxiTicket other = (TaxiTicket) obj;
		return Objects.equals(destination, other.destination) && distance == other.distance
				&& Objects.equals(source, other.source);
	}
}