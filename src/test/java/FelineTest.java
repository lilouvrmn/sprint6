import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {
    private Feline feline = new Feline();
    private List<String> expectedListOfFood = List.of("Животные", "Птицы", "Рыба");

    @Test
    public void eatMeatReturnListOfFood() throws Exception {
        Assert.assertEquals(expectedListOfFood, feline.eatMeat());
    }

    @Test
    public void getFamilyReturnCats() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensNoParamReturn1() {
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensAnyParamReturnParam() {
        Assert.assertEquals(5, feline.getKittens(5));
    }
}
