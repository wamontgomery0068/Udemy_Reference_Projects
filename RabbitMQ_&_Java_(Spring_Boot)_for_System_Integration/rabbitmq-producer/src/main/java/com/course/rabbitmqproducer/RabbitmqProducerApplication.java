package com.course.rabbitmqproducer;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

// import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.course.rabbitmqproducer.entity.Picture;
// import com.course.rabbitmqproducer.producer.PictureProducer;
import com.course.rabbitmqproducer.producer.PictureProducerTwo;

// import com.course.rabbitmqproducer.entity.Employee;
// import com.course.rabbitmqproducer.producer.EmployeeJsonProducer;
// import com.course.rabbitmqproducer.producer.HumanResourceProducer;
// import org.springframework.scheduling.annotation.EnableScheduling;

// import com.course.rabbitmqproducer.producer.HelloRabbitProducer;


@SpringBootApplication
// @EnableScheduling
public class RabbitmqProducerApplication implements CommandLineRunner {
	
	@Autowired
	private PictureProducerTwo pictureProducer;
	// private HumanResourceProducer employeeJsonProducer;
	// private EmployeeJsonProducer employeeJsonProducer;
	// private HelloRabbitProducer helloRabbitProducer;
	
	private final List<String> SOURCES = List.of("mobile", "web");
	
	private final List<String> TYPES = List.of("jpg", "png", "svg");

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqProducerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for (int i = 0; i < 10; i++) {
			var p = new Picture();
			
			p.setName("Picture" + i);
			p.setSize(ThreadLocalRandom.current().nextLong(1, 10001));
			p.setSource(SOURCES.get(i % SOURCES.size()));
			p.setType(TYPES.get(i % TYPES.size()));
			
			pictureProducer.sendMessage(p);
		}
		
//		for (int i = 0; i < 5; i++) {
//			var e = new Employee("emp " + i, "Employee " + i, LocalDate.now());
//			employeeJsonProducer.messageSend(e);
//		}
		
		// helloRabbitProducer.sendHello("Batman" + Math.random());
		
	}

}
