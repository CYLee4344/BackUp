package study.spring.selection.model;

import lombok.Data;

@Data
public class Pay {
	private int pay_no;
	private String pay_type;
	private String reg_date;
	private String edit_date;
	private int coupon_no;
	private int order_no;
}