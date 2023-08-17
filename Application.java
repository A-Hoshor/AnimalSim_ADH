import java.util.ArrayList;

public class Application {

	public static void main(String[] args) throws InvalidCoordinateException {
		System.out.println("\n********************\n");
		System.out.println("Location Tests\n");
		System.out.println("********************\n");
		Location location = new Location(5,4);
		System.out.println(location.toString());
		location.update(23, 10);
		System.out.println(location.toString());
		location.update(23, -10);
		Location l = new Location(-23, 547);
		System.out.println(l.toString());
		
		
		System.out.println("\n********************\n");
		System.out.println("Animal Tests\n");
		System.out.println("********************\n");
		//Animal animal = new Animal();
		
		System.out.println("\n********************\n");
		System.out.println("BrownBear\n");
		System.out.println("********************\n");
		BrownBear b = new BrownBear(5431,4,3, "asiatic");
		System.out.println(b.toString());
		b.eat();
		b.sleep();
		b.update(4, 3);
		System.out.println(b.toString());
		b.walk(225);
		System.out.println(b.toString());
		b.swim(90);
		b.setSubSpecies("great dane");
		b.walk(180);
		b.setSimID(-465);
		System.out.println(b.toString());
		
		System.out.println("\n********************\n");
		System.out.println("GoldFinch\n");
		System.out.println("********************\n");
		GoldFinch g = new GoldFinch(15,4,5,10);
		System.out.println(g.toString());
		g.eat();
		g.sleep();
		g.fly(10, 11);
		g.setSimID(2649);
		System.out.println(g.toString());
		g.walk(270);
		g.setWingSpan(2);
		g.setSimID(-2000);
		g.walk(270);
		System.out.println(g.toString());
		
		System.out.println("\n********************\n");
		System.out.println("Generics Tests\n");
		System.out.println("********************\n");
		
		ArrayList<Animal> a = new ArrayList<Animal>();
		a.add(g);
		a.add(b);
		
		for(int i = 0; i<a.size();i++) {
			System.out.println(a.get(i));
		}//end for loop
		
	}//end main

}
