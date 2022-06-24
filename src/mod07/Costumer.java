package mod07;

public class Costumer {

	private String name;
	private String size;
	
	private Clothing[] items; 
	
	public Costumer (String name, int measurement) {
		this.name = name; 
		setSize(measurement);
	}
	
	
	public void addItems(Clothing[] someItems) {
		items = someItems;
	}
	
	public double getTotalClothingCost() {
		
		double total = 0.0;
		
		for (Clothing item: items) {
//			if (c1.getSize().equals(item.getSize())) {
				total = total + item.getPrice();
				// System.out.println("Item " + "," + item.getDescription() + "," + item.getPrice() + "," + item.getSize());	
				
				// total = total + total * tax;
			
//				if (total > 15) {
//				break;
//				}
			//}
		}
		return total;
	}
	public Clothing[] getItems() {
		return items;
	}
		
// Métodos que acessam o nome e o tamanho.	
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;	
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	public void setSize(int measurement){
		switch (measurement) {
		case 1: 
		case 2: 
		case 3:
			size = "S";
			break;
		case 4: 
		case 5: 
		case 6:
			setSize("M");
			break;
		case 7: 
		case 8: 
		case 9:
			setSize("L");
			break;
		default:
			setSize("XL");
	}
	}
}
