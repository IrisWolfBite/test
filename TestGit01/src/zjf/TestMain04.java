/**
 * 
 */
package zjf;

/**
 * @author junefngZhou@163.com
 * <p>Description: </p>�ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������
						ʾ����121 --> 121	true
							 -121 --> 121-	false
 * @date 2020��1��18�� 
 */
public class TestMain04 {
	public static void main(String[] args) {
		int nums = 2112;
		boolean result = test(nums);
		System.out.println(result);
	}
	
	static boolean test(int nums) {
		/*
		 * String str = String.valueOf(nums); if(nums == 0) { return true; }
		 * 
		 * if(nums < 0) { return false; }
		 * 
		 * StringBuilder sb = new StringBuilder(); for (int i = str.length() - 1; i >=
		 * 0; i--) { sb.append(str.charAt(i)); } if(sb.toString().equals(str)) { return
		 * true; } return false;
		 */
		
		//�ٷ�����˼·��1.������ת�����ַ������з�ת
        //2.ֱ�ӷ�ת��ǰ��������Ҫ������ֵ������⡣
		//�����������ֻ�ж�������ĺ�һ�뷴ת������Ƿ��ǰһ�������ȼ��ɡ�
        if(nums == 0){
            return true;
        }
        if(nums < 0){
            return false;
        }
        int len = String.valueOf(nums).length();//4
        int count = (len + 1) / 2;//2
        int reverseHalf = 0;
        int half = 0;
        int temp1 = 0;
        int temp2 = 0;
        int num1 = nums;
        int num2 = nums;
        //�õ���һ������ת֮���ֵ	21
        for(int i = 0;i < count;i ++){
            if(i == 0){
                temp1 = (int)(num1 / (Math.pow(10,len - i - 1)));//2
            }else{
               temp1 = (int)((num1 /= 10) % (Math.pow(10,len - i - 1))); //1
            }
            reverseHalf += (temp1 * Math.pow(10,(count - i -1)));//20+1
        }
        //ȡ��ǰһ���ֵ		21
        for(int j = 0;j < count;j ++){
            if(j == 0){
                temp2 = num2;
            }else{
                temp2 = (int) (num2 %= Math.pow(10, len - j));
            }
            half += (temp2 / Math.pow(10, len - j - 1)) * Math.pow(10, count - j - 1);//20 + 1 = 21
        }
        if(half == reverseHalf){
            return true;
        }else{
            return false;
        }
	}
}
