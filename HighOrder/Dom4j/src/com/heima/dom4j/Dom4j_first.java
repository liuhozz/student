package com.heima.dom4j;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Dom4j_first{

	public void Testlod(){
		SAXReader sax=new SAXReader();
		try {
			Document doc = sax.read(new File("user.xml"));
			Element ele = doc.getRootElement();
			ele.elements();
			//将此集合遍历得到每个NODE   可以对NODE进行操作
			//ele.selectNodes("");    //在参数里面传入Xpath格式的路径  获取到节点的集合   对集合进行操作   集合中的元素就是节点
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
