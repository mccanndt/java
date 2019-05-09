package business;

public class PurchaseRequestLineItem {
	// Instance Variables
	private int id;
	private int purchaseRequestID;
	private int productID;
	private int quantity;

	// Constructors
	public PurchaseRequestLineItem() {
	}

	public PurchaseRequestLineItem(int purchaseRequestID, int productID, int quantity) {
		this.purchaseRequestID = purchaseRequestID;
		this.productID = productID;
		this.quantity = quantity;
	}

	public PurchaseRequestLineItem(int id, int purchaseRequestID, int productID, int quantity) {
		this.id = id;
		this.purchaseRequestID = purchaseRequestID;
		this.productID = productID;
		this.quantity = quantity;
	}

	// Getters / Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPurchaseRequestID() {
		return purchaseRequestID;
	}

	public void setPurchaseRequestID(int purchaseRequestID) {
		this.purchaseRequestID = purchaseRequestID;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
