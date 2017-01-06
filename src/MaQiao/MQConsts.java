/**
 * 
 */
package MaQiao;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

/**
 * 常量池
 * @author Sunjian
 * @version 1.0
 * @since jdk1.7
 */
public final class MQConsts {

	static final Unsafe UNSAFE;
	/**
	 * String对象中value(char[])地址偏移量
	 */
	public static long StringArrayOffset = 0L;
	static {
		try {
			final Field field = Unsafe.class.getDeclaredField("theUnsafe");
			field.setAccessible(true);
			UNSAFE = (Unsafe) field.get(null);
			StringArrayOffset = UNSAFE.objectFieldOffset(String.class.getDeclaredField("value"));/*得到String对象中数组的偏移量*/
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
