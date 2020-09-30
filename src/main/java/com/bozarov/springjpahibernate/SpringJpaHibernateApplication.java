package com.bozarov.springjpahibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringJpaHibernateApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaHibernateApplication.class, args);
	}

}




//package com.bozarov.springjpahibernate;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import com.bozarov.springjpahibernate.domain.Account;
//import com.bozarov.springjpahibernate.domain.Car;
//import com.bozarov.springjpahibernate.domain.Person;
//import com.bozarov.springjpahibernate.repos.AccountRepository;
//import com.bozarov.springjpahibernate.repos.CarRepository;
//import com.bozarov.springjpahibernate.repos.PersonRepository;
//
//@SpringBootApplication
//public class SpringJpaHibernateApplication implements CommandLineRunner{
//
//	private final PersonRepository personRepository;
//	private final AccountRepository accountRepository;
//	private final CarRepository carRepository;
//
//
//	public SpringJpaHibernateApplication(PersonRepository personRepository, AccountRepository accountRepository,
//			CarRepository carRepository) {
//		super();
//		this.personRepository = personRepository;
//		this.accountRepository = accountRepository;
//		this.carRepository = carRepository;
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringJpaHibernateApplication.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		
//		Person person = new Person();
//		person.setName("John Wick");
//		
//		//     has an id
//		Person savedPerson = personRepository.save(person);
//		
//		
//		Account account = new Account();
//		account.setAccnumber(1234L);
//		account.setPerson(savedPerson);
//		
//		Account savedAccount = accountRepository.save(account);
//		
//		savedPerson.setAccount(savedAccount);
//		
//		personRepository.save(savedPerson);
//		
//		
//		Car car1 = new Car();
//		car1.setName("BMW");
//		car1.setPerson(savedPerson);
//		Car savedCar1 = carRepository.save(car1);
//		
//		Car car2 = new Car();
//		car2.setName("BMW 1");
//		car2.setPerson(savedPerson);
//		Car savedCar2 = carRepository.save(car2);
//		
//		Car car3 = new Car();
//		car3.setName("BMW 2");
//		Car savedCar3 = carRepository.save(car3);
//		
//		Car car4= new Car();
//		car4.setName("BMW 3");
//		car4.setPerson(savedPerson);
//		Car savedCar4 = carRepository.save(car4);
//		
//		Set<Car> cars = new HashSet<>();
//		cars.add(savedCar1);
//		cars.add(savedCar2);
//		cars.add(savedCar3);
//		cars.add(savedCar4);
//		
//		savedPerson.setCars(cars);
//		
//		personRepository.save(savedPerson);
//		
//	}
//	
//	
//
//}

