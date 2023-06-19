package org.example;

public class Main {
    public static void main(String[] args) {

        LinkedList<Employee> linkedList = new LinkedList<>();
        linkedList.addFirst(new Employee("aaa", 23));
        linkedList.addFirst(new Employee("bbb", 24));
        linkedList.addFirst(new Employee("ccc", 22));
        printList(linkedList);
        System.out.println();
        LinkedList<Employee> reverseList = linkedList.reverse(linkedList);
        printList(reverseList);
    }

    public static void printList(LinkedList<Employee> list){
        LinkedList<Employee>.Node node = list.head;
        while (node != null){
            System.out.printf("%s - %d\n", node.value.getName(), node.value.getAge());
            node = node.next;
        }

    }

}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}