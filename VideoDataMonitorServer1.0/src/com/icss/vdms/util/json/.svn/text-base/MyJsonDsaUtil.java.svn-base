package com.icss.vdms.util.json;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.icss.vdms.socket.agreement.MsgAgreement;
import com.icss.vdms.webservice.dsa.agreement.DsaMsgAgreement;
import com.icss.vdms.webservice.dsa.agreement.DsaSearchMsgAgreement;

public class MyJsonDsaUtil {

	// JSON对象
	private static ObjectMapper objectMapper = null;
	// 写入流
	private static Writer strWriter = null;
	// json字符串
	private static String strJson = "";
	
	private MyJsonDsaUtil() {
	}

	static {
		objectMapper = new ObjectMapper();
	}
	
	/**
	 * entity2Json DsaMsgAgreement
	 * 
	 * @param msg
	 * @return
	 */
	static public synchronized String entity2Json(DsaMsgAgreement msg){
		try {
			
			strWriter = new StringWriter();
			// 设置null字段不序列化剔除
			objectMapper.setSerializationInclusion(Include.NON_NULL);
			// 设置输入时忽略JSON字符串中存在而Java对象实际没有的属性
			objectMapper.configure(
					DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			objectMapper.writeValue(strWriter, msg);
			strJson = strWriter.toString();
			strWriter.flush();
			
		} catch (Exception e) {
		} finally {
			if (null != strWriter) {
				try {
					strWriter.close();
				} catch (IOException e) {
				}
				strWriter = null;
			}
		}
		
		return strJson;
	}
	
	/**
	 * json2Entity DsaSearchMsgAgreement
	 * @param jsonStr
	 * @return
	 */
	static public synchronized DsaSearchMsgAgreement json2Entity(String jsonStr){
		
		DsaSearchMsgAgreement searchMsgAgreement = null;
		
		try {
			// 设置null字段不序列化剔除
			objectMapper.setSerializationInclusion(Include.NON_NULL);
			// 设置输入时忽略JSON字符串中存在而Java对象实际没有的属性
			objectMapper.configure(
					DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			searchMsgAgreement = objectMapper.readValue(jsonStr,
					DsaSearchMsgAgreement.class);
		} catch (Exception e) {
			e.printStackTrace();
			searchMsgAgreement = null;
		}
		
		return searchMsgAgreement;
		
	}
	
	
}
