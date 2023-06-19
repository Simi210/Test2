package Association;

public class LineItem {
int quantity;
Product prod;

public LineItem(int quantity,Product prod) {
	super();
	this.quantity=quantity;
	this.prod=prod;
	
}


public  int getQuantity() {
	return quantity;
}

public Product getProd() {
	return prod;
}
public static void main(String[] args) {
	Product prod1= new Product(1,"PEN","Blue");
	LineItem itm=new LineItem(5,prod1);
	
	System.out.println("Line Item Details:");
	System.out.println("Quantity: "+itm.getQuantity()); 
	System.out.println(("Product Id: "+itm.getProd().getId()));
	System.out.println(("Product Name: "+itm.getProd().getName()));
	System.out.println(("Product Description: "+itm.getProd().getDescription()));
}
}