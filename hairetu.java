
public class hairetu {

	public static void main(String[] args) {
		// 配列	
		String[] name = new String[3];
		
		name[0]="田中";
		name[1]="高橋";
		name[2]="斎藤";
		
		System.out.println("name[0]");
		
		
		String[] names ={"田中","高橋","斎藤"};
		System.out.println("names[0]");
		
		char[] c ={'x','y','z'};
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		
		int[] i = {1,5,10};
		System.out.println(i[0]);
		
		//一度、配列に格納したデータを更新する
		String[] namae ={"田中","高橋","斎藤"};
		namae[0] = "加藤";
		System.out.println(namae[0]);
		
	}

}
