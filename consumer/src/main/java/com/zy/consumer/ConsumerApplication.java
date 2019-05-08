package com.zy.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfiguration
@SpringBootApplication
//@RestController
public class ConsumerApplication {

//	@Autowired
//	private ConsumerService consumerService;

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

//	@RequestMapping(value = "/")
//	public User hello(){
//		return consumerService.getUser();
//	}

}
