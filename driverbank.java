package practise;


class driverbank {

	public static void main(String[] args) {
		
		sbi ref1=new sbi("sbi","salem","nspuram","savings","sakthi",987642378L,4657687889L);
		kotak ref2=new kotak("kotak","erode","rspuram","current","ajay",3435656773L,56657678589L);
		 
		ref1.detailsof_bank_anduser();
		 ref2.detailsof_bank_anduser();

	}

}
