package nextstep.ladder.strategy;

public class FalseStrategy implements BooleanStrategy{

    @Override
    public boolean create() {
        return false;
    }
}
