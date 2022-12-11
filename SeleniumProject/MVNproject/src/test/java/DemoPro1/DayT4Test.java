package DemoPro1;

import org.testng.annotations.Test;

public class DayT4Test {
		@Test
		public void flipkart() {
			System.out.println("I perchase product on filpkart");
		}
		@Test//(dependsOnMethods= {"macys","flipkart"})
		public void Amezon() {
			System.out.println("Perchase watch Amezon");
		}
		@Test
		public void macys() {
			System.out.println("Order Product Macys");
		}
		@Test
		public void Dmart() {
			System.out.println("Perchase oil product Dmart");
		}
}
