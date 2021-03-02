public class Project_4_5 {

	public static void main(String[] args) {

		// Lab 9

		/*
		 * 1. กําหนดตัวแปร count สําหรับนับจํานวนรอบ a. count เริ่มต้นที่ 0
		 * และไปจบที่ 20 (รวม 20 ด้วย) b. ถา้ count มีค่าเปน็ 11 คําสั่ง
		 * continue ภายใน if จะทํางาน c. ให้แสดงค่า 11
		 * และเริ่มต้นรอบใหม่โดยไม่สนใจคําสั่งที่เหลือด้านล่าง
		 */

		int count = 0;
		while (count <= 20) {
			count++;

			if (count == 11) {
				System.out.print(count);
				System.out.println();
				continue;
			}
		}

		// Lab 10

		/*
		 * 1. ให้สร้างโปรแกรมวน loop 10 รอบ โดยมีค่าเริ่มต้นที่ 1 และไปจบ 10
		 * ให้แสดงทุกค่ายกเว้นค่า 2 โดยใช้คําสั่ง continue
		 */
		System.out.println();
		count = 0;
		while (count < 10) {
			count++;
			if (count == 2)
				continue;
			System.out.println(count);
		}
	}
}
