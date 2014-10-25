package mvc;

import java.util.*;

public abstract class Model {
	private List<View> views = new ArrayList<View>();

	public void addView(View view)
	{
		view.setModel(this);
		views.add(view);
	}
	
	public void subView(View view)
	{
		views.remove(view);
	}

}
