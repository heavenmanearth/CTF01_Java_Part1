import java.util.Scanner;

public class Project_4_4 {

	public static void main(String[] args) {

		// Lab 6

		/*
		 * 1. แสดงค่า i ในแต่ละรอบ โดยการประกาศตัวแปร i มาใช้ในการนับ
		 * ในเงื่อนไขของ while ถ้าหาก i น้อยกว่าหรือเท่ากับ 10 while ( i <= 10 )
		 * แสดงค่า i ออกมา แต่ ละรอบ ( i มีค่าเริ่มต้นเปน็ 1)
		 */
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			sum += i;
			System.out.print(i);
			System.out.print("\t");
			i++;
		}

		/*
		 * 2. สร้างโปรแกรมหาผลรวมของตัวเลข 1 ถึง 10
		 */
		System.out.println();
		System.out.println("And the sum is: " + sum);
		System.out.println();

		/*
		 * 3. สร้างโปรแกรมหาค่าระหว่าง 1-100 ที่หาร 12 ลงตัว
		 */
		i = 1;
		while (i <= 100) {
			if (i % 12 == 0) {
				System.out.print(i);
				System.out.print("\t");
			}

			i++;
		}

		/*
		 * 4. ให้ประกาศ array ที่มีค่า [1,2,3,4,5] แล้วใช้ foreach ในการวน loop
		 * แล้ว print ค่าออกมาทั้งหมด
		 */

		System.out.println();
		System.out.println();
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int j : arr) {
			System.out.print(j);
			System.out.print("\t");
		}

		// Lab 7

		/*
		 * 1. print ค่าตัวเลข 20 โดยเริ่มจากมากไปน้อย
		 */
		System.out.println();
		i = 1;
		do {
			System.out.print(i);
			System.out.print("\t");
			i++;
		} while (i <= 20);

		/*
		 * 2. เขียนโปรแกรมตรวจสอบตัวเลข ว่าเปน็จํานวนคู่ หรือจํานวนคี่
		 * โดยโปรแกรมจะทํางานใน ลูปเรื่อยๆ ถ้าหากเขายังคงกรอกเลขคู่
		 * แต่ถ้ากรอกเลขคี่จะเปน็การออกจากลูป
		 */
		System.out.println();
		System.out.println();
		Scanner sc = new Scanner(System.in);
		i = 0;
		while (true) {
			System.out.println("Please enter any number: ");
			i = sc.nextInt();
			if (i % 2 == 0) {
				System.out.print(i);
				System.out.println();
			} else {
				System.out.println("While-loop ends.");
				break;
			}

		}

		// Lab 8

		/*
		 * 1. กําหนดตัวแปร count สําหรับนับจํานวนรอบ a. count เริ่มต้นที่ 0
		 * และไปจบที่ 20 (รวม 20 ด้วย) b. ถ้า count มีค่าเป็น 11 คําสั่ง break
		 * ภายใน if จะทํางาน c. ให้แสดงค่า 11 และออกจาก loop
		 * โดยไม่ทําคําสั่งด้านล่างต่อ
		 */
		System.out.println();
		int count = 0;
		while (count <= 20) {
			if (count == 11) {
				System.out.println(count);
				break;
			}
			count++;

		}

	}

}
