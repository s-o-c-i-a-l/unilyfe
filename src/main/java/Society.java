import java.util.ArrayList;
import java.util.List;

public class Society {

<<<<<<< Updated upstream
=======
  private String name;
  private List<String> focus;
  private List<Person> admins;

  public Society(String name, String ... focuses) {
    this.name = name;
    this.focus = new ArrayList<>();
    for(String f : focuses) {
      this.focus.add(f);
    }
    this.admins = new ArrayList<>();
  }

  public List<String> getFocus() {
    return focus;
  }

  public void addAdmin(Person person) {
    admins.add(person);
  }

  public void addFocus(String f) {
    focus.add(f);
  }
>>>>>>> Stashed changes

}
