package com.nt;

import java.util.Date;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.entities.OrderDtlsEntity;
import com.nt.repositories.OrderDtlsRepositries;

@SpringBootApplication
public class SbProj09CustomGeneratorJpaRepoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SbProj09CustomGeneratorJpaRepoApplication.class, args);
		OrderDtlsRepositries dtlsRepo = ctx.getBean(OrderDtlsRepositries.class);
		
		OrderDtlsEntity entity=new OrderDtlsEntity();
		
		entity.setOrderPlaceBy("Suru");
		entity.setOrderDate(new Date());
		
		OrderDtlsEntity saveEntity = dtlsRepo.save(entity);
		System.out.println("Record Saved :: "+saveEntity);
		
		//close stream
		ctx.close();
	}

}//class
