package nextstep.ladder;

import nextstep.ladder.strategy.FalseStrategy;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class LineTest {

    @Test
    void line_생성() {
        int height = 5;
        Line line = new Line(height);

        assertThat(line.getPoints()).hasSize(5);
    }

    @Test
    void line_가로라인() {
        int height = 5;
        Line beforeLine = new Line(height);
        Line afterLine = new Line(height);

        afterLine.horizontalLine(beforeLine, new FalseStrategy());

        assertThat(afterLine.getPoints()).hasSize(5);
        afterLine.getPoints().forEach(aBoolean -> assertThat(aBoolean).isFalse());
    }
}
