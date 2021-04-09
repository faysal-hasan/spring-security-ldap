package com.jbc.spring.security.ldap.controller;

import com.jbc.spring.security.ldap.model.User;
import com.jbc.spring.security.ldap.service.user.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController extends GenericController<User> {
  private final UserService userService;

  public UserController(UserService userService) {
    super(userService);
    this.userService = userService;
  }

  //  @GetMapping("/users/{id}")
  //  public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long userId)
  //      throws ResourceNotFoundException {
  //    User user =
  //        userRepository
  //            .findById(userId)
  //            .orElseThrow(
  //                () -> new ResourceNotFoundException("User not found for this id :: " + userId));
  //    return ResponseEntity.ok().body(user);
  //  }
  //
  //  @PostMapping("/users")
  //  public User createUser(@Valid @RequestBody User user) {
  //    return userRepository.save(user);
  //  }
  //
  //  @PutMapping("/users/{id}")
  //  public ResponseEntity<User> updateUser(
  //      @PathVariable(value = "id") Long userId, @Valid @RequestBody User userDetails)
  //      throws ResourceNotFoundException {
  //    User user =
  //        userRepository
  //            .findById(userId)
  //            .orElseThrow(
  //                () -> new ResourceNotFoundException("User not found for this id :: " + userId));
  //
  //    user.setEmail(userDetails.getEmail());
  //    user.setLastName(userDetails.getLastName());
  //    user.setFirstName(userDetails.getFirstName());
  //    final User updatedUser = userRepository.save(user);
  //    return ResponseEntity.ok(updatedUser);
  //  }
  //
  //  @DeleteMapping("/users/{id}")
  //  public Map<String, Boolean> deleteUser(@PathVariable(value = "id") Long userId)
  //      throws ResourceNotFoundException {
  //    User user =
  //        userRepository
  //            .findById(userId)
  //            .orElseThrow(
  //                () -> new ResourceNotFoundException("User not found for this id :: " + userId));
  //
  //    userRepository.delete(user);
  //    Map<String, Boolean> response = new HashMap<>();
  //    response.put("deleted", Boolean.TRUE);
  //    return response;
  //  }
  //
  //  @PostMapping("/users/multiple")
  //  public void createMultipleUser() {
  //    for (int i = 0; i < 100000; i++) {
  //      String fname = "First Name " + i;
  //      String lname = "Last Name " + i;
  //      User user = new User();
  //      user.setFirstName(fname);
  //      user.setLastName(lname);
  //      user.setEmail("F" + i + "@gmail.com");
  //      userRepository.save(user);
  //    }
  //  }
  //
  //    private String concatenate(String rootApiPath, String apiVersion, String user) {
  //    return "";
  //    }
}
