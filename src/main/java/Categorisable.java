import java.util.Set;

public interface Categorisable {

	// return number of elements in the category table
	int numberOfCategories ();

	// return number of matches between two categorisable
	int numberOfMatchingCategories (Categorisable c);

	// get all category elements in a set
	Set<String> getAllElements ();

}
