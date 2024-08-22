package dsfsdf;

public class SapXepThanhSoLonNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M[]=new int[] {0, 0, 1, 1};
		
        for (int i=0; i<M.length - 1; i++) {
            for (int j=0; j<M.length-1-i; j++) {
				String chuso1=""+M[j];
				String chuso2=""+M[j+1];
				String so1=chuso1+chuso2;
				String so2=chuso2+chuso1;
				int sothat1=Integer.parseInt(so1);
				int sothat2=Integer.parseInt(so2);
				if(sothat1>sothat2) {
					int teamp=M[j];
					M[j]=M[j+1];
					M[j+1]=teamp;
				}
            }
        }
        System.out.println("Vậy số lớn nhất được tạo ra là");
		for(int i=M.length-1;i>=0;i--) {
			System.out.print(M[i]);
		}
	}

}
