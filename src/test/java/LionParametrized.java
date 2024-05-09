import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParametrized {

        private String sex;
        private boolean hasMane;

        public LionParametrized(String sex, boolean hasMane) {
            this.sex = sex;
            this.hasMane = hasMane;
        }

        @Parameterized.Parameters(name = "Class Lion, sex: {0}")
        public static Object[][] getLionSexData() {
            return new Object[][] {
                    { "Самец", true },
                    { "Самка", false },
            };
        }

        @Test
        public void lionSexPositiveScenario() throws Exception {
            String message = "Некорректное значение поля hasMane";
            Feline feline = new Feline();
            Lion lion = new Lion(sex, feline);
            Assert.assertEquals(message, hasMane, lion.doesHaveMane());
        }
    }
