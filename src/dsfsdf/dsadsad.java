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
		int M[]=new int[] {12, 121, 120, 1200, 12000, 3, 30, 12,34, 16,5, 9};
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
		for(int i=0;i<N.length;i++) {
			for(int j=i+1;j<N.length;j++) {
				char a1=N[i].charAt(0);
				char a2=N[j].charAt(0);
				int so1=a1-'0';
				int so2=a2-'0';
				if(so1==so2 && N[i].length()==N[j].length() && 
					Integer.parseInt(N[i]) <= Integer.parseInt(N[j])) {
					String teamp=N[i];
					N[i]=N[j];
					N[j]=teamp;
				}
			}
		}
		for(int i=0;i<N.length;i++) {
			for(int j=i+1;j<N.length;j++) {
				char a1=N[i].charAt(0);
				char a2=N[j].charAt(0);
				int so1=a1-'0';
				int so2=a2-'0';
				if(so1==so2 && N[i].length()>N[j].length()) {
					String teamp=N[i];
					N[i]=N[j];
					N[j]=teamp;
				}
			}
		}
		for(int i=0;i<N.length;i++) {
			System.out.print(N[i]+" ");
		}
	}

}
