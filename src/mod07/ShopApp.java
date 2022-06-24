package mod07;

import java.util.Arrays;

public class ShopApp {

	public static void main(String[] args) {
		
		double tax = 0.2;
		double total = 0.0;
		System.out.println("Bem vindo ao shopping Duke Chice! ");
		
		Costumer c1 = new Costumer("Pinky", 14);
		
		//c1.setName("Peaky");
		//c1.setSize("S");
		
		System.out.println("Preço minímo é: " + Clothing.MIN_PRICE);
		
		Clothing item1 = new Clothing("Jaqueta Azul", 20.9, "M");  
		Clothing item2 = new Clothing("Camiseta Laranja", 10.5, "S");  
		
		Clothing[] items = {item1, item2, new Clothing("Cachecol Verde", 5.0, "S" ),new Clothing("Camiseta Azul", 10.5, "S")}; 
		
		//item1.setDescription("Blue Jacket");
		//item1.setPrice(20.9);
		//item1.setSize("M");
		
		//item2.setDescription("Orange T-Shirt");
		//item2.setPrice(10.5);
		//item2.setSize("S");
		
		//items[2].setDescription("Green Scarf");
		//items[2].setPrice(5.0);
		//items[2].setSize("S");

		//items[3].setDescription("Blue T-Shirt");
		//items[3].setPrice(10.5);
		//items[3].setSize("S");
		
//		System.out.println("Item 1" + "," + item1.description + "," + item1.price + "," + item1.size);
//		System.out.println("Item 2" + "," + item2.description + "," + item2.price + "," + item2.size);
		// total = (item1.price = item2.price *2) * (1 + tax);
		
		int measurement = 8;
		
		c1.addItems(items);
		
		//c1.setSize(measurement);
		System.out.println("Custumer is " + c1.getName() + " ," + c1.getSize() + "," +c1.getTotalClothingCost());
		
		for(Clothing item : c1.getItems()) {
			//System.out.println("Items " + item.getDescription() + " ," + item.getSize() + " ," + item.getPrice());
			System.out.println("Items Output: " + item );
		}
		
		int average = 0;
		int count = 0;
		
//Practice 7.1
		for(Clothing item: c1.getItems()) {
			if(item.getSize().equals("L")) {
				count++;
				average += item.getPrice();
			}
		}
		try {
			average = (count == 0) ? 0 : average/count;
			average = average  / count;
			System.out.println("Average price " + average + "Count "+ count);
		} catch(ArithmeticException e) {
			System.out.println("Nao dividimos por 0"); //ou caso o contagem for = 0, ele passará pelo fluxo, mas dando a mensagem de erro
		}
		
		
		Arrays.sort(c1.getItems());
		for(Clothing item : c1.getItems()) {
			//System.out.println("Items " + item.getDescription() + " ," + item.getSize() + " ," + item.getPrice());
			System.out.println("Items Output: " + item );
		}
		
	} 
}