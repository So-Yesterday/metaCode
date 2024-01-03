package com.fei.springImpl;

import java.io.File;
import java.lang.annotation.Annotation;
import java.net.URL;

public class YunFeiApplicationContext {
	private Class config;

	public YunFeiApplicationContext(Class config) throws ClassNotFoundException {
		this.config = config;
		// 初始化扫描
		ComponentScan annotation = (ComponentScan)config.getAnnotation(ComponentScan.class);

		if (annotation != null){
			String[] value = annotation.value();

			for (String path : value) {
				ClassLoader classLoader = YunFeiApplicationContext.class.getClassLoader();
				URL resource = classLoader.getResource(path);

				File file = new File(resource.getFile());

				// 加载到的class文件
				Class<?> aClass = classLoader.loadClass(file.getAbsolutePath());
			}
		}
	}
}
