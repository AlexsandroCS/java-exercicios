package entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    private Date manufactureDate;

    public UsedProduct(String name, Double price, Date manufactureDate) throws ParseException {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }
    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    SimpleDateFormat newFormatDate = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public String priceTag() {
        return getName() + " (used)" + " $" + String.format("%.2f",getPrice()) + " Manufacture date: " + newFormatDate.format(manufactureDate) + ")";
    }
}