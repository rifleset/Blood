package com.example.Blood.admin;

import com.example.Blood.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
public class AdminCommandLineRunner implements CommandLineRunner {

    private final UserService userService; // Assume you have a UserService for user management
    private final Scanner scanner = new Scanner(System.in);

    public AdminCommandLineRunner(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void run(String... args) {
        while (true) {
            System.out.println("Admin Operations:");
            System.out.println("1. List Users\n2. Add User\n3. Delete User\n4. Exit");
            System.out.print("Choose an operation: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // List users
                    userService.findAllUsers().forEach(user -> System.out.println(user.toString()));
                    break;
                case 2:
                    // Add a new user
                    // Collect user details and call userService.saveUser(newUser);
                    break;
                case 3:
                    // Delete a user
                    // Get user ID and call userService.deleteUser(userId);
                    break;
                case 4:
                    return; // Exit the loop and end the application
                default:
                    System.out.println("Invalid option, please choose again.");
            }
        }
    }
}
