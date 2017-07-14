package subject.interfaces;

import observer.interfaces.Observer;

public interface Subject {
	public void registarObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
