/**
 * 
 */
package zjf;

/**
 * @author junefngZhou@163.com
 * <p>Description: </p>����һ�� 32 λ���з�������������Ҫ�����������ÿλ�ϵ����ֽ��з�ת��
 * @date 2020��1��14�� 
 */
public class Test03 {
	public static void main(String[] args) {
		int nums = -543;
		int resultString = test(nums);
		System.out.println(resultString);
	}
	
	static int test(int nums) {
		//����ת�����ַ������д���
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
