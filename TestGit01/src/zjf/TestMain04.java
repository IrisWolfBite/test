/**
 * 
 */
package zjf;

/**
 * @author junefngZhou@163.com
 * <p>Description: </p>判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
						示例：121 --> 121	true
							 -121 --> 121-	false
 * @date 2020年1月18日 
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
		
		//官方解题思路：1.将数字转换成字符串进行反转
        //2.直接反转当前数，但是要考虑数值溢出问题。
		//所以这里可以只判断这个数的后一半反转后的数是否和前一半的数相等即可。
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
        //得到后一半数反转之后的值	21
        for(int i = 0;i < count;i ++){
            if(i == 0){
                temp1 = (int)(num1 / (Math.pow(10,len - i - 1)));//2
            }else{
               temp1 = (int)((num1 /= 10) % (Math.pow(10,len - i - 1))); //1
            }
            reverseHalf += (temp1 * Math.pow(10,(count - i -1)));//20+1
        }
        //取得前一半的值		21
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
