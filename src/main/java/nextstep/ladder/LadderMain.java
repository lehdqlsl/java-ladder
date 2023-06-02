package nextstep.ladder;

import nextstep.ladder.strategy.RandomStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class LadderMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinePrinter linePrinter = new LinePrinter();
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        String names = scanner.nextLine();

        System.out.println("최대 사다리 높이는 몇 개인가요?");
        int height = Integer.parseInt(scanner.nextLine());

        String[] split = names.split(",");

        List<Line> lines = new ArrayList<>();
        for (String s : split) {
            lines.add(new Line(height));
        }

        for (int i = 0; i < lines.size() - 1; i++) {
            if (i == 0) {
                lines.get(i).horizontalLine(new RandomStrategy());
            } else {
                lines.get(i).horizontalLine(lines.get(i - 1), new RandomStrategy());
            }
        }

        IntStream.range(0, height - 1).forEach(value -> {
            for (Line line : lines) {
                linePrinter.print(line, value);
            }
            System.out.println();
        });

    }
}
