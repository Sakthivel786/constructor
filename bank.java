package practise;
class bank {
	String username,type;
	long phno,acc_no;
	
	public bank() {
		//l.i
	}
	public bank(String type, String u_name,long phno,long acc_no) {
		username=u_name;
		this.type=type;
		this.phno=phno;
		this.acc_no=acc_no;
	}
}
	class sbi extends bank { 
		String bankname,loc,branch;
		public sbi() {
			//sbi
			//l.i
		}
		public sbi(String bname,String loc,String branch,String type,String u_name,long phno,long acc_no) {
		super(type,u_name,phno,acc_no);
		bankname=bname;
		this.loc=loc;
		this.branch=branch;
		}
		public void detailsof_bank_anduser() {
			System.out.println("bank name ="+bankname);
			System.out.println("location ="+loc);
			System.out.println("branch name ="+branch);
			System.out.println("account type ="+type);
			System.out.println("acc holder name ="+username);
			System.out.println("phone no ="+phno);
			System.out.println("account number ="+acc_no);
			System.out.println("***************************************");
			
			}
		}
	class kotak extends bank{
		//states
		String bankname,loc,branch;
		public kotak() {
			//l.i
		}
		public kotak(String bname,String loc,String branch,String type,String u_name,long phno,long acc_no) {
		super(type,u_name,phno,acc_no);
		bankname=bname;
		this.loc=loc;
		this.branch=branch;
		}
		// behaviour
		public void detailsof_bank_anduser() {
			System.out.println("bank name ="+bankname);
			System.out.println("location ="+loc);
			System.out.println("branch name ="+branch);
			System.out.println("account type ="+type);
			System.out.println("acc holder name ="+username);
			System.out.println("phone no ="+phno);
			System.out.println("account number ="+acc_no);
			System.out.println("******************************************");
					
			}
		}

		
	
	


