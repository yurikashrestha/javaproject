package assignmentoopko;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
public class assignmentjavaoopko {
    // Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).

        abstract static class User {
            protected String userId;
            protected String name;
            protected String email;
            protected String password;

            public User(String userId, String name, String email, String password) {
                this.userId = userId;
                this.name = name;
                this.email = email;
                this.password = password;
            }

            public boolean login(String email, String password) {
                return this.email.equals(email) && this.password.equals(password);
            }

            public String getName() {
                return this.name;
            }

            public String getEmail() {
                return this.email;
            }

            public void logout() {
                System.out.println("Logged out successfully.");
            }

            public abstract void displayRole();
        }

        static class NormalUser extends User {
            private final ArrayList<GreenActivity> myActivities;

            public NormalUser(String userId, String name, String email, String password) {
                super(userId, name, email, password);
                this.myActivities = new ArrayList<>();
            }

            public void logActivity(ActivityType activityType) {
                GreenActivity activity = new GreenActivity(this.userId, activityType);
                this.myActivities.add(activity);
                System.out.println("Activity logged successfully!");
            }

            public ArrayList<GreenActivity> getMyActivities() {
                return new ArrayList<>(this.myActivities); // Return a copy for encapsulation
            }

            public void viewMyActivities() {
                if (this.myActivities.isEmpty()) {
                    System.out.println("No activities logged yet.");
                } else {
                    System.out.println("\n--- Your Activities ---");
                    for (GreenActivity activity : this.myActivities) {
                        System.out.println(activity);
                    }
                }
            }

            @Override
            public void displayRole() {
                System.out.println("Role: Normal User");
            }
        }

        static class Admin extends User {
            private final ArrayList<GreenActivity> allActivities;
            private final ArrayList<NormalUser> users;

            public Admin(String userId, String name, String email, String password) {
                super(userId, name, email, password);
                this.allActivities = new ArrayList<>();
                this.users = new ArrayList<>();
            }

            public void addUser(NormalUser user) {
                this.users.add(user);
            }

            public void recordActivity(GreenActivity activity) {
                this.allActivities.add(activity);
            }

            public void viewAllActivities() {
                if (this.allActivities.isEmpty()) {
                    System.out.println("No activities recorded yet.");
                } else {
                    System.out.println("\n--- All Activities ---");
                    for (GreenActivity activity : this.allActivities) {
                        System.out.println(activity);
                    }
                }
            }

            public void generateReport() {
                System.out.println("\n--- Activity Report ---");
                System.out.println("Total Activities: " + this.allActivities.size());
                System.out.println("Total Users: " + this.users.size());
            }

            @Override
            public void displayRole() {
                System.out.println("Role: Administrator");
            }
        }

        enum ActivityType {
            WALKING_CYCLING("Walking/Cycling"),
            SAVE_ELECTRICITY("Save Electricity"),
            REUSABLE_MATERIALS("Reusable Materials"),
            PLANT_TREES("Plant Trees");

            private final String displayName;

            ActivityType(String displayName) {
                this.displayName = displayName;
            }

            public String getDisplayName() {
                return displayName;
            }

            public static ActivityType fromInt(int choice) {
                return switch (choice) {
                    case 1 -> WALKING_CYCLING;
                    case 2 -> SAVE_ELECTRICITY;
                    case 3 -> REUSABLE_MATERIALS;
                    case 4 -> PLANT_TREES;
                    default -> null;
                };
            }
        }

        static class GreenActivity {
            private final String userId;
            private final ActivityType activityType;
            private final LocalDateTime timestamp;

            public GreenActivity(String userId, ActivityType activityType) {
                this.userId = userId;
                this.activityType = activityType;
                this.timestamp = LocalDateTime.now();
            }

            public String getUserId() {
                return this.userId;
            }

            public ActivityType getActivityType() {
                return this.activityType;
            }

            public LocalDateTime getTimestamp() {
                return this.timestamp;
            }

            @Override
            public String toString() {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                return "User ID: " + this.userId + ", Activity: " + this.activityType.getDisplayName() + ", Time: " + this.timestamp.format(formatter);
            }
        }

        public static class Main {
            private static final ArrayList<User> REGISTERED_USERS = new ArrayList<>();
            private static Admin adminUser;

            private static final Scanner SCANNER = new Scanner(System.in);

            public static void main(String[] args) {
                System.out.println("=== Green Campus Helper ===\n");
                initializeSystem();
                mainMenu();
            }

