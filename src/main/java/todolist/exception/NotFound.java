package todolist.exception;

public class NotFound extends Exception {
    public NotFound(Long id) {
        super("could not found " + id);
    }
}
