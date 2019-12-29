package com.ckishare;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * simple logging facade for java 简单日志门面
 * 用 slf4j 来对接 log4j
 * 采用桥接的方法  
 * @author ishare
 *
 */
public class Sl4jTest {
	
	private static Logger logger = LoggerFactory.getLogger(Sl4jTest.class);

	public static void main(String[] args) {
		
		// slf4j-api  slf4j-log4j12  log4j  实现 log4j 日志打印
		logger.error("log4j2 error ... ");
		
		// 如果要打印 java util logging 应该怎么办呢？
		// slf4j-api  slf4j-jdk14 
		
		// 打印 log4j2 slf4j-api log4j-slf4j-impl
		
		// 使用 jcl slf4j-api slf4j-jcl jcl(这个需要使用他的一套日志方案)
		
		// ----------------------基本使用-------------------------
		
		// 场景1: app多个模块，A 模块是 log4j ,开发新模块是用的 想用 log4j2,这样就会出现两个日志文件，如何去解决呢？
		// 解决方案：修改A模块的方法不靠谱
		// 模块A加入 log4j-slf4j 的适配器，就可以直接适配到slf4j中去
		// slf4j-api log4j-slf4j-impl log4j disruptor
		
//		org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Sl4jTest.class);
		logger.error("log4j error ... ");
		
		// 场景一就会出现两个日志文件，现在改为全部用log4j2打印
		// 加入适配包 log4j-over-slf4j 就可以将 log4j 转为 slf4j 体系中的 log4j2
		// slf4j-api log4j-slf4j-impl log4j-over-slf4j log4j
		// 注意 log4j 要考虑顺序，必须放在 log4j-over-slf4j 后面，应该要去掉(适配器里的class和log4j里面的是一样的) 
		
		// 适配器：jcl jul 都可以进行适配 
		
		// spring 是使用 jcl 来打印日志的，我们怎么进行统一呢？
		
		
		
	}
}
