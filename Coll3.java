package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Coll3 {
	public static void main(String[] args) {
		
	
	ArrayList<Integer> a = new ArrayList<>();
	a.add(264);
	a.add(464);
	a.add(112);
	a.add(333);
	a.add(144);
	a.add(412);
	a.stream().filter(x->x%2==0).forEach(x->System.out.println(x));
	List<Integer>even=a.stream().filter(x->x%2==0).collect(Collectors.toList());
	Long c = a.stream().filter(x->x%2==0).count();
	System.out.println(c);
	System.out.println(even);
}
}