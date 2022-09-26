enum food 
{ hotdog, hamburger, rice, toast;}
public class enumfood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		food f1 = food.hotdog;
		System.out.println(f1);
		System.out.println(f1.ordinal());
		food f2 = food.hamburger;
		System.out.println(f2);
		System.out.println(f2.ordinal());
		food f3 = food.rice;
		System.out.println(f3);
		System.out.println(f3.ordinal());
		food f4 = food.toast;
		System.out.println(f4);
		System.out.println(f4.ordinal());
	}

}
