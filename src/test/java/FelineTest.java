import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline;

    @Test
    public void testGetKittens2ReturnTwo() {
        Assert.assertEquals(2, feline.getKittens(2));
    }

    @Test
    public void testGetKittens1ReturnOne() {
        Assert.assertEquals(1, feline.getKittens(1));
    }

    @Test
    public void testGetKittensNoParams() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

    @Test
    public void testGetFamilyFeline() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void predatorCallsGetFood() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }
}
