import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    Iterator<Integer> itr;
    public Randoms(int min, int max) {
       Random random = new Random();
        itr = new RandomItr(random,min,max);
    }

    @Override
    public Iterator<Integer> iterator() {
        return itr ;
    }
}