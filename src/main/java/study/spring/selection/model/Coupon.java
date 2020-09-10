package study.spring.selection.model;

import lombok.Data;

@Data
public class Coupon {
	private int coupon_no;
	private String coupon_code;
	private String coupon_name;
	private int coupon_price;
	private String coupon_used;
	private String coupon_exp;
	private String reg_date;
	private String edit_date;
	private int user_no;
}