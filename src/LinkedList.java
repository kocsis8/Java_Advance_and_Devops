public class LinkedList {

    private Link first;
    public void addLast(int number) {
        if (first == null) {
            first = new Link(number);
        }else {
            Link newLink = new Link(number);
            Link current = first;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newLink);
        }
    }

    public void addFirst(int number){
        if (first == null) {
            first = new Link(number);
        }else {
        Link newLink = new Link(number);
        Link second = first;
        first = newLink;
        newLink.setNext(second);
        }

    }

    public void print() {
        Link current = first;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}
