package streamAssignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Fruit {
	public String name; 
	public int calories; 
	public int price; 
	public String color;

	public Fruit() {
	}

	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	

	public int getCalories() {
		return calories;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + "]";
	}
	
public static void main(String args[]) {
		
		List<Fruit> fruits = FruitUtils.getAllFruits();
	    fruits.stream().filter((Fruit fruit)->fruit.calories< 100).sorted(Comparator.comparing(Fruit::getCalories).reversed()).forEach(System.out::println);	
		
//	    Map<String, List<Fruit>> mapFruitColor = fruits.stream().collect(Fruit::getColor());
//	    System.out.println("\n\n\nColorwise fruits: " + mapFruitColor + "\n\n\n");
	    
	    fruits.stream().filter((Fruit fruit) -> fruit.getColor().equalsIgnoreCase("Red")).sorted(Comparator.comparing(Fruit::getPrice)).forEach(System.out::println);
	
	    
	    
	}
	
}