public class Main{
	public static void main(String[] args){
		int[] numbers = { 3, 4, 9 };
		System.out.println("1���̐�������͂��Ă�������");

	int input = new java.util.Scanner(System.in).nexiInt();

	for(int n : numbers){
		if(n == input){
			System.out.println("�A�^���I");
		}
	}
}