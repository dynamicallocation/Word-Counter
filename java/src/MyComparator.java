
import java.util.*;


public class MyComparator implements Comparator {

Map map;

public MyComparator(Map map) {
    this.map = map;
}

public int compare(Object o1, Object o2) {

    return ((Integer) map.get(o2)).compareTo((Integer) map.get(o1));

}
}

//Credit for custom comparator class 
//amicngh
//https://stackoverflow.com/questions/11647889/sorting-the-mapkey-value-in-descending-order-based-on-the-value