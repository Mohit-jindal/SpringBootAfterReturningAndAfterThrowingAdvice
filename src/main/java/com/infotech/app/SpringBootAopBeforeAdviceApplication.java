package com.infotech.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.infotech.app.model.Account;
import com.infotech.app.service.AccountService;
import com.infotech.app.service.impl.AccountServiceImpl;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)	//we need this annotation for service classes for which we created advices that implements any interface
public class SpringBootAopBeforeAdviceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootAopBeforeAdviceApplication.class, args);
		AccountService accountService = context.getBean("accountServiceImpl", AccountServiceImpl.class);
		accountService.updateAccountBalance(new Account("67676767","Money Transfer"),3000L);
	}

}
