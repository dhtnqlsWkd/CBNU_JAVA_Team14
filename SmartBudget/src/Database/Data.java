package Database;

public class Data {
	private String date;//날짜
	private int price;// 가격
	private int in_out;// 입금 혹은 출금
	private int card;// 현금지출인지 카드지출인지
	private int kinds;// 지출/입금 분류
	private String name; // 지출/입금 자세한 내역

	Data(String date,int price, int in_out, int card, int kinds, String name){
		set_date(date);
		set_price(price);
		set_in_out(in_out);
		set_card(card);
		set_kinds(kinds);
		set_name(name);
	}
	
	public void set_date(String date){
		this.date = date;
	}
	public void set_price(int price) {
		this.price = price;
	}
	public void set_in_out(int in_out) {
		this.in_out = in_out;
	}
	public void set_card(int card) {
		this.card = card;
	}
	public void set_kinds(int kinds) {
		this.kinds = kinds;
	}
	public void set_name(String name) {
		this.name = name;
	}
	
	public String get_date() {
		return date;
	}
	
	public int get_price() {
		return price;
	}
	public int get_in_out() {
		return in_out;
	}
	public int get_card() {
		return card;
	}
	public int get_kinds() {
		return kinds;
	}
	public String get_name() {
		return name;
	}
}
