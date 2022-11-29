import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class RandomItr implements Iterator<Integer> {
    private Random random;
    private int min,max;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return random.nextInt(max - min + 1) + min;
    }

    public RandomItr(Random random, int min, int max){
        this.random = random;
        this.min = min;
        this.max = max;
    }


}
