/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

public class Linked<Item> {
    Node<Item> head = null;

    Node<Item> back = null;
    int count = 0;

    public Linked() {
    }


    public void add(Item item) {
        if (item != null) {
            Node n = new Node(item);
            if (back != null) {
                if (head.getNext() == null) {
                    back = n;
                    back.setBack(head);
                    head.setNext(back);
                    count++;
                }
                else {
                    n.setBack(back);
                    back.setNext(n);
                    back = back.getNext();
                    count++;
                }
            }
            else {
                head = n;
                back = n;
                count++;
            }
        }

    }

    public Item remove() {
        if (back != null) {
            Item n = back.getData();
            if (back.getBack() != null) {
                back = back.getBack();
                back.setNext(null);
            }
            if (count == 1) {
                back = null;
                head = null;
            }
            count--;
            return n;
        }
        else {
            Item n = head.getData();
            head = null;
            back = null;
            count--;
            return n;
        }
    }

    public int count() {
        return count;
    }

    public static void main(String[] args) {

    }
}
