package com.deliveryfood.jpa;

import java.util.List;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.deliveryfood.DeliveryfoodApplication;
import com.deliveryfood.domain.model.Cozinha;

public class ConsultaCozinhaMain {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = (ApplicationContext) new SpringApplicationBuilder(DeliveryfoodApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CadastroCozinha cadastroCozinha = ((BeanFactory) applicationContext).getBean(CadastroCozinha.class);
		
		List<Cozinha> cozinhas = cadastroCozinha.listar();
		
		for (Cozinha cozinha : cozinhas ) {
			System.out.println(cozinha.getClass());
			}
		}
	}
