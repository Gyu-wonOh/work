import java.util.Arrays;
import java.util.Scanner;

public class ArrayAndRepetitive {

	public static void main(String[] args) {

//		int a[]= {1,2,5,7,3};
//		for(int i=0; i<a.length;i++) {
//			System.out.println(a[i]);
//	}

		// for-each
//	for(int item:a) {
//		System.out.println(item);
//	}
//		int a[] = new int[3];
//		for (int count = 0; count < 3; count++) {
//			a[count] = count + 1;
//		}
//		for (int count = 0; count < 3; count++) {
//			System.out.println(a[count]);
//		}
		// 야구장 전광판
//		int team1TotalScore = 0;
//		int team2TotalScore = 0;
//		int team1[] = { 0, 0, 0, 0, 1, 3, 2, 3, 1 };
//		int team2[] = { 0, 2, 2, 0, 4, 1, 0, 0, 0 };
//		for (int i = 0; i < 9; i++) {
//			System.out.print("\t" + (i + 1) + "회");
//		}
//		System.out.println();
//		for (int i = 0; i < 9; i++) {
//			team1TotalScore = team1TotalScore + team1[i];
//			System.out.print("\t" + team1[i]);
//		}
//		System.out.println();
//		for (int i = 0; i < 9; i++) {
//			team2TotalScore = team2TotalScore + team2[i];
//			System.out.print("\t" + team2[i]);
//		}
//		System.out.println();
//		System.out.println("경기결과 team1 : " + team1TotalScore + ":" + "team2 : " + team2TotalScore);
		// for-each 문법
//		int[] numbersArray = {1,2,3,4,5};
//		//Enhanced for loop를 사용하여 배열순회
//		for(int num:numbersArray) {
//			System.out.println(num);
//		}
//		
		// 예제
		// 1.배열의 요소들을 모두 출력하는 예제
//		int[] arr = {1,2,3,4,5};
//		for(int i = 0; i< arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		// 2.배열의 요소들 중네서 짝수만 출력하는 예제
//		int[]myArray = {1,12,53,14,25,16,57};
//		// 짝수만 출력
//		for (int num:myArray) {
//			if(num%2==0) {
//				System.out.println(num);//12,14,16
//			}
//		}
		// 배열 선언 및 초기화
//		int [] numbers = {10, 20, 30, 40, 50};
//		//배열 요소 합계 계산
//		int sum = 0;
//		for (int i = 0 ; i < numbers.length; i++) {
//			sum +=numbers[i];
//		}
//		System.out.println(sum);//150
//		//배열 요소 평균 계산
//		double average = (double) sum / numbers.length;
//		//결과 출력
//		System.out.println("합계"+sum);
//		System.out.println("평균"+average);
//		
//		//배열의 요소들의 평균값을 구하는 예제
//		int arr[]= {1,2,3,4,5};
//		sum = 0;
//		for(int i =0 ; i < arr.length;i++) {
//			sum +=arr[i];
//		}
//		double avg = (double)sum/arr.length;
//		System.out.println("배열의 요소들의 평균값:"+ avg);

		// 배열에서 최댓값과 최솟값을 구하는 예제
//		int[] arr = {10,5,8,2,7};
//		int max = arr[0];
//		int min = arr[0];
//		for(int i = 1; i < arr.length; i++) {
//			if (arr[i]>max) {
//				max = arr [i];
//			}
//			if (arr[i]<min) {
//				min = arr[i];
//			}
//		}
//		System.out.println("배열에서 최댓값 : "+ max);
//		System.out.println("배열에서 최솟값 : "+ min);

		// 연습문제
		// 문제1)배열 a에 1,2,3 을 넣은 후
		// 배열 내의 모든 값에 2를 더한 값인 3,4,5로 변경한
		// 다음에 배열의 내용을 화면에 출력하는 순서도와 코드를 구현하여 보자.
//		int a[]= {1,2,3};
//		for(int i =0; i < a.length ; i++) {
//			a[i]=a[i]+2;
//			System.out.println(a[i]);//3,4,5
//		}
//		int a[]= {1,2,3};
//		for(int i = 0; i < a.length; i++) {
//			a[i]=a[i]+2;
//		}
//		for(int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		// 문제2)배열 a[10]에 3의 배수를 넣은
		// 다음에 배열의 내용을 출력하는 순서도와 의사코드를 만들어 보자.
//		int a[] =new int [10];
//		for (int i =1 ; i<=10; i++) {
//			a[i-1]=i*3;
//		}
//		for(int i =0; i<10; i++) {
//			System.out.print(a[i]+" ");
//		}
		// 문제 3) 배열 a[100]에 1부터 100까지의 숫자를 순서대로 넣은
		// 다음 배열의 인덱스가 짝수인 배열에 들어 있는 값만 출력하는 코드를 만들어 보자.
//		int a[] =new int [100];
//		for (int i =1 ; i<=100; i++) {
//			a[i-1]=i;
//		}
//		for(int i =0; i<100; i++) {
//			if(i%2==0) {
//				System.out.println(a[i]);
//			}
//		}
		// 문제 4) 배열 a[]={12,1,5,3,6,8,5,3}를 만든 다음에
		// 배열의 모든 내용을 더한 값을 sum에 저장하여 출력하는 코드를 만들어 보자.
//		int a[] ={12,1,5,3,6,8,5,3};
//		int sum = 0;
//		for (int i =0 ; i<a.length; i++) {
//			sum=sum+a[i];
//			System.out.println(sum);
//		}
//		System.out.println(sum);//43
		// 문제 5) a[]={12,1,5,3,6,8,5,3}의 a배열에서
		// 배열 안의 숫자가 짝수인 12,6,8 의 값을 더한 결과 값을
		// 출력하는 프로그램을 작성해 보자.
//		int a[]={12,1,5,3,6,8,5,3};
//		int sum = 0;
//		for(int i= 0;i< a.length; i++) {
//			if(a[i]%2==0) {
////				System.out.println(a[i]);//12,6,8
//				sum=sum+a[i];
//			}
//		}
//		System.out.println(sum);//26
		// 문제 6) a[]={12,1,51,3,6,8,5}의
		// a배열에서 가장 큰 값과 가장 작은 값을
		// 더하는 프로그램을 작성해 보자.
//		int a[]= {12,1,51,3,6,8,5};
//		int max = a[0];
//		int min = a[0];
//		for (int i = 0 ; i< a.length; i++) {
//			if(a[i]>max) {
//				max = a[i];
//			}
//			if(a[i]<min) {
//				min = a[i];
//			}
//			
//		}
//		System.out.println("max:"+max+"min:"+min);
//		System.out.println("max:"+max+"min:"+min + "\nmax+min:"+(max+min));
		// 7.배열에 5개의 숫자를 입력받아 넣은 다음
		// 숫자 하나를 입력받아
		// 해당 숫자가 몇번째 인덱스에 들어 있는지 출력하는 프로그램을 만들어 보자.
//		int a[] = new int[5];
//		Scanner sc = new Scanner(System.in);
//		System.out.println("배열에 입력할 수 5개를 입력하세요");
//		for(int i= 0; i<a.length;i++) {
//			a[i]=Integer.parseInt(sc.nextLine());
//		}
//		for(int i= 0; i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
//		System.out.println("배열에서 찾을 수를 입력하세요");
//		//배열에서 사용자가 입력한 수 있는지 확인
//		int userInput = Integer.parseInt(sc.nextLine());
//		for (int i =0 ; i< a.length;i++) {
//			if(a[i]==userInput) {
//				System.out.println(i+"번 째에 있습니다.");
//			break;
//			}else if (a[i]!= userInput) {
//				System.out.println("입력하신 "+userInput+"은 배열에 없습니다.");
//			break;
//			}
//		}

		// 8.배열에 5개의 문자열을 입력받아 넣은
		// 다음 문자열 하나를 입력받아 해당 문자가
		// 몇번째 인덱스에 들어 있는지 출력하는 프로그램을 만들어 보자.
//		int a[] = new int[5];
//		Scanner sc = new Scanner(System.in);
//		System.out.println("배열에 입력할 수 5개를 입력하세요");
//		for(int i= 0; i<a.length;i++) {
//			a[i]=Integer.parseInt(sc.nextLine());
//		}
//		for(int i= 0; i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
//		System.out.println("배열에서 찾을 수를 입력하세요");
//		//배열에서 사용자가 입력한 수 있는지 확인
//		int userInput = Integer.parseInt(sc.nextLine());
//		for (int i =0 ; i< a.length;i++) {
//			if(a[i]==userInput) {
//				System.out.println(i+"번 째에 있습니다.");
//			break;
//			}else if (a[i]!= userInput) {
//				System.out.println("입력하신 "+userInput+"은 배열에 없습니다.");
//			break;
//			}
//		}
		// 9.배열 크기를 입력 받아
		// 배열 크기 만큼 1,2,3,1,2,3,1,2,3 … 숫자를
		// 순서대로 배열안에 넣은 다음 배열의 내용을 출력해 보자.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("배열의 크기를 입력하세요");
//		int num = Integer.parseInt(sc.nextLine());
//		int a[]=new int[num];
//		for(int i = 0 ; i< a.length; i++) {
//			if(i%3==1) {
//				a[i]=2;
//			} else if (i%3==2){
//				a[i]=3;
//			}else if (i%3==0){
//				a[i]=1;
//			}
//			System.out.print(a[i]+" ");
//		}
		// 10.배열에 들어있는 내용을 정순과 역순으로 저장하는 새로운 배열을 만들어 출력해 보자.
		// ex)배열에 1,2,3이 들어 있으면 1,2,3,3,2,1 이 들어 있는 배열
		// ex)배열에 7,15,23,15,23 이 들어 있으면 23,15,23,15,7,7,15,23,15,23 이 들어 있는 배열
//		int arr1[] = { 7, 15, 23, 15, 23 };
//		int arr2[] = new int[arr1.length * 2];
//		for (int i = 0; i < arr1.length; i++) {// 정순 배열
//			arr2[i] = arr1[i];
//		}
//		for (int i = 0; i < arr1.length; i++) {
//			arr2[arr1.length + i] = arr1[arr1.length - 1 - i];
//		}
//		System.out.println(Arrays.toString(arr2));

		// 11.컴퓨터에서 주사위 던지는 프로그램을 구현하였을때 => 주사위 (int)(Math.random()*6+1)
		// 던져서 나온수의 빈도(회수)를 구하는 프로그램을 작성해 보자. int count =0; count++; => 출력
		
		int a[] = new int[6];
		for (int i = 1; i <=200; i++) {
			int dice = (int) (Math.random() * 6);
			a[dice]++;
		}
		for(int i = 0; i< a.length; i++) {
			System.out.println((i+1)+"번의 횟수는"+ a[i]);
		}

	}

}
