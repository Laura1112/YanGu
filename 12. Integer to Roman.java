//���⣺������������ת����������
//�񡢢򡢢󡢢�����������������������������������XIII XIV XV XVI XVII XVIII XIX XX
//�ɡ��֡��ء��̡��á��ĺͣͣ��ֱ��ʾ�����������������������������������ͣ�������

//����times��ʾ�ǵڼ�λ��������һ����ʮ���ڶ������٣���������ǧ�����ģ�����num%10һλһλ�ر���num
//���������������(1)y<4  (2)y=4 (3)4<y<9 (4)y=9������ÿ�����Ҫ���ݲ�ͬtimesֵ����
public class Solution {
	public static String intToRoman(int num) {
		String rst = "";
		int times = 1;
		int z = num;
		int y = 0;
		while(z!=0){
			y = z%10;
			//��1��y<4
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
