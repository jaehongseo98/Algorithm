package inputoutput;

import java.util.Scanner;

//����
//(�� �ڸ� ��) �� (�� �ڸ� ��)�� ������ ���� ������ ���Ͽ� �̷������.
//
//
//
//(1)�� (2)��ġ�� �� �� �ڸ� �ڿ����� �־��� �� (3), (4), (5), (6)��ġ�� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù° �ٿ� (1)�� ��ġ�� �� �� �ڸ� �ڿ�����, ��° �ٿ� (2)�� ��ġ�� �� ���ڸ� �ڿ����� �־�����.
//
//���
//ù° �ٺ��� ��° �ٱ��� ���ʴ�� (3), (4), (5), (6)�� �� ���� ����Ѵ�.
public class C2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inputNum1 = sc.nextInt();
		int inputNum2 = sc.nextInt();
		int n1 = inputNum1 * (inputNum2 % 10 );
		int n2 = inputNum1 * (inputNum2 % 100 / 10 );
		int n3 = inputNum1 * (inputNum2 / 100 );
		
		sc.close();
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(inputNum1 * inputNum2);
	}

}
