package jp.co.internous.ecsite.model.form;

import java.io.Serializable;
import java.util.List;

public class CartForm implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long userid;
	private List<Cart> cartList;
	
	public long getUserId() {
		return userid;
	}
	public void setUserId(long userid) {
		this.userid = userid;
	}
	
	public List<Cart> getCartList() {
		return cartList;
	}
	public void setCartList(List<Cart> cartList) {
		this.cartList = cartList;
	}

}
