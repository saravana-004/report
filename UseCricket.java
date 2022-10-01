package Stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class UseCricket {

	public static void main(String[] args) {
		Cricket p1 = new Cricket("sara","chennai",35,5000,4);
		Cricket p2 = new Cricket("kar","punjab",21,6000,6);
		Cricket p3 = new Cricket("suri","mumbai",23,2000,9);
		Cricket p4 = new Cricket("raj","maha",24,10000,8);
		Cricket p5 = new Cricket("sathi","gujar",33,7000,5);
		HashMap<Integer,Cricket> c = new HashMap<>();
		c.put(p1.getJersyNo(),p1);
		c.put(p2.getJersyNo(), p2);
		c.put(p3.getJersyNo(),p3);
		c.put(p4.getJersyNo(),p4);
		c.put(p5.getJersyNo(), p5);
		Map<Integer,Cricket> cc=c.values().stream().filter(x->x.getName().length()%2==0).collect(Collectors.toMap(x->x.getJersyNo(),x->x));
		System.out.println(cc);
		cc.forEach((x,y)->System.out.println(x+" "+y));
		
		

		

	}

}
