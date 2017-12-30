package Listners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class RetryListner implements IAnnotationTransformer{
	private static final Logger log =Logger.getLogger(RetryListner.class.getName());

	public void transform(ITestAnnotation annotation, Class testClass,
			Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		
		IRetryAnalyzer retry=annotation.getRetryAnalyzer();
		log.info(retry);
		
		if(retry==null)
			annotation.setRetryAnalyzer(Retry.class);
	}

}
