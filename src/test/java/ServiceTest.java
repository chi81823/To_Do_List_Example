import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import todolist.exception.NotFound;
import todolist.service.ToDoListService;

public class ServiceTest {
    @Autowired
    private ToDoListService service;

    @Test
    public void testFind() throws NotFound {
//        service.findEstimed(1543155640677L, 0L);
    }
}
