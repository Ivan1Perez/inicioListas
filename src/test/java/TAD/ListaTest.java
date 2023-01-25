package TAD;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

class ListaTest {

    static Lista lista;

    @BeforeEach
    public void initialize(){
        lista = new Lista();
    }
    @Test
    @DisplayName("Testing get method when lista is empty")
    void getEmpty() {
        assertNull(lista.get(0));
        assertNull(lista.get(-1));
    }

    @Test
    @DisplayName("Testing get method when lista isn't empty")
    void getNotEmpty() {
        lista.addHead(3);
        lista.addHead(6);
        lista.addHead(7);
        // 7 6 3
        assertEquals(7,lista.get(0));
        assertEquals(6,lista.get(1));
        assertEquals(3,lista.get(2));
        assertNull(lista.get(3));
        assertNull(lista.get(-1));
    }

}