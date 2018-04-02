package packageauto;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class LogicFile {

	public static void main(String[] args) {


			
			Resource res=new ClassPathResource("springbean.xml");
			BeanFactory factory=new XmlBeanFactory(res);
			
			Category cg=(Category)factory.getBean("object");
			cg.Display();
			
			
	}

}
