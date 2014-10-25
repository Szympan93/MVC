import mvc.impl.controllers.CMain;
import mvc.impl.models.MMain;
import mvc.impl.views.VMain;



public class Main {

	public static void main(String[] args) {
		
		new CMain(new MMain(), new VMain());

	}

}
