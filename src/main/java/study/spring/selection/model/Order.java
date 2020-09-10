package study.spring.selection.model;

import lombok.Data;

@Data
public class Order {
	private int order_no;
	private String reg_date;
	private String edit_date;
	private int cart_no;
	private int product_no;
}