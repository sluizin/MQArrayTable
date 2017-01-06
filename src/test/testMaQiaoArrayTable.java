/**
 * 
 */
package test;

import org.junit.Test;

import MaQiao.MQArrayTable;
import MaQiao.MQArrayTable.Align;


/**
 * @author Sunjian
 * @version 1.0
 * @since jdk1.7
 */
public class testMaQiaoArrayTable {

	@Test
	public void test6(){
		MQArrayTable table=new MQArrayTable();
		table.put("step:2");
		table.put("state","123");
		table.put("state","keyword","456");
		table.put("stat1111e","keyword","oldValue","newValue");
		table.put("normal","test1:size->xx ",20,1.5);
		table.setAlignColumns(Align.center, 1,3);
		table.setAlignColumns(Align.right, 2);
		table.setAlignColumnsLocation(Align.right, 2,1,4,3,1);
		table.setAlignColumnsLocation(Align.center, 0,0);
		System.out.println(table.print());
		System.out.println("");
		System.out.println(table.print(15,30,10,12,10));
		
	}
}
