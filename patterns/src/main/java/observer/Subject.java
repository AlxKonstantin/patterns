package observer;

/**
 * Interface Subject.
 *
 * @author Konstantin Alekseev.
 * @version 1.0.
 * @since 17.10.2017.
 */
public interface Subject {

    /**
     * Method registerObserver - registers observers.
     *
     * @param o - observer.
     */
    void registerObserver(Observer o);

    /**
     * Method removeObserver - removes observers.
     *
     * @param o - observer.
     */
    void removeObserver(Observer o);

    /**
     * Method notifyObservers - sends messages to observers about updated data.
     */
    void notifyObservers();
}
