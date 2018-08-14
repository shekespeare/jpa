package com.javasampleapproach.jpa.one2one;

import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import com.javasampleapproach.jpa.one2one.repository.HusbandRepository;
import com.javasampleapproach.jpa.one2one.repository.WifeRepository;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.javasampleapproach.jpa.one2one")
public class SpringJpaOneToOneApplication extends SpringBootServletInitializer{ //implements CommandLineRunner{	
	
	@Autowired
    WifeRepository wifeRepository;
     
    @Autowired
    HusbandRepository husbandRepository;

	public static void main(String[] args) {
		System.out.println("calling main--->>>>>>>>>>>>>>>>");
		SpringApplication.run(SpringJpaOneToOneApplication.class, args);
		System.out.println("calling main--->>>>>>>>>>>>>>>>ENdede");
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		System.out.println("calling main--->>>>>>>>>>>>>>>>tomcat initializer");
		return application.sources(SpringJpaOneToOneApplication.class);
				//application.sources(SpringJpaOneToOneApplication.class);
	}
	
	
//	@Override
//    public void run(String... arg0) throws Exception {
//    	deleteData();
//    	saveData();
//    	showData();
//    }
//    
//    @Transactional
//    private void deleteData(){
//    	wifeRepository.deleteAll();
//        husbandRepository.deleteAll();
//    }
//    
//    @Transactional
//    private void saveData(){
//    	// Store a wife to DB
//        Wife lisa = new Wife("Lisa", new Husband("David"));
//        wifeRepository.save(lisa);
//
//        // Store list wifes to DB
//        Wife mary = new Wife("Mary", new Husband("Peter"));
//        Wife lauren = new Wife("Lauren", new Husband("Phillip"));
//        
//        wifeRepository.save(Arrays.asList(mary, lauren));
//    }
//    
//    @Transactional
//    private void showData(){
//    	// get All data
//    	List<Wife> wifes = wifeRepository.findAll();
//        List<Husband> husbands = husbandRepository.findAll();
//         
//        System.out.println("===================Wifes:==================");
//        wifes.forEach(System.out::println);
//         
//        System.out.println("===================Husbands:==================");
//        husbands.forEach(System.out::println);
//    }
}