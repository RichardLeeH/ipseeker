package org.ipseeker;

public class Test {

		public static void main(String[] args) {
			
			String path = System.getProperty("user.dir");
			String dataPath = path + "/QQWry.dat";
			
			IPSeeker.register(dataPath);
			System.out.println(dataPath);

			System.out.println(IPSeeker.getInstance().getAddress("61.152.175.13"));	
		}
}
