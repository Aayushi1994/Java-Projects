package collectiondemos;


public class FuntionalInterfaceExample implements sayable{

	@Override
	public void say(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}

	public static void main(String[]args) {
		FuntionalInterfaceExample func = new FuntionalInterfaceExample();
		func.say("Hello there");
	}
}
