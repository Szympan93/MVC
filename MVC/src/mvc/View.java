package mvc;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public abstract class View {
	
	private Model model;
	private List<View> views = new ArrayList<View>(); 
	
	public void setModel(Model model) {
		this.model = model;
	}

	public void addChild(View view){
		views.add(view);
	}

	public void subChild(View view){
		views.remove(view);
	}
	
	public View getChild(int index){
		return views.get(index);
	}

	public abstract void addListener(ActionListener listener);

	public void draw()
	{
		for(View i : views)
			i.draw();
	};
}
