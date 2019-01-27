package linklist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinklistImplTest {
    @Test
    void isEmpty() {
        Linklist linklist = new LinklistImpl();
        assertTrue (linklist.isEmpty());

        linklist.addElementAtTop(2);
        assertFalse(linklist.isEmpty());
    }

    @Test
    void addElementAtTop() {
    }

    @Test
    void printListFromStart() {
    }

    @Test
    void reverseList() {
        int []a = {1, 2, 3, 4};
        Linklist linklist = createList(a);
        linklist.printListFromStart();
        linklist.reverseList();
        linklist.printListFromStart();
    }

    @Test
    void reverseListItteratively() {
        int []a = {1, 2, 3, 4};
        Linklist linklist = createList(a);
        linklist.printListFromStart();
        linklist.reverseListItteratively();
        linklist.printListFromStart();
    }

    @Test
    void count() {
    }

    @Test
    void countItteratively() {
    }

    private Linklist createList(int []args) {
        Linklist linklist = new LinklistImpl();
        for (int i : args) {
            linklist.addElementAtTop(i);
        }
        return linklist;

    }
}