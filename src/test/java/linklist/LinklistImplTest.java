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


        int []a = {1};
        Linklist linklist = createList(a);
        linklist.reverseList();
        assertTrue(testListReverseOrder((LinklistImpl) linklist, a));

        int []b = {1, 2};
        linklist = createList(b);
        linklist.reverseList();
        assertTrue(testListReverseOrder((LinklistImpl) linklist, b));

        int []c = {1, 2, 3};
        linklist = createList(c);
        linklist.reverseList();
        assertTrue(testListReverseOrder((LinklistImpl) linklist, c));

        int []d = {1, 2, 3, 4};
        linklist = createList(d);
        linklist.reverseList();
        assertTrue(testListReverseOrder((LinklistImpl) linklist, d));

    }

    @Test
    void reverseListItteratively() {
        int []a = {1};
        Linklist linklist = createList(a);
        linklist.reverseListItteratively();
        assertTrue(testListReverseOrder((LinklistImpl) linklist, a));

        int []b = {1, 2};
        linklist = createList(b);
        linklist.reverseListItteratively();
        assertTrue(testListReverseOrder((LinklistImpl) linklist, b));

        int []c = {1, 2, 3};
        linklist = createList(c);
        linklist.reverseListItteratively();
        assertTrue(testListReverseOrder((LinklistImpl) linklist, c));

        int []d = {1, 2, 3, 4};
        linklist = createList(d);
        linklist.reverseListItteratively();
        assertTrue(testListReverseOrder((LinklistImpl) linklist, d));
    }

    @Test
    void count() {
        Linklist linklist = new LinklistImpl();
        assertEquals(0,  linklist.count());
        linklist.addElementAtTop(1);
        assertEquals(1, linklist.count());
        linklist.addElementAtTop(2);
        assertEquals(2, linklist.count());
        linklist.addElementAtTop(3);
        assertEquals(3, linklist.count());
    }

    @Test
    void countItteratively() {
        Linklist linklist = new LinklistImpl();
        assertEquals(0, ((LinklistImpl) linklist).countItteratively());
        linklist.addElementAtTop(1);
        assertEquals(1, ((LinklistImpl) linklist).countItteratively());
        linklist.addElementAtTop(2);
        assertEquals(2, ((LinklistImpl) linklist).countItteratively());
        linklist.addElementAtTop(3);
        assertEquals(3, ((LinklistImpl) linklist).countItteratively());
    }

    private Linklist createList(int []args) {
        Linklist linklist = new LinklistImpl();
        for (int i : args) {
            linklist.addElementAtTop(i);
        }
        return linklist;

    }

    private boolean testListReverseOrder(LinklistImpl linklistImpl, int []a) {
        List tmp = linklistImpl.getList();
        int i = 0 ;
        while(tmp != null) {
            if (tmp.data != a[i]) {
                return false;
            }
            tmp = tmp.next;
            i++;
        }
        return true;

    }

    @Test
    void middleOfList() {
        Linklist linklist = new LinklistImpl();
        Integer mid = linklist.middleOfList();
        assertNull(mid);

        int []a = {1};
        linklist = createList(a);
        mid = linklist.middleOfList();
        assertNotNull(mid);
        assertEquals(1, mid.intValue());

        int []b = {2, 1};
        linklist = createList(b);
        mid = linklist.middleOfList();
        assertNotNull(mid);
        assertEquals(2, mid.intValue());

        int []c = {3, 2, 1};
        linklist = createList(c);
        mid = linklist.middleOfList();
        assertNotNull(mid);
        assertEquals(2, mid.intValue());

        int []d = {4, 3, 2, 1};
        linklist = createList(d);
        mid = linklist.middleOfList();
        assertNotNull(mid);
        assertEquals(3, mid.intValue());

        int []e = {5, 4, 3, 2, 1};
        linklist = createList(e);
        mid = linklist.middleOfList();
        assertNotNull(mid);
        assertEquals(3, mid.intValue());

        int []f = {6, 5, 4, 3, 2, 1};
        linklist = createList(f);
        mid = linklist.middleOfList();
        assertNotNull(mid);
        assertEquals(4, mid.intValue());

        int []g = {7, 6, 5, 4, 3, 2, 1};
        linklist = createList(g);
        mid = linklist.middleOfList();
        assertNotNull(mid);
        assertEquals(4, mid.intValue());

    }
}