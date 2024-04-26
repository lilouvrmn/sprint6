import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)

public class CatTest {
    @Mock
    Feline feline;

    private List<String> expectedListOfFood = List.of("Животные", "Птицы", "Рыба");

    @Test
    public void catSoundReturnMeow() {
        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodReturnList() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(expectedListOfFood);
        Assert.assertEquals(expectedListOfFood, cat.getFood());
    }
}
