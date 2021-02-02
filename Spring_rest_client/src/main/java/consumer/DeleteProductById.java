package consumer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DeleteProductById {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		IntegrationService service = applicationContext.getBean(IntegrationService.class);
		String result = service.deleteProduct("1");
		System.out.println(result);
	}
}