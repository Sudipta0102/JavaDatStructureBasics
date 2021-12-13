package starPattern;

public class Pattern {
	
	static void p1(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
	}
	
	static void p2(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=n-i;j>=1;j--) {
				
				System.out.print(" ");
				
			}
			
			for(int k=1;k<=i;k++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
	}
	
	static void p3(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=n-i;j>=0;j--) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	static void p4(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<i;j++) {
				
				System.out.print(" ");
				
			}
			
			for(int k=n-i+1;k>=1;k--) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
	}
	
	static void p5(int rows) {		
		
		for(int i=1;i<=rows;i++) {
		
			for(int j=rows-i;j>0;j--) {
				
				System.out.print(" ");
				
			}
			
			for(int k=1;k<=(i*2)-1;k++) {
				
				System.out.print("*");
			
			}
			
			System.out.println();
		}
				
	}
	
	static void p6(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<i;j++) {
				
				System.out.print(" ");
				
			}
			
			for(int k=0;k<=(n-i)*2;k++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
	}
	
	static void p7(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				
				System.out.print(" ");
				
			}
			
			for(int k=1;k<2*i;k++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//System.out.println();
		
		for(int i=1;i<n;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(" ");
				
			}
			
			for(int k=1;k<2*(n-i);k++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	static void p8(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=1;i<n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
	}
	
	static void p9(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=1;i<n;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(" ");
			}
			
			for(int k=1;k<=n-i;k++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	static void p10(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				
				System.out.print(" ");
				
			}
			
			for(int j=1;j<=n;j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
	}

	static void p11(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<i;j++) {
				
				System.out.print(" ");
			}
			
			for(int k=1;k<=n;k++) {
				
				System.out.print("*");
			
			}
			
			System.out.println();
		}
		
	}
	
	static void p12(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=0;j<=n-i;j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
		for(int i=1;i<n;i++) {
			
			for(int j=0;j<=i;j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
	}
	
	static void p13(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<i;j++) {
				
				System.out.print(" ");
			}
			
			for(int k=0;k<=(n-i);k++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
		for(int i=1;i<n;i++) {
			
			for(int j=1;j<n-i;j++) {
				
				System.out.print(" ");
			
			}
			
			for(int k=0;k<=i;k++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
	}
	
	static void p14(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<i;j++) {
				
				System.out.print(" ");
				
			}
			
			for(int k=0;k<=n-i;k++) {
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		for(int i=1;i<n;i++) {
			
			for(int j=1;j<n-i;j++) {
				
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++) {
				
				System.out.print("* ");
			
			}
			
			System.out.println();
		}
		
	}

	static void p15(int n) {
		
		System.out.println("*");
		
		for(int i=1;i<n-1;i++) {
			
			System.out.print("*");
			
			for(int j=1;j<i;j++) {
				
				System.out.print(" ");
				
			}
			
			System.out.print("*");
			
			System.out.println();
		}
		
		for(int i=1;i<=n;i++) {
			
			System.out.print("*");
			
		}
		
		System.out.println();
	}
	
	static void p16(int n) {
		
		for(int i=1;i<n;i++) {
			
			//this is space
			for(int j=1;j<=n-i;j++) {
				
				System.out.print(" ");
			}
			
			//first start of the row
			System.out.print("*");
			
			if(i!=1) {
			
				//from the 2nd row, there are intermediate spaces
				//from the 2nd row, it needs 0,1,2 spaces respectively
				for(int k=2;k<i;k++) {
				
					System.out.print(" ");
				
				}
			
				//this is for last star in row up until 4th row
				System.out.print("*");
			
			}
			
			System.out.println();
		}
		
		//this is for the last line
		for(int i=1;i<=n;i++) {
			
			System.out.print("*");
		
		}
		
		System.out.println();
	}
	
	static void p17(int n) {
		
		for(int i=1;i<=n;i++) {
			
			if(i==1) {
				
				for(int j=1;j<=n;j++) {
					
					System.out.print("*");
					
				}
				
				System.out.println();
			}
			
			else if(i!=n) {
				
				System.out.print("*");
				
				for(int k=1;k<n-i;k++) {
					
					System.out.print(" ");
					
				}
					
				System.out.print("*");
				
				System.out.println();
			}
			
			else {
				
				System.out.println("*");
			}
		}
		
	}
	
	static void p18(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<i;j++) {
				
				System.out.print(" ");
				
			}
			
			if(i==1) {
				
				for(int k=1;k<=n;k++) {
					
					System.out.print("*");
					
				}
				
				System.out.println();
			}
			
			else if(i!=n) {
				
				System.out.print("*");
				
				for(int l=1;l<n-i;l++) {
					
					System.out.print(" ");
				}
				
				System.out.print("*");
				
				System.out.println();
			}
			
			else {
				
				System.out.println("*");
			}
		}
		
	}
	
	static void p19(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				
				System.out.print(" ");
				
			}
			
			if(i==1) {
				
				System.out.println("*");
		
			}
			
			else if(i!=n) {
				
				System.out.print("*");
				
				//this is tricky, watch out
				for(int k=1;k<=2*i-3;k++) {
					
					System.out.print(" ");
					
				}
				
				System.out.println("*");
			}
			
			else {
				
				for(int l=1;l<2*n;l++) {
					
					System.out.print("*");
				}
					
				System.out.println();
			}
			
		}
		
	}
	
	static void p20(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<i;j++) {
				
				System.out.print(" ");
				
			}
			
			if(i==1) {
				
				for(int k=1;k<2*n;k++) {
					
					System.out.print("*");
					
				}
				
				System.out.println();
			}
			
			else if(i!=n) {
				
				System.out.print("*");
				
				for(int l=1;l<2*(n-i);l++) {
					
					System.out.print(" ");
					
				}
				
				System.out.println("*");
			}
			
			else {
				
				System.out.println("*");
			}
		}
		
	}
	
	static void p21(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				
				System.out.print(" ");
			
			}
			
			if(i==1) {
				
				System.out.println("*");
			}
			
			else {
				
				System.out.print("*");
				
				for(int k=1;k<=2*i-3;k++) {
					
					System.out.print(" ");
					
				}
				
				System.out.println("*");
			}
		}
		
		for(int i=1;i<n;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(" ");
			
			}
			
			if(i==n-1) {
				
				System.out.println("*");
			}
			else{
				
				System.out.print("*");
				int x = 2*(n-i)-2;//or, 2*(n-i-1)
				for(int k=1;k<x;k++) {
					
					System.out.print(" ");
				
				}
				
				System.out.println("*");
			}
			
		}
		
	}
	
	static void p22(int n) {
		
		System.out.println("*");
		
		for(int i=1;i<n;i++) {
			
			System.out.print("*");
			
			for(int j=1;j<2*i-1;j++) {
				
				System.out.print(" ");
				
			}
			
			System.out.println("*");
			
		}
		
		for(int i=1;i<n;i++) {
			
			if(i==n-1) {
				
				System.out.println("*");
			}
			
			else {
				
				System.out.print("*");
				
				for(int j=1;j<=2*(n-2-i);j++) {
					
					System.out.print(" ");
				
				}
				
				System.out.println("*");
				
			}
		}
	}
	
	static void p23(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				
				System.out.print(" ");
				
			}
			
			if(i!=1) {
				
				System.out.print("*");
				
				for(int k=2;k<i;k++) {
					
					System.out.print(" ");
				
				}
				
				System.out.println("*");
			}
			else {
				
				System.out.println("*");
			}
			
		}
		
		for(int i=1;i<n;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(" ");
			}
			
			if(i!=n-1) {
				
				System.out.print("*");
				
				for(int k=1;k<n-i-1;k++) {
					
					System.out.print(" ");
					
				}
				
				System.out.println("*");
			}
			
			else {
				
				System.out.println("*");
			}
			
		}
		
	}
	
	static void p24(int n) {
		
		for(int i=1;i<=n;i++) {
				
			for(int j=1;j<=n-i;j++) {
				
				System.out.print(" ");
				
			}
			
			if(i!=1 && i!=n) {
				
				System.out.print("*");
				
				for(int j=1;j<n-1;j++) {
					
					System.out.print(" ");
					
				}
				
				System.out.println("*");
				
			}
			else {
				
				for(int k=1;k<=n;k++) {
					
					System.out.print("*");
					
				}
				
				System.out.println();
							
			}
		}	
			
			
		
		
	}
	
	static void p25(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<i;j++) {
				
				System.out.print(" ");
				
			}
			
			if(i!=1 && i!=n) {
				
				System.out.print("*");
				
				for(int k=1;k<n-1;k++) {
					
					System.out.print(" ");
					
				}
				
				System.out.println("*");
				
			}
			else{
				
				for(int l=1;l<=n;l++) {
					
					System.out.print("*");
				}
				
				System.out.println();
			}
			
		}
	}
	
	static void p26(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
				
			}
			
			for(int k=1;k<=2*(n-i);k++) {
				
				System.out.print(" ");
				
			}
			
			for(int l=1;l<=i;l++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
		
		for(int i=1;i<n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				
				System.out.print("*");
				
			}
			
			for(int k=1;k<=2*i;k++) {
				
				System.out.print(" ");
				
			}
			
			for(int l=1;l<=n-i;l++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
	}
	
	static void p27(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=0;j<=n-i;j++) {
				
				System.out.print("*");
				
			}
			
			for(int k=1;k<2*i-1;k++) {
				
				System.out.print(" ");
			}

			for(int l=0;l<=n-i;l++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
				
			}
			
			for(int k=1;k<=2*(n-i);k++) {
				
				System.out.print(" ");
				
			}
			
			for(int l=1;l<=i;l++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
		
	}
	
	static void p28(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				
				System.out.print(" ");
			
			}
			
			if(i!=1) {
				
				System.out.print("*");
				
				for(int k=1;k<2*(i-1);k++) {
					
					System.out.print(" ");
				}
				
				System.out.println("*");
			}
			
			else {
				
				System.out.println("*");
			}
		}
		
		for(int i=n-1;i>0;i--) {
			
			for(int j=1;j<=n-i;j++) {
				
				System.out.print(" ");
				
			}
			
			if(i!=1) {
				
				System.out.print("*");
				
				for(int k=1;k<=2*i-3;k++) {
					
					System.out.print(" ");
					
				}
				
				System.out.println("*");
			}
			else {
				System.out.println("*");
			}	
		}
		
	}
	
	static void p29(int n) {
		
		System.out.println("Parini...confusing pattern");
		
	}
	
	static void p30(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	static void p31(int n) {
		
		for(int i=1;i<=n;i++) {
			
			if(i!=1 && i!=n) {
				
				System.out.print("*");
				
				for(int j=1;j<n-1;j++) {
					
					System.out.print(" ");
					
				}
				
				System.out.println("*");
			}
			
			else {
				
				for(int k=1;k<=n;k++) {
					
					System.out.print("*");
					
				}
				
				System.out.println();
			}
		}
		
	}
	
	static void p32(int n) {
		
		for(int i=1;i<=n;i++) {
			
			if(i>=1 && i<=n/2+1) {
				
				for(int j=1;j<i;j++) {
					
					System.out.print(" ");
					
				}
			}else {
				
				for(int k=1;k<=n-i;k++) {
					
					System.out.print(" ");
					
				}
				
			}
			
			if(i>=1 && i<=n/2) {
				
				System.out.print("*");
				
				for(int l=1;l<=n-2*i;l++) {
					
					System.out.print(" ");
				}
				
				System.out.println("*");
				
			}
			
			else if(i>=n/2+2 && i<=n) {
				
				System.out.print("*");
				
				for(int m=1;m<2*i-n-1;m++) {
					
					System.out.print(" ");
					
				}
				
				System.out.println("*");
			}
			
			else {
				
				System.out.println("*");
			}
			
		}
	}
	
	static void p33(int n) {
		
		for(int i=1;i<=2*n;i++) {
			
			if(i!=n) {
				for(int j=1;j<n;j++) {
				
					System.out.print(" ");
				
				}
			
				System.out.println("*");
			}
			else {
				
				for(int k=1;k<2*n;k++) {
					
					System.out.print("*");
					
				}
				
				System.out.println();
				
			}
			
		}
		
	}
	
	static void p34(int n) {
		
		for(int i=1;i<2*n;i++) {
			
			if(i!=1 && i!=n && i!=2*n-1) {
				
				System.out.print("*");
				
				for(int j=1;j<=n-4;j++) {
					
					System.out.print(" ");
					
				}
				
				System.out.println("*");
				
			}
			else {
				
				for(int k=1;k<=n-2;k++) {
					
					System.out.print("*");
				}
				
				System.out.println();
			}
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
	
		
		System.out.println("1.");
		p1(8);
		
		System.out.println("2.");
		p2(8);
		
		System.out.println("3.");
		p3(8);
		
		System.out.println("4.");
		p4(8);
		
		System.out.println("5.");
		p5(8);
		
		System.out.println("6.");
		p6(8);
		
		System.out.println("7.");
		p7(8);
		
		System.out.println("8.");
		p8(8);
	
		System.out.println("9.");
		p9(8);
		
		System.out.println("10.");
		p10(8);
		
		
		System.out.println("11.");
		p11(8);
		
		System.out.println("12.");
		p12(8);
		
		System.out.println("13.");
		p13(8);
		
		System.out.println("14.");
		p14(8);
		
		System.out.println("15.");
		p15(8);
		
		System.out.println("16.");
		p16(8);
	
		System.out.println("17.");
		p17(8);
		
		System.out.println("18.");
		p18(8);
		
		System.out.println("19.");
		p19(8);
		
		System.out.println("20.");
		p20(8);
		
		System.out.println("21.");
		p21(8);
		
		System.out.println("22.");
		p22(9);
		
		System.out.println("23.");
		p23(8);
		
		System.out.println("24.");
		p24(8);
		
		System.out.println("25.");
		p25(8);
		
		
		System.out.println("26.");
		p26(8);
		
		System.out.println("27.");
		p27(8);
		
		System.out.println("28.");
		p28(8);
		
		System.out.println("29.");
		p29(8);
		
		System.out.println("30.");
		p30(8);
		
		
		System.out.println("31.");
		p31(8);
		
		//i dunno how its supposed to work for even nos.
		System.out.println("32.");
		p32(9);
		
		System.out.println("33.");
		p33(8);
		
		System.out.println("34.");
		p34(8);
		
	}

}
