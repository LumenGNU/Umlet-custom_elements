import java.awt.*;
import java.util.*;

import com.baselet.control.constants.Constants;
import com.baselet.control.util.Utils;
import com.baselet.element.old.custom.CustomElement;

@SuppressWarnings("serial")
public class <!CLASSNAME!> extends CustomElement {

	public CustomElementImpl() {
		
	}
	
	@Override
	public void paint() {
		Vector<String> textlines = Utils.decomposeStrings(this.getPanelAttributes());
	
		/****CUSTOM_CODE START****/

int padding=12;
int y=textHeight()+padding;

setForegroundColor("#11");
setLineThickness(3);
drawRectangleRound(3,3,width-6,height-6,12,12);
resetAll();

boolean center = true;	

for(String textline : textlines) {


	if (textline.equals("-----")) {
		setForegroundColor("#11");
		drawLine(6,y,width-6,y);
		resetAll();
		y += padding*2;
		center = false;
	}
	else if (textline.equals("..")){
		y += padding;
	}
	else {
		if (center == true) {
			y += printCenter(textline,y);
		}
		else {
			y += print(textline,padding,y);	
		}
	}
}

		/****CUSTOM_CODE END****/
	}
}
