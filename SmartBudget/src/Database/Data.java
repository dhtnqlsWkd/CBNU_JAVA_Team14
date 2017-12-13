package Database;

public class Data {
	private int date_year;// ��¥
	private int date_month;
	private int date_day;
	private int price;// ����
	private int in_out;// �Ա� Ȥ�� ���
	private int card;// ������������ ī����������
	private int kinds;// ����/�Ա� �з�
	private String name; // ����/�Ա� �ڼ��� ����

	Data(int year,int month,int day,int price, int in_out, int card, int kinds, String name){
		set_date(year,month,day);
		set_price(price);
		set_in_out(in_out);
		set_card(card);
		set_kinds(kinds);
		set_name(name);
	}
	
	public void set_date(int year,int month, int day){
		 date_year = year;
		 date_month = month;
		 date_day = day;
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
		String re_date = String.valueOf(date_year)+"-"+String.valueOf(date_month)+"-"+String.valueOf(date_day);
		return re_date;
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
