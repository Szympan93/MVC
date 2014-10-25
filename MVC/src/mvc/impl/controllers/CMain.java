package mvc.impl.controllers;

import java.awt.event.ActionEvent;

import mvc.Controller;
import mvc.impl.models.MMain;
import mvc.impl.views.VMain;


public class CMain extends Controller<MMain,VMain> {
	

	public CMain(MMain model, VMain view) {
		super(model, view);
		view.draw();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(getView().bTest == e.getSource())
		{
			getModel().doTest();
		}

	}

}
