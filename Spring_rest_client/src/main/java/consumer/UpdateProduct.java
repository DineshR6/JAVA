package consumer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UpdateProduct {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		IntegrationService service = applicationContext.getBean(IntegrationService.class);
		Product product = new Product();
		product.setArticleId(24);
		product.setTitle("sony11");
		product.setCategory("cameara11");

		String status = service.updateProduct(product);

		System.out.println(status);

	}
}

