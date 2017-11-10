package reviewssitefullstack;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReviewsPopulator implements CommandLineRunner {

	@Resource
	CategoryRepository categoryRepo;

	@Resource
	ReviewRepository reviewRepo;

	@Override
	public void run(String... args) throws Exception {

		Category category1 = new Category("Sci-Fi", "/images/the-matrix.jpg");
		categoryRepo.save(category1);
		Category category2 = new Category("Chick-Flicks", "/images/beaches.jpg");
		categoryRepo.save(category2);
		Category category3 = new Category("Comedy", "/images/dumb-and-dumber.jpg");
		categoryRepo.save(category3);
		Category category4 = new Category("Drama", "/images/fmj.jpg");
		categoryRepo.save(category4);

		Review review1 = new Review("The Matrix", "/images/the-matrix.jpg", category1);
		reviewRepo.save(review1);
		Review review2 = new Review("Beaches", "/images/beaches.jpg", category2);
		reviewRepo.save(review2);
		Review review3 = new Review("Dumb & Dumber", "/images/dumb-and-dumber.jpg", category3);
		reviewRepo.save(review3);
		Review review4 = new Review("Full Metal Jacket", "/images/fmj.jpg", category4);
		reviewRepo.save(review4);
	}

}
