package ExecutableJar;

import org.testng.TestNG;

import Test.TestController;

public class RunnableJarFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 TestNG testng = new TestNG();
         Class[] classes = new Class[]{TestController.class};
         testng.setTestClasses(classes);
         testng.run();

	}

}
