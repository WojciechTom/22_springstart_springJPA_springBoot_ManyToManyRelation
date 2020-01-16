package pl.javastart;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import pl.javastart.dao.ClientDao;
import pl.javastart.dao.OrderDao;
import pl.javastart.dao.ProductDao;
import pl.javastart.model.Client;
import pl.javastart.model.Order;
import pl.javastart.model.Product;


@SpringBootApplication
public class Application {

	public static void main(String[] args) throws InterruptedException {
			
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		ClientDao clientDao = ctx.getBean(ClientDao.class);
		OrderDao orderDao = ctx.getBean(OrderDao.class);
		ProductDao productDao = ctx.getBean(ProductDao.class);
		
// ADD NEW CUSTOMER, NEW ORDERS (without products)
		
		/*
		Client client1 = new Client("Wojciech", "Tomczyk", "Polna 2");
		Order order1 = new Order( "zamówienie świateczne", client1);
		Order order2 = new Order( "zamówienie noworoczne", client1);	
		
		
		clientDao.save(client1);
		
		orderDao.save(order1);
		orderDao.save(order2);
		*/

//ADD PRODUCTS TO ORDERS
		/*
		Product product1 = new Product("Pralka", 900.30, "Pralka automatyczna bosch");
		Product product2 = new Product("zmywarka", 1200.00, "zmywarka do zabudowy beko");
		Product product3 = new Product("lodówka", 1450.00, "lodówka podwójna beko nofrost");
		Product product4 = new Product("Telewizor", 5900.30, "ultracienki telewizor samsung");
		Product product5 = new Product("smartphone", 950.00, "smartphone samsung A7");
		Product product6 = new Product("laptop", 3499.00, "laptop dell inspiron 15cali");
		
		orderDao.addProductToOrder(1L, product1);
		orderDao.addProductToOrder(1L, product2);
		orderDao.addProductToOrder(1L, product3);
		orderDao.addProductToOrder(2L, product4);
		orderDao.addProductToOrder(2L, product5);
		orderDao.addProductToOrder(1L, product6);
		*/
		
//ADD MORE CLIENT AND ORDERS WITH PRODUCT		
		/*
		Client client2 = new Client("Tomasz", "Wilk", "Graniczna 12");
		clientDao.save(client2);
		
		Order order3 = new Order("zamówienie swiateczne", client2);
		Order order4 = new Order("zamówienie noworoczne", client2);
		
		orderDao.save(order3);
		orderDao.save(order4);
		*/
	
		
		
		
		
		
//EDIT CLIENT, ORDER AND PRODUCT 
		
		
		//Client clientToChange = clientDao.get(1L);
		//clientToChange.setFirstName("Franek");
		//clientDao.update(clientToChange);
	
		//Order orderToChange = orderDao.get(1L);
		//orderToChange.setOrderDetails("coś innego niż bylo");
		//orderDao.update(orderToChange);
		
		//Product productToChange = productDao.get(2L);
		//productToChange.setName("zmieniona nazwa");
		//productDao.update(productToChange);
		 
		
		
//REMOVE A CLIENT
		
		/*
		Client clientToRemove = clientDao.get(1L);
		Order orderToRemove = orderDao.get(2L);
		clientDao.remove(clientToRemove);
		orderDao.remove(orderToRemove);
		*/
		
		System.out.println("wydruk klienta:" + clientDao.get(1L));
		System.out.println("Wydruk zamówienia:" + orderDao.get(1L));
		ctx.close();
	}

}
