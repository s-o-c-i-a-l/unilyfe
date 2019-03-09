import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
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

  public void addInterest(String interest) {
    interests.add(interest);
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
    Set<String> categoryOfC = c.getAllElements();
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
  public Set<String> getAllElements() {
    return interests;
  }
}
