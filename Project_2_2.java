public class Project_2_2 {

	/*
	 * 1. ประกาศ method ชื่อว่า bark ขึ้นมา แล้วเอา method main ไปเรยีก method
	 * bark โดย method bark ให้มี local variable ชื่อ dogName ที่ก
	 * าหนดชื่อหมาเป็นอะไรก็ได้ แล้วก็ให้ print ว่า “The Dog name = xxxbark”
	 */
	public static void bark() {

		String dogName = "Toy";
		System.out.println("The Dog name = " + dogName + " bark");

	}

	/*
	 * 2. ให้ลองเปลี่ยนค่า primitive แล้ว print ออกมา โดยให้เปลี่ยนจาก a. float
	 * -> int b. int -> float c. double -> float d. char -> int
	 */

	public static void main(String[] args) {
		float a = 10.33f;
		int b = (int) a;
		float c = (float) b;
		double d = 12d;
		float e = (float) d;
		char f = 'z';
		int g = (int) f;

		System.out.println(b);
		System.out.println(c);
		System.out.println(e);
		System.out.println(g);

	}

}
