package pl.javastart.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pl.javastart.model.Order;
import pl.javastart.model.Product;

@Repository
@Transactional
public class OrderDao extends GenericDao<Order, Long> {

	@Autowired
	private ProductDao productDao;
	
	public void addProductToOrder(Long order_id, Product product) {
		productDao.save(product);
		Order order = get(order_id);
		if(order != null) {
			order.getProducts().add(product);
		}
	}
}
