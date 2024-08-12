package dsfsdf;

public class dsadsad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//12, 121, 120, 1200, 12000, 3, 30, 34, 5, 9
		//3, 30, 34, 5, 9
		//12, 123, 1234, 12345
		//9, 91, 911, 912, 92
		//15, 150, 151, 152
		//1010, 101, 1001, 100
		int M[]=new int[] {3, 30, 34, 5,12,9,121, 120, 1200, 12000};
		String N[]=new String[M.length];
		for(int i=0;i<N.length;i++) {
			N[i]=""+M[i];
		}
		
		for(int i1=0;i1<M.length*M.length;i1++) {
			for(int i=0;i<N.length;i++) {
				for(int j=i+1;j<N.length;j++) {
					char a1=N[i].charAt(0);
					char a2=N[j].charAt(0);
					int so1=a1-'0';
					int so2=a2-'0';
					if(so1<so2) {
						String teamp=N[i];
						N[i]=N[j];
						N[j]=teamp;
					}
				}
			}
			int count=0;
			while(count<N.length-1) {
				if(N[count].charAt(0)==N[count+1].charAt(0) ) {
					if(N[count].length()>N[count+1].length()) {
						String  chuoi1 = N[count].substring(0, N[count + 1].length());
                        String  chuoi2 = N[count + 1].substring(0, N[count + 1].length());
                        
                        int chuso1=Integer.parseInt(chuoi1);
                        int chuso2=Integer.parseInt(chuoi2);
						int count1=0;
						while(count1<N[count].length()-1) {
							char chu1 =N[count].charAt(count1+1);
							char chu2=N[count+1].charAt(0);

							int so1=chu1-'0';
							int so2=chu2-'0';
							
							if(so1<=so2) {
								String teamp=N[count];
								N[count]=N[count+1];
								N[count+1]=teamp;
								

							}


							if(chuso1>chuso2 ) {
								String teamp=N[count];
								N[count]=N[count+1];
								N[count+1]=teamp;
								break;

							}
							count1++;

						}
					}
					else if (N[count].length()<N[count+1].length()) {
						String  chuoi1 = N[count].substring(0, N[count].length());
                        String  chuoi2 = N[count + 1].substring(0, N[count].length());
                        
                        int chuso1=Integer.parseInt(chuoi1);
                        int chuso2=Integer.parseInt(chuoi2);
						int count1=0;
						while(count1<N[count+1].length()-1) {
							char chu1 =N[count].charAt(0);
							char chu2=N[count+1].charAt(count1+1);

							int so1=chu1-'0';
							int so2=chu2-'0';
							
							if(so1>=so2) {
								String teamp=N[count];
								N[count]=N[count+1];
								N[count+1]=teamp;
							}



							if(chuso1<=chuso2) {
								String teamp=N[count];
								N[count]=N[count+1];
								N[count+1]=teamp;
								break;

							}
							count1++;

						}
					}
					else if (N[count].length()==N[count+1].length()) {
						int a=Integer.parseInt(N[count]);
						int b=Integer.parseInt(N[count+1]);
						if(a<b) {
							String teamp=N[count];
							N[count]=N[count+1];
							N[count+1]=teamp;
						}
						
					} 
				}
				count++;
			}
		}
		
		
		System.out.println();
		System.out.println("Từ các số đã cho ta ghép thành số lớn nhất là");
		String SoLonNhat="";
		for(int i=0;i<N.length;i++) {
			SoLonNhat+=N[i]+" ";
		}
		System.out.println(SoLonNhat);
	
	
	}

}
