package test;

public class StaticTest {

	public int num = 1;//1스테이틱이 아니니 인스턴스화가 필요,인스턴스변수
	
	public static int number = 1;//5스테이틱이니 인스턴스화안해도됌.스테이틱 변수
	
	public static void main(String[] args) {
		StaticTest.number=10;//7바꿨으니
		System.out.println(StaticTest.number);//8당연히 10나옴
		StaticTest st = new StaticTest();
		System.out.println(st.num);
		//2결과값 1
		StaticTest st1 = new StaticTest();
		st.num =10;//3.나중에 바꿨으니 위에 그대로 1로 나옴
		System.out.println(st1.num);//4.변수가전혀 관련없으니 1그대로나옴
/////////////////////////////		
		st.number=2;//10. 2넣고나서는 밑에다 2나옴
		System.out.println(st.number); //6,1나옴   9,10나옴 
		System.out.println(st1.number);
		
	}
}
