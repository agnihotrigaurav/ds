/**
 * Created by gauravagnihotri on 25/01/19.
 */
public class LinklistImpl implements Linklist {
    private class List {
        private int data;
        public List next;
        List(int data){
            this.data = data;
            next = null;
        }
    };
    private List list;

    public Boolean isEmpty() {
        return list == null ? true : false;
    }
    public void addElementAtTop(int data) {
        List tmp = new List(data);
        if (list != null) {
            tmp.next = list;
        }
        list = tmp;
    }

    public void printListFromStart() {
        printListFromStart(list);
    }

    private void printListFromStart(List head) {
        if(head == null) {
            return;
        }
        System.out.println(head.data);
        printListFromStart(head.next);
    }
    private void printListFromEnd(List head) {
        if(head == null) {
            return;
        }
        printListFromEnd(head.next);
        System.out.println(head.data);
    }

    private List removeElementFromList(List head, int data) {
        if(head == head) {
            return null;
        }
        if (head.data == data) {
            return head.next;
        } else {
            head.next = removeElementFromList(head.next, data);
        }
        return head;
    }
    public void reverseList() {
        list = reverseList(list);
    }

    private List reverseList(List head) {
        if(head == null || head.next == null) {
            return head;
        }
        List result = reverseList(head.next);
        List tmp = head.next.next;
        head.next.next = head;
        head.next = tmp;
        return result;
    }

    public void reverseListItteratively() {
        List current = list;
        List next = null;
        List result = null;
        while(current != null) {
            next = current.next;
            current.next = result;
            result = current;
            current = next;

        }
        list = result;
    }

    public int count() {
        return count(list);
    }
    public int countItteratively() {
        int result = 0;
        List head = list;
        while(head != null) {
            result++;
            head = head.next;
        }
        return result;
    }
    private int count(List head) {
        if(head == null) {
            return 0;
        }
        return count(head.next) + 1;
    }
}
