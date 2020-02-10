/**
 * 
 */
package zjf;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;

/**
 * @author junefngZhou@163.com
 * <p>Description: </p> 解析xml
 * @date 2019年12月22日 
 */
public class Test02 {
	public static void main(String[] args) {
		//创建DocumentBuilderFactory对象
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			//创建DocumentBuilder对象
			DocumentBuilder builder = factory.newDocumentBuilder();
			System.out.println("1");
			Document d = (Document) builder.parse("src/main/java/staticResources/Test.xml");
			//获取名为student所有结点（NodeList）
			System.out.println("2");
			NodeList sList = ((org.w3c.dom.Document) d).getElementsByTagName("student");
			//遍历获取每个结点信息
			for(int i = 0;i < sList.getLength(); i ++) {
				Node node = sList.item(i);
				NodeList childList = node.getChildNodes();
				for(int j = 0;j < childList.getLength(); j ++) {
					if(childList.item(j).getNodeType() == Node.ELEMENT_NODE) {
						System.out.println(childList.item(j));
					}
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("end");
		
	}
}
