/**Course: EECS 3461 Student 1: Akalpit Sharma (212650628) Student 2: Phuc Pham (213839436)
 * 
 * user: admin   password: admin
**/
import javax.swing.*;
import java.awt.*;

public class WindowUtilities 
{
	public static void setNativeLookAndFeel() 
	{
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(Exception e)
		{
			System.out.println("Error setting native LAF: " + e);
		}
	}
}