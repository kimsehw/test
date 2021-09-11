public class add{	
		int sum(int x,int y){
		int result = x+y;
		return result;
	}
		int mints(int x,int y){
		int result = x-y;
		return result;
	}



	public static void main(String[]args){
		add myAdd = new add();
		System.out.print(myAdd.sum(3,4));
	}
}