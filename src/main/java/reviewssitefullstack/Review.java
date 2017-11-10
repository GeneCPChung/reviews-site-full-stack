package reviewssitefullstack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String images;
	private String movieTitle;

	@ManyToOne
	private Category movieCategory;

	protected Review() {

	}

	public Review(String movieTitle, String images, Category movieCategory) {
		this.movieTitle = movieTitle;
		this.movieCategory = movieCategory;
		this.images = images;
	}

	public Long getId() {
		return id;
	}

	public String getImages() {
		return images;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public Category getMovieCategory() {
		return movieCategory;
	}

}
