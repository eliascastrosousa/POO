package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		LocalDateTime data = LocalDateTime.now();
		Order order = new Order(1080,OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus s1 = OrderStatus.DELIVERED;
		OrderStatus s2 = OrderStatus.valueOf("DELIVERED");
		
		
		System.out.println(s1);
		System.out.println(s2);

		
	}

}
