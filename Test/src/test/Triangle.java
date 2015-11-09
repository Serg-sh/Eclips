package test;

public class Triangle {

	public static void main(String[] args) {
		new Triangle().trianglePaint();

	}
	private void trianglePaint (){
		for (int i = 0; i < 10 ; i++){
			for (int j = 0; j < i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
