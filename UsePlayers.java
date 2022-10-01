package Stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UsePlayers {
	public static void main(String[] args) {
		Players p1 = new Players("sar","chennai",35,5000,04);
		Players p2 = new Players("kar","punjab",21,6000,06);
		Players p3 = new Players("sur","mumbai",23,2000,9);
		Players p4 = new Players("raj","maha",24,10000,8);
		Players p5 = new Players("sathi","gujar",33,7000,5);
		ArrayList<Players>pl=new ArrayList<>();
		pl.add(p1);
		pl.add(p2);
		pl.add(p3);
		pl.add(p4);
		pl.add(p5);
		Map<Integer,Players> mp= pl.stream().filter(x->x.getAge()>30&&x.getRun()>1000).collect(Collectors.toMap(x->x.getJersyNo(), x->x));
		mp.forEach((x,y)->System.out.println(x+" "+y));
		
		
		
		
		
		
		
		/*pl.forEach(x->System.out.println(x));
		List<Players>seniorage=pl.stream().filter(x->x.getAge()>30).collect(Collectors.toList());
		age.forEach(x->System.out.println(x));
		List<String>agee=pl.stream().filter(x->x.getAge()>30).map(x->x.getName()+x.getAge()).collect(Collectors.toList());
		agee.forEach(x->System.out.println(x));
		List<String>startN=pl.stream().map(x->x.getName()).filter(x->x.startsWith("s")).collect(Collectors.toList());
		startN.forEach(x->System.out.println(x));
		Long c = pl.stream().map(x->x.getName()).filter(x->x.startsWith("s")).count();
		System.out.println(c);*/
		
			
		}
		
	}


