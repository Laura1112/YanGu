import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

//由先序和中序遍历，打印出后序遍历
//回溯
public class Main {

	/**
	 * @param args
	 */
	static List<Character> list = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String preorderS = in.nextLine();
		char[] preorder = preorderS.toCharArray();
		String inorderS = in.nextLine();
		char[] inorder = inorderS.toCharArray();
		
		if(inorder == null || inorder.length == 0 || preorder == null || preorder.length == 0 || inorder.length != preorder.length)
			System.out.println("false");
		else{
			HashMap<Character,Integer> map = new HashMap<>();
			for(int i=0;i<inorder.length;i++){
				map.put(inorder[i],i);
			}
			help(inorder,0,inorder.length-1,preorder,0,map,list);
			
			for(int i=list.size()-1;i>=0;i--){
				System.out.print(list.get(i));
			}
		}
	}
	
	public static List<Character> help(char[] inorder,int inStart,int inEnd,char[] preorder,int preStart,HashMap <Character,Integer> map,List<Character> list){
		if(inStart>inEnd)
			return null;
		list.add(preorder[preStart]);
		int idx = map.get(preorder[preStart]);
		help(inorder,idx+1,inEnd,preorder,preStart+idx-inStart+1,map,list);
		help(inorder,inStart,idx-1,preorder,preStart+1,map,list);		
		return list;	
	}

}
