package Lab11CarSales;


public class Car {
 private String make;
 private String model;
 private int year;
 private double price;
 
 


	 	 
 
 
 public Car() {
	super();
	// TODO Auto-generated constructor stub
}

public String getMake() {
	return make;
}

public void setMake(String make) {
	this.make = make;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Car(String make, String model, int year, double price) {
	super();
	this.make = make;
	this.model = model;
	this.year = year;
	this.price = price;
}
@Override
public String toString(){
return String.format("Make: %-10s  Model: %-10s Year: %-10d Price: $ %-10.2f", make, model, year, price);
}
}


