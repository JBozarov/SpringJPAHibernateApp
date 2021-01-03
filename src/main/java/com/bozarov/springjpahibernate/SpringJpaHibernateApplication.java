package com.bozarov.springjpahibernate;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bozarov.springjpahibernate.domain.Account;
import com.bozarov.springjpahibernate.domain.Car;
import com.bozarov.springjpahibernate.domain.Hobby;
import com.bozarov.springjpahibernate.domain.Person;
import com.bozarov.springjpahibernate.repositories.AccountRepository;
import com.bozarov.springjpahibernate.repositories.CarRepository;
import com.bozarov.springjpahibernate.repositories.HobbyRespository;
import com.bozarov.springjpahibernate.repositories.PersonRepository;


@SpringBootApplication
public class SpringJpaHibernateApplication implements CommandLineRunner{
	
	private final PersonRepository personRepository; 
	private final AccountRepository accountRepository; 
	private final CarRepository carRepository; 
	private final HobbyRespository hobbyRespository; 
	
	public SpringJpaHibernateApplication(PersonRepository personRepository, AccountRepository accountRepository,
			CarRepository carRepository, HobbyRespository hobbyRespository) {
		this.personRepository = personRepository;
		this.accountRepository = accountRepository;
		this.carRepository = carRepository;
		this.hobbyRespository = hobbyRespository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Person John
		Person john = new Person(); 
		john.setName("Jahongir");
		Person savedJohn = personRepository.save(john); 
		
		Account johnAccount = new Account(21551556543L, savedJohn); 
		Account savedJohnAccount = accountRepository.save(johnAccount);
		savedJohn.setAccount(savedJohnAccount);
		
		Car sienna = new Car("Toyota Sienna", savedJohn);
		Car savedSienna = carRepository.save(sienna); 
		Car corolla = new Car("Toyota Corolla", savedJohn);
		Car savedCorolla = carRepository.save(corolla); 
		Car rx350 = new Car("Toyota RX350", savedJohn); 
		Car savedRx350 = carRepository.save(rx350); 
		Set<Car> savedJohnCars = new HashSet<>(); 
		savedJohnCars.add(savedSienna);
		savedJohnCars.add(savedCorolla);
		savedJohnCars.add(savedRx350); 
		savedJohn.setCars(savedJohnCars);
		System.out.println("Hello Omonjon");
		
		// Person Jacob 
		Person jacob = new Person(); 
		jacob.setName("Omonjon");
		Person savedJacob = personRepository.save(jacob); 
		
		Account jacobAccount = new Account(876435843483L, savedJacob); 
		Account savedJacobAccount = accountRepository.save(jacobAccount);
		savedJacob.setAccount(savedJacobAccount);
		
		Car altima = new Car("Nissan Altima", savedJacob); 
		Car savedAltima = carRepository.save(altima); 
		Car bmw = new Car("BMW X6", savedJacob);
		Car savedBmw = carRepository.save(bmw); 
		Set<Car> savedJacobCars = new HashSet<>(); 
		savedJacobCars.add(savedAltima); 
		savedJacobCars.add(savedBmw); 
		savedJacob.setCars(savedJacobCars);
		
		// Hobbies ManyToMany relationship with Person / People
		Set<Person> savedPeople = new HashSet<>(); 
		savedPeople.add(savedJohn); 
		savedPeople.add(savedJacob);
		Hobby soccer = new Hobby(" Soccer ", " Playing soccer game like a Messi! ", savedPeople); 
		Hobby savedSoccerHobby = hobbyRespository.save(soccer); 
		Hobby coding = new Hobby(" Coding ", " Code in Spring and Java ", savedPeople); 
		Hobby savedCodingHobby = hobbyRespository.save(coding);
		Set<Hobby> savedHobbies = new HashSet<>(); 
		savedHobbies.add(savedSoccerHobby); 
		savedHobbies.add(savedCodingHobby);
		
		savedJohn.setHobbies(savedHobbies);
		savedJacob.setHobbies(savedHobbies);
		
		personRepository.save(savedJohn); 
		personRepository.save(savedJacob); 
		
	}
	
	
	
	
	
	
}


