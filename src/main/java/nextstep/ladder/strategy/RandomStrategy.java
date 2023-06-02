package nextstep.ladder.strategy;

import java.util.Random;

public class RandomStrategy implements BooleanStrategy{
    private final Random random = new Random();

    @Override
    public boolean create() {
        return random.nextBoolean();
    }
}
