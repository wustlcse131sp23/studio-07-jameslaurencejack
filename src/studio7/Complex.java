package studio7;

public class Complex {


	   private int a;
	   private int b;


	   
	   public Complex(int aPart, int bPart)
	   {
		   a = aPart;
		   b = bPart;
	   }
	   

	public void display() {
			System.out.println(a + " + " + b + "i");
	   }
	   public Complex multiply(Complex aComNum) {

		   int aNew = this.a * aComNum.a - this.b * aComNum.b;
		   int bNew = this.a * aComNum.b + this.b * aComNum.a;
		   Complex result = new Complex(aNew, bNew);

		   return result;

		   }
	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex com1 = new Complex(2, 3);
		Complex com2 = new Complex(1, 1);

		com1.multiply(com2);
		com1.display();
		com2.display();
		Complex com3 = com1.multiply(com2).multiply(com2);
		com3.display();

	}

}
