package nextstep.ladder;

import nextstep.ladder.strategy.BooleanStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Line {
    private final List<Boolean> points = new ArrayList<>();

    public Line(int height) {
        IntStream.range(0, height)
                .forEach(value -> {
                    points.add(false);
                });
    }

    public List<Boolean> getPoints() {
        return points;
    }

    public void horizontalLine(Line beforeLine, BooleanStrategy booleanStrategy) {
        List<Boolean> beforeLinePoints = beforeLine.getPoints();

        IntStream.range(0, beforeLinePoints.size())
                .filter(i -> !beforeLinePoints.get(i))
                .forEach(i -> this.points.set(i, booleanStrategy.create()));

    }

    public void horizontalLine(BooleanStrategy booleanStrategy) {
        IntStream.range(0, points.size())
                .forEach(i -> this.points.set(i, booleanStrategy.create()));

    }
}
