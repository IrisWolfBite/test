/**
 * 
 */
package zjf;

/**
 * @author junefngZhou@163.com
 * <p>Description: </p>给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * @date 2020年1月14日 
 */
public class Test03 {
	public static void main(String[] args) {
		int nums = -543;
		int resultString = test(nums);
		System.out.println(resultString);
	}
	
	static int test(int nums) {
		//将其转换成字符串进行处理
		String str = String.valueOf(nums);
		int result = 0;
		if(nums == 0) {
			result = 0;
		}else if(nums > 0) {
			StringBuilder sb = new StringBuilder();
			for (int j = str.length() - 1; j >= 0; j--) {
				result = (Integer.valueOf(sb.append(String.valueOf(str.charAt(j))).toString()));
			}
		}else{
			StringBuilder sb = new StringBuilder();
			str = str.substring(1);
			for (int j = str.length() - 1; j >= 0; j--) {
				result = - (Integer.valueOf(sb.append(String.valueOf(str.charAt(j))).toString()));
			}
		}
		if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
			result = 0;
		}
		return result;
	}
}
