import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Event implements Categorisable{
	private String name;
	private Date startTime;
	private Date endTime;
	private HashSet<String> category;

	public Event (String name, Date startTime, Date endTime) throws EventTimeException {
		this.name = name;
		if (startTime.after(endTime)) throw new EventTimeException();
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Event (String name, Date startTime, Date endTime, Set<String> category) throws EventTimeException {
		this.name = name;
		if (startTime.after(endTime)) throw new EventTimeException();
		this.startTime = startTime;
		this.endTime = endTime;
		this.category = new HashSet<String>(category);
	}

	public String getName () {
		return name;
	}

	public Date getStartTime () {
		return startTime;
	}

	public Date getEndTime () {
		return endTime;
	}

	public void changeName (String newName) {
		this.name = newName;
	}

	public void changeStartTime (Date startTime) throws EventTimeException {
		if (startTime.after(this.endTime)) throw new EventTimeException();
		this.startTime = startTime;
	}

	public void changeEndTime (Date endTime) throws EventTimeException {
		if (endTime.before(this.startTime)) throw new EventTimeException();
		this.endTime = endTime;
	}

	@Override
	public void addCategory (String category) {
		this.category.add(category);
	}

	@Override
	public void removeCategory (String category) {
		if (this.category.contains(category)) this.category.remove(category);
	}

	public boolean overlap (Event event) {
		return (this.startTime.getTime() <= event.endTime.getTime() &&
				this.endTime.getTime() >= event.startTime.getTime());
	}

	@Override
	public int numberOfCategories() {
		return category.size();
	}

	@Override
	public int numberOfMatchingCategories(Categorisable c) {
		return 0;
	}

	@Override
	public Set<String> getAllCategories() {
		return category;
	}
}
