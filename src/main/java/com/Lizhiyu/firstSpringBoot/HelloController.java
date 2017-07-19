package com.Lizhiyu.firstSpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lzy on 17-7-19.
 */
@RestController
public class HelloController {

	@RequestMapping("/")
		public String index() {
		return "Greetings from Spring boot!";
	}
}
