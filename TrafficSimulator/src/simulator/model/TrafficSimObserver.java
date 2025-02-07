package simulator.model;

import java.util.List;

import simulator.model.events.Event;

public interface TrafficSimObserver {
	void onAdvanceStart(RoadMap map, List<Event> events, int time);
	void onAdvanceEnd(RoadMap map, List<Event> events, int time);
	void onEventAdded(RoadMap map, List<Event> events, Event e, int time);
	void onReset(RoadMap map, List<Event> events, int time);
	void onRegister(RoadMap map, List<Event> events, int time);
	void onError(String err);
}
