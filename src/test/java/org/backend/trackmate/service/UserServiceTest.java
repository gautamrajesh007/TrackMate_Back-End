//package org.backend.trackmate.service;
//
//import org.aspectj.lang.annotation.Before;
//import org.backend.trackmate.entities.User;
//import org.backend.trackmate.repositories.RoleRepository;
//import org.backend.trackmate.repositories.UserRepository;
//import org.backend.trackmate.services.UserService;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.mockito.MockitoAnnotations.initMocks;
//
//public class UserServiceTest {
//
//    @Mock
//    private UserRepository mockUserRepository;
//
//    @Mock
//    private RoleRepository mockRoleRepository;
//
//    @Mock
//    private BCryptPasswordEncoder mockbCryptPasswordEncoder;
//
//    private UserService userServiceUnderTest;
//    private User user;
//
//    @Before(value = "setUp")
//    private void setUp(){
//        initMocks(this);
//        userServiceUnderTest = new UserService(mockUserRepository, mockRoleRepository, mockbCryptPasswordEncoder);
//
//        user = User.builder()
//                .id(1L)
//                .firstName("Gustavo")
//                .lastName("Garcia")
//                .email("gustavo123@gmail.com")
//                .build();
//
//        Mockito.when(mockUserRepository.save(any())).thenReturn(user);
//        Mockito.when(mockUserRepository.findByEmail(anyString())).thenReturn(user);
//    }
//
//    @Test
//    public void testFindUserByEmail() {
//        // Setup
//        final String email = "test@test.com";
//
//        // Run the test
//        final User result = userServiceUnderTest.findUserByEmail(email);
//
//        // Verify the results
//        assertEquals(email, result.getEmail());
//    }
//
//    @Test
//    public void saveUser() {
//        // Setup
//        final String email = "test@test.com";
//
//        // Run the test
//        User result = userServiceUnderTest.saveUser(User.builder().build());
//
//        // Verify the results
//        assertEquals(email, result.getEmail());
//    }
//}
