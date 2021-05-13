package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date manufacturedDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufacturedDate) {
		super(name, price);
		this.manufacturedDate = manufacturedDate;
	}

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	@Override
	public String priceTag() {
		return name + " (used) $ " + price + " (Manufacture date: " + manufacturedDate + ")";
	}

}
