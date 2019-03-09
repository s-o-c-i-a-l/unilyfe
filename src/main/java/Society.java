import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Society implements Categorisable {

  private String name;
  private Set<String> focus;
  private Set<User> admins;

  public Society(String name, String ... focuses) {
    this.name = name;
    this.focus = new HashSet<>();
    for(String f : focuses) {
      this.focus.add(f);
    }
    this.admins = new HashSet<>();
  }

  public void addAdmin(User person) {
    admins.add(person);
  }

  @Override
  public void addCategory(String f) {
    focus.add(f);
  }

  @Override
  public void removeCategory(String category) {
    focus.remove(category);
  }

  @Override
  public int numberOfCategories() {
    return focus.size();
  }

  @Override
  public int numberOfMatchingCategories(Categorisable c) {
    Set<String> categoryOfC = c.getAllCategories();
    Iterator<String> iterator = categoryOfC.iterator();
    int matchingCategories = 0;

    while(iterator.hasNext()) {
      String category = iterator.next();
      if(focus.contains(category)) {
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
    return focus;
  }

}
