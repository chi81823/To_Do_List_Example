package todolist.exception;

public class NotFoundEntity extends RuntimeException {
    public NotFoundEntity(Long id) {
        super("could not found " + id);
    }
}
