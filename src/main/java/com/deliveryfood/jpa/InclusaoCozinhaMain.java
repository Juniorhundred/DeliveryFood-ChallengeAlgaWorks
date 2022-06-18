
  package com.deliveryfood.jpa;
  import org.apache.catalina.core.ApplicationContext; import
  org.springframework.beans.factory.BeanFactory; import
  org.springframework.boot.WebApplicationType; import
  org.springframework.boot.builder.SpringApplicationBuilder; import
  com.deliveryfood.DeliveryfoodApplication; import
  com.deliveryfood.domain.model.Cozinha;
  
  public class InclusaoCozinhaMain {
  
  public static void main(String[] args) {
  
  ApplicationContext applicationContext = (ApplicationContext) new
  SpringApplicationBuilder(
  DeliveryfoodApplication.class).web(WebApplicationType.NONE).run(args);
  
  CadastroCozinha cadastroCozinha = ((BeanFactory)
  applicationContext).getBean(CadastroCozinha.class);
  
  Cozinha cozinha1 = new Cozinha(); cozinha1.setNome("Brasileira");
  
  Cozinha cozinha2 = new Cozinha(); cozinha2.setNome("Japonesa");
  
  cadastroCozinha.adicionar(cozinha1); cadastroCozinha.adicionar(cozinha2); } }
 