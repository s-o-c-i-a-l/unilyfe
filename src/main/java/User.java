import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class User implements Categorisable {

  private String name;
  private String gender;
  private Set<String> interests;
  private Set<Society> societiesInvolved;
  private Set<Event> eventsGoneTo;
  private Set<User> friends;

  public User(String name, String gender, String ... interest) {
    this.name = name;
    this.gender = gender;
    this.interests = new HashSet<>();

    for (String i : interest) {
      interests.add(i);
    }
    this.societiesInvolved = new HashSet<>();
    this.friends = new HashSet<>();
    this.eventsGoneTo = new HashSet<>();
  }

  public Set<Society> getSocietiesInvolved() {
    return societiesInvolved;
  }

  public void addFriend(User friend) {
    friends.add(friend);
    friend.getFriends().add(this);
  }

  public Set<User> getFriends() {
    return friends;
  }

  public Set<Event> getEventsGoneTo() {
    return eventsGoneTo;
  }

  public int numberOfFriendsInvolved(Categorisable c) {
    int friendsAttending = 0;

    for (User friend : friends) {
      if (friend.getEventsGoneTo().contains(c)) {
        friendsAttending ++;
      }
    }

    return friendsAttending;
  }

  public void addEvent(Event e) {
    eventsGoneTo.add(e);
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
