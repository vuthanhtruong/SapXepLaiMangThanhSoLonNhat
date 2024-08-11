package dsfsdf;

public class dsadsad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M[]=new int[] {33331,33};
		int c=0;
		for(int i=0;i<M.length;i++) {
			System.out.print(M[i]+"; ");
		}
		System.out.println();
		String N[]=new String[M.length];
		for(int i=0;i<N.length;i++) {
			N[i]=""+M[i];
		}
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
		for(int i=0;i<M.length;i++) {
			M[i]=Integer.parseInt(N[i]);
		}
		int count=0;
		while(count<N.length-1) {
			if(N[count].charAt(0)==N[count+1].charAt(0) ) {
				if(N[count].length()>N[count+1].length()) {
					int count1=0;
					while(count1<N[count].length()-1) {
						char chu =N[count].charAt(count1+1);
						char chu1=N[count+1].charAt(0);
						count1++;
						int so=chu-'0';
						int so1=chu1-'0';
						if(so<so1) {
							String teamp=N[count];
							N[count]=N[count+1];
							N[count+1]=teamp;
							break;
						}
					}
				}
				else {
					int count1=0;
					while(count1<N[count+1].length()-1) {
						char chu =N[count+1].charAt(count1+1);
						char chu1=N[count].charAt(0);
						count1++;
						int so=chu1-'0';
						int so1=chu-'0';
						if(so<so1) {
							String teamp=N[count];
							N[count]=N[count+1];
							N[count+1]=teamp;
							break;
						}
					}
				}
			}
			count++;
		}
		System.out.println();
		System.out.println("Từ các số đã cho ta ghép thành số lớn nhất là");
		String SoLonNhat="";
		for(int i=0;i<N.length;i++) {
			SoLonNhat+=N[i];
		}
		System.out.println(SoLonNhat);
	}

}
