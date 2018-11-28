import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import todolist.Application;
import todolist.repository.ToDoListRepository;

import java.sql.Timestamp;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ToDoListRepositoryTest {
    @Autowired
    private ToDoListRepository repo;

    @Test
    public void isImplement() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);
        Assert.assertNotNull(repo.findByCreateDateLessThanEqual(timestamp));
    }
}
