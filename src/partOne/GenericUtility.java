package partOne;

import javax.swing.tree.RowMapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class GenericUtility {
    public   <T extends  Circle> List<T> searchArea(List<T> area){
        area.sort((o1, o2) -> (int) (o2.getArea() - o1.getArea()));

        return  area;

    }
    public  <T extends Circle> T[] collectionsToArray(List<T> collection){

        Circle[] c = new Circle[collection.size()];

        for(int i = 0; i<collection.size(); i++){
            //System.out.println(collection.size());
            c[i] = collection.get(i) ;
        }

        return (T[]) collection.toArray();

    }
    public  <T extends  Circle> void circleToResizable(List<T> circles){
      List<ResizableCircle> listResizable = circles.stream().map(cir -> new ResizableCircle(cir.getRadius())).collect(Collectors.toList());
      listResizable.sort(((o1, o2) -> (int) (o2.getArea() - o2.getArea())));

    }
    public  <T extends Circle> boolean exist(Iterable<T> circles, Circle circle){
        boolean b = true ;
      for(T c: circles){

          if (c.equals(circle)) {
              b = true;

          }else{
              b = false;
          }
      }
        return b;
    }


}
