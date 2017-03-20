//题意：将阿拉伯数字转成罗马数字
//Ⅰ、Ⅱ、Ⅲ、Ⅳ、Ⅴ、Ⅵ、Ⅶ、Ⅷ、Ⅸ、Ⅹ、Ⅺ、Ⅻ、XIII XIV XV XVI XVII XVIII XIX XX
//Ｉ、Ｖ、Ｘ、Ｌ、Ｃ、Ｄ和Ｍ，分别表示１、５、１０、５０、１００、５００和１０００

//定义times表示是第几位：个（第一）、十（第二）、百（第三）、千（第四），用num%10一位一位地遍历num
//共分四种情况处理：(1)y<4  (2)y=4 (3)4<y<9 (4)y=9，其中每种情况要根据不同times值而定
public class Solution {
	public static String intToRoman(int num) {
		String rst = "";
		int times = 1;
		int z = num;
		int y = 0;
		while(z!=0){
			y = z%10;
			//（1）y<4
			if(y<4){
				if(times==1){
					for(int i=0;i<y;i++)
						rst = "I"+rst;
				}
				if(times==2){
					for(int i=0;i<y;i++)
						rst = "X"+rst;
				}
				if(times==3){
					for(int i=0;i<y;i++)
						rst = "C"+rst;
				}
				if(times==4){
					for(int i=0;i<y;i++)
						rst = "M"+rst;
				}
			}
			//y=4
			else if(y==4){
				if(times==1){
					rst = "V"+rst;
					rst = "I"+rst;
				}
				if(times==2){
					rst = "L"+rst;
					rst = "X"+rst;
				}
				if(times==3){
					rst = "D"+rst;
					rst = "C"+rst;
				}
			}
			//4<y<9
			else if(y>4&&y<9){
				if(times==1){
					for(int i=0;i<y-5;i++)
						rst = "I"+rst;
					rst = "V"+rst;					
				}
				if(times==2){
					for(int i=0;i<y-5;i++)
						rst = "X"+rst;
					rst = "L"+rst;					
				}
				if(times==3){
					for(int i=0;i<y-5;i++)
						rst = "C"+rst;
					rst = "D"+rst;					
				}
			}
			//y=9
			else if(y==9){
				if(times==1){
					rst = "X"+rst;
					rst = "I"+rst;
				}
				if(times==2){
					rst = "C"+rst;
					rst = "X"+rst;
				}
				if(times==3){
					rst = "M"+rst;
					rst = "C"+rst;
				}
			}			
			z = z/10;
			times++;
		}
		return rst;	        
	}
	
	public static void main(String[] args){
		int n = 90;
		System.out.println(intToRoman(n));
	}
}
