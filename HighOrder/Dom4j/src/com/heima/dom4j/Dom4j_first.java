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
			//���˼��ϱ����õ�ÿ��NODE   ���Զ�NODE���в���
			//ele.selectNodes("");    //�ڲ������洫��Xpath��ʽ��·��  ��ȡ���ڵ�ļ���   �Լ��Ͻ��в���   �����е�Ԫ�ؾ��ǽڵ�
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
