package Practice;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList<Person>();
        linkedList.add(new Person("Jerome", 34));
        linkedList.add(new Person("Jhaz", 33));
        linkedList.addFirst(new Person("Sancho", 7));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }
        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }
    }

    private static void queues() {
        Queue<Person> supermarket = new LinkedList<Person>();
        supermarket.add(new Person("Jerome", 34));
        supermarket.add(new Person("Jhaz", 33));
        supermarket.add(new Person("Sancho", 7));
        supermarket.add(new Person("Jeidy", 10));

        System.out.println("Current Size: " + supermarket.size());
        System.out.println("First in the List: " + supermarket.peek());
        System.out.println("Removes the First in the Queue: "+ supermarket.poll());
        System.out.println("New size after poll: "+ supermarket.size());
        System.out.println("New First in the Queue: "+ supermarket.peek());
    }

    static  record Person(String name, int age){}
}
