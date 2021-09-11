public class add{	
		int sum(int x,int y){
		int result = x+y;
		return result;
	}
		int minus(int x,int y){
		int result = x-y;
		return result;
	}
		int multiple(int x,int y){
		int result = x*y;
		return result;
	}
		int divide(int x,int y){
		int result = x/y;
		return result;
	}
		void print(){
		System.out.println("HI");
	}
		int remainder(int x,int y){
		int result = x%y;
		return result;
	}// 충돌 유발 주석







	public static void main(String[]args){
		add myAdd = new add();
		System.out.print(myAdd.sum(3,4));
	}
}