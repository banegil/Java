package simulator.view;

public class Dish {
	private String _name;

	public Dish(String name) {
		_name = name;
	}
	
	public String get_name() {
		return _name;
	}
	
	@Override
	public String toString() {
		return _name;
	}
}