/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class arr <T>{
    private T[] a;
    public arr(T a[]){
        this.a=a;
    }
    public void show(){
        for(T ele:a){
            System.out.println(ele);
        }
    }
}
public class Generic
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Integer[] a={1,2,3,4,5};
		Character[] s={'h','e','l','l','o'};
		arr<Integer> aa=new arr<Integer>(a);
		aa.show();
		
		arr<Character> ac=new arr<Character>(s);
		ac.show();
	}
}
