package com.ckishare;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 使用 commons-logging 来打印出  java util logging 的日志
 * commons-logging log4j 包
 * @author ishare
 *
 */
public class Log4jTest {
	public static void main(String[] args) {
		Log log = LogFactory.getLog(Log4jTest.class);
		log.error("error message jcl");   // log4j 方式打印出来 需要配置文件
	}
}
