import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Person implements Categorisable {

  private String name;
  private String gender;
  private Set<String> interests;
  private Set<Society> societiesInvolved;

  public Person(String name, String gender, String ... interest) {
    this.name = name;
    this.gender = gender;
    this.interests = new HashSet<>();

    for (String i : interest) {
      interests.add(i);
    }
    this.societiesInvolved = new HashSet<>();
  }

  public Set<Society> getSocietiesInvolved() {
    return societiesInvolved;
  }

  @Override
  public void addCategory(String interest) {
    interests.add(interest);
  }

  @Override
  public void removeCategory(String interest) {
    interests.remove(interest);
  }

  public void addSociety(Society society) {
    societiesInvolved.add(society);
  }

  @Override
  public int numberOfCategories() {
    return interests.size();
  }

  @Override
  public int numberOfMatchingCategories(Categorisable c) {
    Set<String> categoryOfC = c.getAllCategories();
    Iterator<String> iterator = categoryOfC.iterator();
    int matchingCategories = 0;

    while(iterator.hasNext()) {
      String category = iterator.next();
      if(interests.contains(category)) {
        matchingCategories ++;
      }
    }

    return matchingCategories;
  }

  @Override
  public Set<String> matchingCategories(Categorisable c) {
    return null;
  }

  @Override
  public Set<String> getAllCategories() {
    return interests;
  }

}
