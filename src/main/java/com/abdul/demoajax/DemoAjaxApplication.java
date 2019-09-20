package com.abdul.demoajax;

import org.directwebremoting.spring.DwrSpringServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.abdul.demoajax.domain.SocialMetaTag;
import com.abdul.demoajax.service.SocialMetaTagService;

@SpringBootApplication
public class DemoAjaxApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoAjaxApplication.class, args);
	}

	@Autowired
	SocialMetaTagService service;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * SocialMetaTag tag = service.getSocialMetaTagByUrl(
		 * "https://www.pichau.com.br/gabinete-gamer-azza-luminous-110-lateral-de-vidro-led-rgb-azza-110"
		 * ); System.out.println(tag.toString());
		 */

	}

	@Bean
	public ServletRegistrationBean<DwrSpringServlet> dwrSpringServlet() {
		DwrSpringServlet dwrServlet = new DwrSpringServlet();

		ServletRegistrationBean<DwrSpringServlet> registrationBean = new ServletRegistrationBean<>(dwrServlet,
				"/dwr/*");

		registrationBean.addInitParameter("debug", "true");
		registrationBean.addInitParameter("activeReverseAjaxEnabled", "true");
		return registrationBean;
	}

}
