package CIBCInterview;

public class Box<E>{
    private E first;

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public static void main(String[] args) {
         Box<Number> box1 = new Box<>();
         box1.setFirst(100);
         showBox(box1);

        Box<Integer> box2 = new Box<>();
        box1.setFirst(200);
        showBox(box2);
    }

    public static void showBox(Box<?> box) {
        Object first = box.getFirst();
        System.out.println(first);
    }
}
