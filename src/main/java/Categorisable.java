import java.util.Set;

public interface Categorisable {

	// add a new category to the category set
	void addCategory (String category);

	// remove a category from the category set
	void removeCategory (String category);

	// return number of elements in the category set
	int numberOfCategories ();

	// return number of matches between two categorisable
	int numberOfMatchingCategories (Categorisable c);

	// return matching categories as a set
	Set<String> matchingCategories (Categorisable c);

	// get all category elements in a set
	Set<String> getAllCategories();

}
