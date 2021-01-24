
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
		System.out.println("깃허브 업데이트 연습. 깃허브에 잘 뜨는지 확인해보기");
//		210124 업데이트
	}
		
	public void printFloydsPyramid(int num){
		j=0;
		count = 1;
		floor = 1;
		while (j<num) {
			// if �� �־, ���⸦ �ִ밪����(num)-���簪(j)���� ��ŭ �־���� ��.
			
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
