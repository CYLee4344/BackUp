package study.spring.selection.model;

import lombok.Data;

@Data
public class Image {
	private int image_no;
	private String image_size;
	private String image_type;
	private String image_path;
	private String image_name;
	private String reg_date;
	private String edit_date;
	private int product_no;
}