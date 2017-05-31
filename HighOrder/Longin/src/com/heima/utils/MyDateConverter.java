package com.heima.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.beanutils.Converter;

/**
 * �Զ��� java.util.Date����ת����
 * 
 * 
 */
public class MyDateConverter implements Converter {

	@Override
	// ��value ת�� c ��Ӧ����
	// ����Class����Ŀ�ı�дͨ��ת���������ת��Ŀ��������ȷ���ģ����Բ�ʹ��c ����
	public Object convert(Class c, Object value) {
		String strVal = (String) value;
		// ��Stringת��ΪDate --- ��Ҫʹ�����ڸ�ʽ��
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = dateFormat.parse(strVal);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
