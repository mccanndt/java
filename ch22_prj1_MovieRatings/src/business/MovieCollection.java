package business;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MovieCollection {
	private List<Movie> movies;

	public MovieCollection() {
		movies = new ArrayList<>();
	}

	public void add(Movie movie) {
		movies.add(movie);
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public List<Movie> filterMovies(Predicate<Movie> condition) {
		List<Movie> filteredMovies = new ArrayList<>();
		for (Movie m : movies) {
			if (condition.test(m)) {
				filteredMovies.add(m);
			}
		}
		return filteredMovies;
	}

	public double getLowestRating() {
		return movies.stream().map(Movie::getRating).reduce(5.0, Math::min);
	}

	public double getHighestRating() {
		return movies.stream().map(Movie::getRating).reduce(0.0, Math::max);
	}

	public double getAverageRating() {
		double sum = movies.stream().map(Movie::getRating).reduce(0.0, (a, b) -> a + b);
		return sum / getSize();
	}

	public int getSize() {
		return movies.size();
	}

}
