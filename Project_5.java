public class Project_5 {

	public static void main(String[] args) {

		// Lab 11

		/*
		 * ทดลองสร้าง method แบบ Return และไม่ Return ค่า และเรียกใช้งาน method
		 * ที่สร้างขึ้น โดยให้แสดงผลลัพธ์บน Console
		 * 
		 */

		helloWorld();
		int myInt = multiplyTen(10);
		System.out.println("The result is: " + myInt);

	}

	public static void helloWorld() {
		System.out.println("Hello World!");
		System.out.println();
	}

	public static int multiplyTen(int x) {
		return 10 * x;
	}

}
