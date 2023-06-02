package nextstep.ladder;

public class LinePrinter {

    public void print(Line line, int height) {
        System.out.print("|");
        if(line.getPoints().get(height)){
            System.out.print("-----");
        }else {
            System.out.print("     ");
        }
    }
}
