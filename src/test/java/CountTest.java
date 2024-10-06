import org.example.Count;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTest {

    private final Count c = new Count();

    @Test
    public void test() {
        assertEquals(2, c.calculateWords("Hello world"));//
        assertEquals(0, c.calculateWords(""));// если нет ничего, пусто то возвращает 0
        assertEquals(0, c.calculateWords(null));//проверка на пустую строку
        assertEquals(1, c.calculateWords("Bird"));
        assertEquals(2, c.calculateWords("TWo     one"));//независимо от пробелов считает правильно
        assertEquals(5, c.calculateWords("F d r t h"));
    }
}
