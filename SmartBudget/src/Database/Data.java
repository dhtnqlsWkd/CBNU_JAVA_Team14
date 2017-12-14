package Database;

public class Data {
	private String date;//날짜
	private int price;// 가격
	private int in_out;// 입금 혹은 출금
	private int card;// 현금지출인지 카드지출인지
	private int kinds;// 지출/입금 분류
	private String name; // 지출/입금 자세한 내역

	public Data(){
	}
	
	public Data(String date,int price, int in_out, int card, int kinds, String name){
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
	
	public String get_str() {
		String str;
		
		str = Integer.toString(price) + "/";
		if(in_out ==0) {
			str += "수입 /";
			if(card == 0) {
				str += "현금	/";
			}else{
				str += "계좌	/";
			}
			
			if(kinds == 0) {
				str += "월급	/";
			}else if(kinds ==1) {
				str += "용돈	/";
			}else {
				str += "기타	/";
			}
		}else {
			str += "지출	/";
			if(card ==0) {
				str += "현금	/";			
			}else if(card ==1) {
				str += "체크카드	/";
			}else {
				str += "신용카드	/";
			}
			
			if(kinds == 0) {
				str += "식비	/";
			}else if(kinds ==1) {
				str += "교통비	/";
			}else if(kinds ==2) {
				str +="카페	/";
			}else if(kinds ==3) {
				str +="생필품	/";
			}else if(kinds ==4) {
				str +="문화생활	/";
			}else {
				str +="공과금	/";
			}
			
		}

		return str;
	}
}
