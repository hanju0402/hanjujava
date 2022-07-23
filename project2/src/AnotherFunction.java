import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.PointerInfo;

import javax.swing.JDialog;

public class AnotherFunction {
	
	// 마우스 위치에 다이아로그 생성하는 메소드
	public static void Point(JDialog jd) {
		PointerInfo pointerInfo = MouseInfo.getPointerInfo();
		pointerInfo.getLocation();
		Dimension my = jd.getSize();
		jd.setLocation(pointerInfo.getLocation().x - my.width/2,
			 pointerInfo.getLocation().y - my.height/2);
	}

}
