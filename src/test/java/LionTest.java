import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void testLionSexHasMainTrue() throws Exception {
        Lion lion = new Lion("Самец");
        Assert.assertTrue(lion.doesHaveMane());
    }

    @Test
    public void testLionSexHasMainFalse() throws Exception {
        Lion lion = new Lion("Самка");
        Assert.assertFalse(lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void testLionSexHasMainException() throws Exception {
        Lion lion = new Lion("Ошибка");
    }

    @Test
    public void testGetKittensReturnOne() {
        Lion lion = new Lion (feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void testGetFoodReturnList() throws Exception {
        Lion lion = new Lion (feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

}
