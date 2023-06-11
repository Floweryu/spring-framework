package com.floweryu.config;

import com.floweryu.editor.Address;
import com.floweryu.editor.MyAddressPropertyEditor;
import com.floweryu.editor.MyAddressPropertyEditorRegistrar;
import com.floweryu.editor.Customer;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Map;

/**
 * @author Floweryu
 * @date 2023/6/11 17:07
 */
@Configuration
@PropertySource("classpath:application.properties")
public class EditorConfig {

	@Bean
	public Customer customer() {
	    return new Customer();
	}

	@Bean
	public CustomEditorConfigurer addressPropertyEditor() {
		CustomEditorConfigurer configurer = new CustomEditorConfigurer();
		// 使用注册器的方式
//		configurer.setPropertyEditorRegistrars(new PropertyEditorRegistrar[]{new MyAddressPropertyEditorRegistrar()});
		// 也可以直接设置编辑器
		configurer.setCustomEditors(Map.of(Address.class, MyAddressPropertyEditor.class));
		return configurer;
	}
}
