package com.icss.vdms.util.json;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.icss.vdms.socket.agreement.MsgAgreement;
import com.icss.vdms.webservice.scan.agreement.VedioMonitorMsgScanAgreement;
import com.icss.vdms.webservice.scan.agreement.VedioMonitorMsgScanFeedBack;

public class MyJsonUtil {

	// JSON对象
	private static ObjectMapper objectMapper = null;
	// 写入流
	private static Writer strWriter = null;
	// json字符串
	private static String strJson = "";
	// MsgAgreement
	private static MsgAgreement msgAgreement = null;

	private MyJsonUtil() {
	}

	static {
		objectMapper = new ObjectMapper();
	}

	/**
	 * entity2Json
	 * 
	 * @param msg
	 * @return
	 */
	static public synchronized String entity2Json(MsgAgreement msg) {

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
	 * json2Entity
	 * 
	 * @param jsonStr
	 * @return
	 */
	static public synchronized MsgAgreement json2Entity(Object jsonStr) {

		try {
			// 设置null字段不序列化剔除
			objectMapper.setSerializationInclusion(Include.NON_NULL);
			// 设置输入时忽略JSON字符串中存在而Java对象实际没有的属性
			objectMapper.configure(
					DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			msgAgreement = objectMapper.readValue(jsonStr.toString(),
					MsgAgreement.class);
		} catch (Exception e) {
			e.printStackTrace();
			msgAgreement = null;
		}

		return msgAgreement;
	}

	/**
	 * json2Entity
	 * 
	 * @param jsonStr
	 * @return
	 */
	static public synchronized MsgAgreement json2Entity(String jsonStr) {

		try {
			// 设置null字段不序列化剔除
			objectMapper.setSerializationInclusion(Include.NON_NULL);
			// 设置输入时忽略JSON字符串中存在而Java对象实际没有的属性
			objectMapper.configure(
					DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			msgAgreement = objectMapper.readValue(jsonStr, MsgAgreement.class);
		} catch (Exception e) {
			e.printStackTrace();
			msgAgreement = null;
		}

		return msgAgreement;
	}

	/**
	 * json2EntityScanAgreement
	 * 
	 * @param jsonStr
	 * @return
	 */
	static public synchronized VedioMonitorMsgScanAgreement json2EntityScanAgreement(
			String jsonStr) {

		VedioMonitorMsgScanAgreement msgScanAgreement = null;

		try {
			// 设置null字段不序列化剔除
			objectMapper.setSerializationInclusion(Include.NON_NULL);
			// 设置输入时忽略JSON字符串中存在而Java对象实际没有的属性
			objectMapper.configure(
					DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			msgScanAgreement = objectMapper.readValue(jsonStr,
					VedioMonitorMsgScanAgreement.class);
		} catch (Exception e) {
			e.printStackTrace();
			msgScanAgreement = null;
		}

		return msgScanAgreement;
	}

	/**
	 * entity2JsonMsgScanFeedBack
	 * @param msg
	 * @return
	 */
	static public synchronized String entity2JsonMsgScanFeedBack(
			VedioMonitorMsgScanFeedBack msg) {
		String strJson = "";
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

}
