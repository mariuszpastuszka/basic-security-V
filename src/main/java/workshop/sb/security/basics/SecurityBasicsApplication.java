package workshop.sb.security.basics;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import workshop.sb.security.basics.config.AppSecurityConfig;

@SpringBootApplication
public class SecurityBasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(new Class[]{SecurityBasicsApplication.class, AppSecurityConfig.class}, args);
	}

	/*
		https://igorski.co/java/spring-boot/layout-dialect-spring-boot-2/
	 */
	@Bean
	public LayoutDialect layoutDialect() {
		return new LayoutDialect();
	}

}

/* TODO 1 podejrzyj metodę DispatcherServlet#doDispatch
    Ustaw breakpoint'a na początku metody

    Uruchom i wejdż do aplikacji.

    Na zatrzymanym debugerze, ewaluacja wyrażenia:

    SecurityContextHolder.getContext().getAuthentication()

 */