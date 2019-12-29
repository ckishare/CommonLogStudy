 package com.ckishare;

public class SpringTest {

	public static void main(String[] args) {
		// 集成 spring 中的 jcl 框架
		// slf4j-api log4j-slf4j-impl disruptor
		// 这样 spring 会打印到 jdk 中
		
		// 本身日志会打印到 log4j2 和 log4j 中
		// 这样在这个模块中就会产生三种不同的日志文件
		
		// 解决方案：加上 log4j-over-slf4j 适配器，或者采用 jcl-over-slf4j 来适配,都会适配到 log4j2中去
		
		// -------------------------三种日志文件统一问题------------------------------
		
		// 死循环问题
		// slf4j slf4j-log4j12 log4j log4j-over-slf4j 桥接器和适配器不能同时使用
		
		// 两个桥接器的情况下会先绑定前面的实现，原理就是去加载对应的 StaticLoggerBinder 包
		
		// 接口桥接到实现，实现适配到接口
	}
}
