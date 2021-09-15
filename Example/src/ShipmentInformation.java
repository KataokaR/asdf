import java.time.LocalDateTime;
import java.lang.String;

public class ShipmentInformation {
  //private Product order_product;
	private int quantity;
	private LocalDateTime date_made;
	private LocalDateTime expected_arrival;
  //private Location destination
	private String tracking_number;
	
	public ShipmentInformation(/*Product order_product,*/int quantity, LocalDateTime date_made,
							   LocalDateTime expected_arrival, /*Location destination*/
							   String tracking_number) {
	  //this.order_product = order_product;
		this.quantity = quantity;
		this.date_made = date_made;
		this.expected_arrival = expected_arrival;
	  //this.destination = destination
		this.tracking_number = tracking_number;
	}
	
  /*public Product getProduct(){
   *	return order_product
   *} 
   */
	
	public int getQuantity() {
		return quantity;
	}
	
	public LocalDateTime getDateMade() {
		return date_made;
	}
	
	public LocalDateTime getExpectedArrival() {
		return expected_arrival;
	}
	
	/*public Product getDestination()
   *	return destination;
   *
   */	
	
	public String getTrackingNumber() {
		return tracking_number;
	}
	
};
