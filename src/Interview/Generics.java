package Interview;

import java.util.*;

class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Cat extends Animal {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class MiniCat extends Cat {
    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
public class Generics {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        ArrayList<MiniCat> minicats = new ArrayList<MiniCat>();
        ArrayList<Cat> cats = new ArrayList<Cat>(minicats);
        TreeSet<Cat> treeSet = new TreeSet<>();
//        showAnimal(animals);
//        showAnimal(cats);
        showAnimal(minicats);
        showAnimal(animals);
    }

    public static void showAnimal(ArrayList<? extends Cat> list) {
        for (Cat cat : list) {
            System.out.println(cat);
        }
    }

    public static void showAnimal(List<? super Cat> list) {
        list.add(new MiniCat());
        for (Object o : list) {
            System.out.println(o);
        }
    }
}

class Comparator1 implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
