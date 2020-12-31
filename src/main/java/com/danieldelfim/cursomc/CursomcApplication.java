package com.danieldelfim.cursomc;

import java.util.Arrays;

import com.danieldelfim.cursomc.entities.Address;
import com.danieldelfim.cursomc.entities.Category;
import com.danieldelfim.cursomc.entities.City;
import com.danieldelfim.cursomc.entities.Client;
import com.danieldelfim.cursomc.entities.Product;
import com.danieldelfim.cursomc.entities.State;
import com.danieldelfim.cursomc.entities.enums.ClientType;
import com.danieldelfim.cursomc.repositories.AddressRepository;
import com.danieldelfim.cursomc.repositories.CategoryRepository;
import com.danieldelfim.cursomc.repositories.CityRepository;
import com.danieldelfim.cursomc.repositories.ClientRepository;
import com.danieldelfim.cursomc.repositories.ProductRepository;
import com.danieldelfim.cursomc.repositories.StateRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private StateRepository stateRepository;
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private AddressRepository addressRepository;
	// @Autowired
	// private PedidoRepository pedidoRepository;
	// @Autowired
	// private PaymentRepository paymentRepository;
	// @Autowired
	// private ItemPedidoRepository itemPedidoRepository;


	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{

		Category c1 = new Category(null, "informática");
		Category c2 = new Category(null, "escritório");

		Product p1 = new Product(null, "computador", 2000.00);
		Product p2 = new Product(null, "impressora", 800.00);
		Product p3 = new Product(null, "mouse", 80.00);

		State s1 = new State(null, "minas Gerais");
		State s2 = new State(null, "são paulo");

		City ci1 = new City(null, "Uberlândia", s1);
		City ci2 = new City(null, "São Paulo", s2);
		City ci3 = new City(null, "Campinas", s2);

		c1.getProducts().addAll(Arrays.asList(p1, p2, p3));
		c2.getProducts().addAll(Arrays.asList(p2));

		p1.getCategories().addAll(Arrays.asList(c1));
		p2.getCategories().addAll(Arrays.asList(c1, c2));
		p3.getCategories().addAll(Arrays.asList(c1));

		s1.getCities().addAll(Arrays.asList(ci1));
		s2.getCities().addAll(Arrays.asList(ci2, ci3));

		categoryRepository.saveAll(Arrays.asList(c1, c2));
		productRepository.saveAll(Arrays.asList(p1, p2, p3));
		stateRepository.saveAll(Arrays.asList(s1, s2));
		cityRepository.saveAll(Arrays.asList(ci1, ci2, ci3));

		Client cli1 = new Client(null, "Maria Silva", "maria@gmail.com", "36378912377", ClientType.PESSOA_FISICA);

		cli1.getPhones().addAll(Arrays.asList("27363323", "93838393"));

		Address e1 = new Address(null, "Rua Flores", "300", "Apto 303", "Jardim", "38220834", cli1, ci1);
		Address e2 = new Address(null, "Avenida Matos", "105", "Sala 800", "Centro", "38777012", cli1, ci2);

		cli1.getAddresses().addAll(Arrays.asList(e1, e2));

		clientRepository.saveAll(Arrays.asList(cli1));

		addressRepository.saveAll(Arrays.asList(e1, e2));
	
		// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		// Pedido ped1 = new Pedido(null, sdf.parse("30/09/2017 10:32"),null, cli1, e1);
		// Pedido ped2 = new Pedido(null, sdf.parse("10/10/2017 19:35"), null, cli1, e2);

		// Payment pay1 = new PaymentCard(null, PaymentStatus.QUITADO, ped1, 6);
		// ped1.setPayment(pay1);

		// Payment pay2 = new PaymentBillet(null, PaymentStatus.PENDENTE, ped2, sdf.parse("20/10/2017 00:00"), null);
		// ped2.setPayment(pay2);

		// cli1.getPedidos().addAll(Arrays.asList(ped1, ped2));

		// pedidoRepository.saveAll(Arrays.asList(ped1, ped2));
		// paymentRepository.saveAll(Arrays.asList(pay1, pay2));

		// 	ItemPedido ip1 = new ItemPedido(ped1, p1, 0.00, 1, 2000.00);
		// 	ItemPedido ip2 = new ItemPedido(ped1, p3, 0.00, 2, 80.00);
		// 	ItemPedido ip3 = new ItemPedido(ped2, p2, 100.00, 1, 800.00);
			
		// 	ped1.getItens().addAll(Arrays.asList(ip1, ip2));
		// 	ped2.getItens().addAll(Arrays.asList(ip3));
			
		// 	p1.getItens().addAll(Arrays.asList(ip1));
		// 	p2.getItens().addAll(Arrays.asList(ip3));
		// 	p3.getItens().addAll(Arrays.asList(ip2));
			
		// 	itemPedidoRepository.saveAll(Arrays.asList(ip1, ip2, ip3));	
	}
}
