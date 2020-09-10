package study.spring.selection.model;

import lombok.Data;

@Data
public class Delivery {
	private int delivery_no;
	private String user_name;
	private String delivery_type;
	private int delivery_qty;
	private String delivery_status;
	private String order_cancel;
	private String receive_name;
	private String receive_tel;
	private String receive_addr;
	private String receive_addr2;
	private String receive_addr3;
	private String receive_addr4;
	private String receive_addr5;
	private String reg_date;
	private String edit_date;
	private int pay_no;
}