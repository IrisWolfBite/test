/**
 * 
 */
package zjf;

import java.util.Scanner;

/**
 * @author junefngZhou@163.com
 * <p>Description: </p> ����һ�ַ������飬��������Ԫ�صĹ���ǰ׺
 * 							�磺String[] strArray = new String[]{"flower","flow","flat"};
 * 								���Ϊ�� String result = "fl";
 * @date 2020��1��9�� 
 */
public class TT {
	public static void main(String[] args) {
//		String[] strArrayStrings = new String[] {"flower"};
//		String[] strArrayStrings = new String[] {"flower","flow"};
//		String[] strArrayStrings = new String[] {"flower","flow","flat"};
//		String[] strArrayStrings = new String[] {"acc","aaa"};
		String[] strArrayStrings = new String[] {"acc","aaa","aaba"};
		
		String result = test(strArrayStrings);
		System.out.print("result:" + result);
	}
	
	static String test(String[] strArray) {
		String small = "";
		String large = "";
		String result = "";
		
		
		//�������Ϊnull,���� ""��
		if(strArray.length == 0) {
			return "";
		}
		//�������ֻ��һ��Ԫ�أ�����strArray[0]
		if(strArray.length == 1) {
			return strArray[0];		
		}
		//��������к���Ԫ�ظ�������1
		if(strArray.length > 1) {
			for (int i = 1; i < strArray.length; i++) {
				StringBuilder sb = new StringBuilder();
				if(strArray[i - 1].length() <= strArray[i].length()) {
					small = strArray[i - 1];
					large = strArray[i];
					if(small .length() == 0) {
						return "";
					}
					for (int j = 0; j < large.length(); j++) {
						result = sb.append(String.valueOf(large.charAt(j))).toString();
						//���жϣ���ֹ����Խ��Exception
						if((j + 1) <= small.length()) {
							if(small.substring(0,j + 1).equals(result)) {
								continue;
							}else {
								if(j == 0) {
									return "";
								}
								result = result.substring(0,j);
								break;
							}
						}else {
							if(small.equals(result)) {
								continue;
							}else {
								if(j == 0) {
									return "";
								}
								result = result.substring(0,j);
								break;
							}
						}
					}
					//���ȽϺ�Ľ���������һ��Ԫ�ؽ��бȽ�
					strArray[i] = result;
				}else {
					small = strArray[i];
					large = strArray[i - 1];
					if(small.length() == 0) {
						return "";
					}
					for (int j = 0; j < large.length(); j++) {
						result = sb.append(String.valueOf(large.charAt(j))).toString();
						if((j + 1) <= small.length()) {
							if(small.substring(0,j + 1).equals(result)) {
								continue;
							}else {
								if(j == 0) {
									return "";
								}
								result = result.substring(0,j);
								break;
							}
						}else {
							if(small.equals(result)) {
								continue;
							}else {
								if(j == 0) {
									return "";
								}
								result = result.substring(0,j);
								break;
							}
						}
					}
					strArray[i] = result;
				}
			}
			return result;
		}
		
		return null;
	}
}
