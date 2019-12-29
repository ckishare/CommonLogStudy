package com.ckishare;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 使用 commons-logging 来打印出  java util logging 的日志
 * 属于动态绑定的情况
 * commons-logging 包
 * @author ishare
 * 缺陷：每个模块有不同的 ClassLoader 因此在ClassPath中有可能加载不到
 *
 */
public class JclTest {
	public static void main(String[] args) {
		Log log = LogFactory.getLog(JclTest.class);
		log.error("error message jcl");   // java util logging 方式打印出来
	}
}
