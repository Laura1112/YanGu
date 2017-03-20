import java.util.Scanner;

/**
 * Find the total area covered by two rectilinear rectangles in a 2D plane.

Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.

Rectangle Area
Assume that the total area is never beyond the maximum possible value of int.
 * @author Laura
 *
 */

public class Solution {
	public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int overlay = 0;
        int result = 0;
        int width = 0,height = 0;
        int maw,miw,mah,mih;
     
        maw = Math.max(A,E);
        miw = Math.min(C,G);
        mah = Math.max(B,F);
        mih = Math.min(D,H);
        
        width = miw-maw;
        height = mih-mah;
        
        if(miw>maw&&mih>mah)
        	 result = Math.abs(C-A)*Math.abs(D-B)+Math.abs(G-E)*Math.abs(H-F)-width*height;
        else
        	result = Math.abs(C-A)*Math.abs(D-B)+Math.abs(G-E)*Math.abs(H-F);
        
        
        return result;
		
        //或用以下方法，本质一样
		/*int val = (C-A)*(D-B) + (G-E)*(H-F);
        if (E > C || G < A || F > D || H < B) {
            return val;
        }
        val -= (Math.min(C,G) - Math.max(A,E))*(Math.min(D,H) - Math.max(B,F));
        return val;*/
    }
	
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int[] coordinate = new int[8];
		for(int i=0;i<8;i++)
			coordinate[i] = in.nextInt();
		System.out.println(computeArea(coordinate[0],coordinate[1],coordinate[2],coordinate[3],coordinate[4],coordinate[5],coordinate[6],coordinate[7]));
	}

}
