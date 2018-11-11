/**Course: EECS 3461 Student 1: Akalpit Sharma (212650628) Student 2: Phuc Pham (213839436)
 * 
 * user: admin   password: admin
**/
import java.awt.*;
import java.awt.event.*;

public class ExitListener extends WindowAdapter 
{
	public void windowClosing(WindowEvent event) 
	{
		System.exit(0);
	}
}