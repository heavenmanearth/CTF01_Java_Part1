public class Project_3 {

	public static void main(String[] args) {

		/*
		 * 1. ประกาศ int i ให้มีค่า = 20 a. เรียก i++ 5 ครั้ง แล้ว print ค่า i
		 * ออกมา b. เรียก --i 5 ครั้ง แล้ว print ค่า i ออกมา
		 */

		int i = 20;
		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println(i);

		--i;
		--i;
		--i;
		--i;
		--i;
		System.out.println(i);

		/*
		 * 2. ทดลองใช้ && กับข้อมูลประเภท float
		 */
		System.out.println(10f != 10);

		/*
		 * 3. ทดลองใช้ || กับข้อมูลประเภท char
		 */
		System.out.println('z' == 122);

	}
}
