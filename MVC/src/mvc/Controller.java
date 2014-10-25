package mvc;
import java.awt.event.*;

public abstract class Controller<TModel extends Model, TView extends View> implements ActionListener
{
	private TModel model;
	private TView view;
	
	public TModel getModel() {
		return model;
	}

	public TView getView() {
		return view;
	}

	public Controller (TModel model, TView view) {
		model.addView(view);
		view.addListener(this);
		this.model = model;
		this.view = view;
	}
	
	public abstract void actionPerformed(ActionEvent e); 
}
