package Interview;

public class RelectionDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("Interview.User");
        System.out.println(c1.getName());
        User user = new User();
        Class c2 = user.getClass();
        Class c3 = User.class;

        System.out.println(c1);
        System.out.println(c1.hashCode());

    }
}

class User {
    private String name;
    private int id;
    private int age;

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}