
public class ShapePrinter {
	int j = 0;
	int count = 1;
	int floor=1;
	int length;
	int length2;
	
	public void makePyramid(int height) {
		for (int i=0; i<height;i++) {
			for (int j=0; j<(height-1)-i;j++) {
				System.out.print(" ");
			}
			for (int k=0; k<2*i+1;k++) {
				System.out.print("*");
			}
			for (int j=0; j<(height-1)-i;j++) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
		
	public void printFloydsPyramid(int num){
		j=0;
		count = 1;
		floor = 1;
		while (j<num) {
			// if 를 넣어서, 띄어쓰기를 최대값길이(num)-현재값(j)길이 만큼 넣어줘야 돼.
			
			length = (int)Math.log10(num)+1;
			length2 = (int)Math.log10(j+1)+1;
			if ((length-length2)>0){
				for (int i=0;i<(length-length2);i++) {
					System.out.print(" ");	
				}
			}
			
			System.out.print((j+1)+" ");
			j++;
			if (j==floor) {
				System.out.print("\n");
				count+=1;
			}
			if (j>floor) {
				floor = floor + count;
			}
				
				
		}
		System.out.println("\n");
	}
	// 1
	// 2 3
	// 4 5 6
	// 7 8 9 10...
		
	}
