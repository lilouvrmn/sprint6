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

    @Mock(lenient = true)
    Feline feline;

    private String lionSex = "Самец";
    private List<String> expectedListOfFood = List.of("Животные", "Птицы", "Рыба");

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion(lionSex, feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void testGetFoodList() throws Exception {
        Lion lion = new Lion(lionSex, feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedListOfFood);
        Assert.assertEquals(expectedListOfFood, lion.getFood());
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion(lionSex, feline);
        boolean actual = lion.doesHaveMane();
        Assert.assertTrue(actual);
    }
}