package partOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class main {
    public static void main(String[] args) {
        List<Circle> listCircle = new ArrayList<Circle>();

        List<ResizableCircle> listResizable = new ArrayList<ResizableCircle>();
        for(int i = 0; i < 2501; i++) {
            listCircle.add(new Circle(Math.random()));
            listResizable.add(new ResizableCircle(Math.random()));
        }
        System.out.println(listResizable);
        System.out.println(listCircle);
        GenericUtility g = new GenericUtility();

        g.collectionsToArray(listCircle);
        g.searchArea(listCircle);
        g.circleToResizable(listCircle);

    }
}
