package chap05;

public class ArrayEx10 {
	public static void main(String[] args) {
		int[] numArr = new int[10]; // numArr라는 이름의 int배열을 10칸 생성
		
		// 10칸의 배열에 난수 0~9사이의 값을 입력하고 바로 출력
		for(int i = 0 ; i < numArr.length ; i++) {
			System.out.print(numArr[i] = (int)(Math.random() * 10));
		}
		System.out.println();
		
		// 버블 정렬
		// 7701497483
		// 7071497483
		// 7017497483
		// 7014797483
		// 7014779483
		// 7014774983
		// 7014774893
		// 7014774839
		
		// 7014774839
		// 0714774839
		// 0174774839
		// 0147774839
		// 0147747839
		// 0147747389
		// 0147747389

		// 0147747389
		// 0147477389
		// 0147473789
		
		// 0147473789
		// 0144773789
		// 0144737789

		// 0144737789
		// 0144377789
		// 0144377789
		
		// 0144377789
		// 0143477789
		
		// 0143477789
		// 0134477789
		
		// 0134477789
		
		// 정렬 알고리즘 (bubble sort)
		// O = n^2 
		for(int i = 0 ; i < numArr.length - 1 ; i++) { // 사이클(회차)
			boolean changed = false;
			for(int j = 0 ; j < numArr.length - i - 1 ; j++) {
				if(numArr[j] < numArr[j+1]) {
					int tmp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tmp;
					changed = true;
				}
			}
			if(!changed) break;
			
			for(int k = 0; k < numArr.length ;k++) {
				System.out.print(numArr[k]);
			}
			System.out.println();
		}
	} 
}
