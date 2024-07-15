public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyItemRemoved(String item);
    void notifyItemAdded(String item);

}