            private static void initializeSystem() {
                adminUser = new Admin("ADMIN001", "Dr. Green", "admin@campus.edu", "admin123");
                REGISTERED_USERS.add(adminUser);
            }

            private static boolean isValidEmail(String email) {
                return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
            }

            private static void mainMenu() {
                while (true) {
                    System.out.println("\n--- Main Menu ---");
                    System.out.println("1. Register");
                    System.out.println("2. Login");
                    System.out.println("3. Exit");
                    System.out.print("Choose an option: ");

                    try {
                        int choice = Integer.parseInt(SCANNER.nextLine());
                        switch (choice) {
                            case 1:
                                register();
                                break;
                            case 2:
                                login();
                                break;
                            case 3:
                                System.out.println("Thank you for using Green Campus Helper!");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Invalid option. Try again.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a number.");
                    }
                }
            }

            private static void register() {
                System.out.print("Enter name: ");
                String name = SCANNER.nextLine().trim();
                if (name.isEmpty()) {
                    System.out.println("Name cannot be empty.");
                    return;
                }
                System.out.print("Enter email: ");
                String email = SCANNER.nextLine().trim();
                if (!isValidEmail(email)) {
                    System.out.println("Invalid email format. Please try again.");
                    return;
                }
                System.out.print("Enter password: ");
                String password = SCANNER.nextLine().trim();
                if (password.isEmpty()) {
                    System.out.println("Password cannot be empty.");
                    return;
                }
                String userId = "USER" + REGISTERED_USERS.size();
                NormalUser user = new NormalUser(userId, name, email, password);
                REGISTERED_USERS.add(user);
                adminUser.addUser(user);
                System.out.println("Registration successful! Your User ID: " + userId);
            }

            private static void login() {
                System.out.print("Enter email: ");
                String email = SCANNER.nextLine().trim();
                if (!isValidEmail(email)) {
                    System.out.println("Invalid email format. Please try again.");
                    return;
                }
                System.out.print("Enter password: ");
                String password = SCANNER.nextLine().trim();
                for (User user : REGISTERED_USERS) {
                    if (user.login(email, password)) {
                        System.out.println("\nLogin successful! Welcome, " + user.getName());
                        user.displayRole();
                        if (user instanceof Admin) {
                            adminMenu((Admin) user);
                        } else if (user instanceof NormalUser) {
                            userMenu((NormalUser) user);
                        }
                        return;
                    }
                }
                System.out.println("Invalid credentials.");
            }

            private static void userMenu(NormalUser user) {
                while (true) {
                    System.out.println("\n--- User Menu ---");
                    System.out.println("1. Log Activity");
                    System.out.println("2. View My Activities");
                    System.out.println("3. Logout");
                    System.out.print("Choose an option: ");

                    try {
                        int choice = Integer.parseInt(SCANNER.nextLine());
                        switch (choice) {
                            case 1 -> logActivityMenu(user);
                            case 2 -> user.viewMyActivities();
                            case 3 -> {
                                user.logout();
                                return;
                            }
                            default -> System.out.println("Invalid option.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input.");
                    }
                }
            }

            private static void logActivityMenu(NormalUser user) {
                System.out.println("\n--- Select Activity Type ---");
                System.out.println("1. Walking/Cycling");
                System.out.println("2. Save Electricity");
                System.out.println("3. Reusable Materials");
                System.out.println("4. Plant Trees");
                System.out.print("Choose activity: ");

                try {
                    int choice = Integer.parseInt(SCANNER.nextLine());
                    ActivityType activityType = ActivityType.fromInt(choice);
                    if (activityType != null) {
                        user.logActivity(activityType);
                        GreenActivity activity = user.getMyActivities().get(user.getMyActivities().size() - 1);
                        adminUser.recordActivity(activity);
                    } else {
                        System.out.println("Invalid choice.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input.");
                }
            }

            private static void adminMenu(Admin admin) {
                while (true) {
                    System.out.println("\n--- Admin Menu ---");
                    System.out.println("1. View All Activities");
                    System.out.println("2. Generate Report");
                    System.out.println("3. Logout");
                    System.out.print("Choose an option: ");

                    try {
                        int choice = Integer.parseInt(SCANNER.nextLine());
                        switch (choice) {
                            case 1 -> admin.viewAllActivities();
                            case 2 -> admin.generateReport();
                            case 3 -> {
                                admin.logout();
                                return;
                            }
                            default -> System.out.println("Invalid option.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input.");
                    }
                }
            }
        }
    }

