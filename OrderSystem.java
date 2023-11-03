import java.util.TreeMap;
import java.util.Collection;
//import java.util.ArrayList;
public class OrderSystem{
	private TreeMap<Time,Order> orderMp= new TreeMap<>();
	
	public void addOrder(Order order){
		orderMap.put(order.getEntryTime(), order);
	}
	
	public Collection<Order> search (Time startTime, Time endTime){
		return orderMp.subMap(startTime, endTime).values();
	}
}