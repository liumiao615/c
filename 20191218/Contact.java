import java.util.Map;
import java.util.TreeMap;

public class Contact {
    Map<String, User> map = new TreeMap<>();

    public void add(String name, String mobilePhone, String officePhone) throws NameExistException {
        User user = new User(name, mobilePhone, officePhone);
        if (map.containsKey(name)) {
            throw new NameExistException();
        }
        map.put(name, user);
    }

    public User get(String name) {
        return map.get(name);
    }

    @Override
    public String toString() {
        return map.toString();
    }

    public void remove(String name) throws NameNotFoundException {
        if (!map.containsKey(name)) {
            throw new NameNotFoundException();
        }
        map.remove(name);
    }
}
