public class Main{
	public static void main(String[] args){
		String [][] retsu = {{"A","B","C"},{"1","2","3"}};
		
		System.out.print("�s����͂��Ă��������i1or2�j");
		int gyou = new java.util.Scanner(System.in).nextInt();

		System.out.print("�����͂��Ă��������i1�`3�j");
		int retu = new java.util.Scanner(System.in).nextInt();

		System.out.println("���Ȃ��̎w�肵���ꏊ�ɂ�����̂�");
		System.out.println(retsu[gyou][retu] + "�ł��B");
	}
}