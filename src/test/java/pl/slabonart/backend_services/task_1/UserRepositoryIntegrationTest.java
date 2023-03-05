package pl.slabonart.backend_services.task_1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.slabonart.backend_services.task_1.model.User;
import pl.slabonart.backend_services.task_1.repository.UserRepository;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryIntegrationTest {

    private static final User TEST_USER = User.builder()
            .firstName("Artur")
            .sureName("Slabon")
            .birthDate(new Date())
            .build();

    @Autowired
    private UserRepository userRepository;

    @Test
    public void shouldSaveUser() {

        userRepository.save(TEST_USER);

        List<User> users = (List<User>) userRepository.findAll();

        assertEquals(1, users.size());
        checkUserDetails(users.get(0));

    }

    private void checkUserDetails(User user) {
        assertNotNull(user.getId());
        assertEquals(user.getFirstName(), TEST_USER.getFirstName());
        assertEquals(user.getSureName(), TEST_USER.getSureName());
        assertEquals(user.getBirthDate(), TEST_USER.getBirthDate());

    }

}
