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

		Category category1 = new Category("Sci-Fi", "/images/the-matrix.jpg", null);
		categoryRepo.save(category1);
		Category category2 = new Category("Chick-Flicks", "/images/beaches.jpg", null);
		categoryRepo.save(category2);
		Category category3 = new Category("Comedy", "/images/dumb-and-dumber.jpg", null);
		categoryRepo.save(category3);
		Category category4 = new Category("Drama", "/images/fmj.jpg", null);
		categoryRepo.save(category4);

		Review review1 = new Review("The Matrix", "/images/the-matrix.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risus rutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt ex laoreet quis. Sed et rutrum tellus, a cursus sem.",
				category1);
		reviewRepo.save(review1);
		Review review2 = new Review("Beaches", "/images/beaches.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risus rutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt ex laoreet quis. Sed et rutrum tellus, a cursus sem.",
				category2);
		reviewRepo.save(review2);
		Review review3 = new Review("Dumb & Dumber", "/images/dumb-and-dumber.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risus rutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt ex laoreet quis. Sed et rutrum tellus, a cursus sem.",
				category3);
		reviewRepo.save(review3);
		Review review4 = new Review("Full Metal Jacket", "/images/fmj.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risus rutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt ex laoreet quis. Sed et rutrum tellus, a cursus sem.",
				category4);
		reviewRepo.save(review4);
		Review review5 = new Review("The Matrix: Reloaded", "/images/the-matrix.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risus rutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt ex laoreet quis. Sed et rutrum tellus, a cursus sem.",
				category1);
		reviewRepo.save(review5);
		Review review6 = new Review("Titanic", "/images/titanic.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risus rutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt ex laoreet quis. Sed et rutrum tellus, a cursus sem.",
				category2);
		reviewRepo.save(review6);
		Review review7 = new Review("Big Trouble in Little China", "/images/big-trouble.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risus rutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt ex laoreet quis. Sed et rutrum tellus, a cursus sem.",
				category3);
		reviewRepo.save(review7);
		Review review8 = new Review("The Godfather", "/images/godfather.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec sed risus rutrum dolor aliquam rhoncus. Donec tempor eros orci, vitae tincidunt ex laoreet quis. Sed et rutrum tellus, a cursus sem.",
				category4);
		reviewRepo.save(review8);

	}

}
