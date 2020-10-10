import org.junit.jupiter.api.Test;
import ru.fruit.in.box.box.BoxWithFruits;
import ru.fruit.in.box.fruit.Apple;
import ru.fruit.in.box.fruit.Orange;

public class BoxWithFruitsTest {

    @Test
    void addFruitBoxTest(){
        BoxWithFruits<Apple> appleBox = new BoxWithFruits<>();
        Apple apple = new Apple();
        appleBox.addToBox(apple);
        BoxWithFruits<Orange> orangeBox = new BoxWithFruits<>();
        Orange orange = new Orange();
        orangeBox.addToBox(orange);
    }

    @Test
    void getWeightTest(){
        BoxWithFruits<Apple> appleBox = new BoxWithFruits<>();
        Apple apple = new Apple();

        System.out.println(appleBox.getBoxWeight());
    }

}
