
import Models.Food;
import Models.Mood;
import Models.User;


public class TestControl {
    public TestControl() {
        //
        // Test Food class
        //
        System.out.println("\nTesting Food class");
        Food f = new Food();
        System.out.println("Current name is: " + f.getName());
        f.setName("Pizza");
        System.out.println("New name should be Pizza: " + f.getName());
        
        System.out.println("Current CaloriesPerServing is: " + f.getCaloriesPerServing());
        f.setCaloriesPerServing(15);
        System.out.println("New CaloriesPerServing should be 15: " + f.getCaloriesPerServing());
        
        System.out.println("Current TotalCalories is: " + f.getTotalCalories());
        f.setServings(30);
        System.out.println("New TotalCalories should be 30 * 15 = 450: " + f.getTotalCalories());
        
        //
        // Test Mood class
        //
        System.out.println("\nTesting Mood class");
        Mood m = new Mood();
        System.out.println("Current User is: " + m.getUser());
        m.setUser(new User("John", "happy"));
        System.out.println("New User should be John, happy: " + m.getUser());
        
        System.out.println("Current name is: " + m.getName());
        m.setName("angry");
        System.out.println("New name should be angry: " + m.getName());
                
        //
        // Test User class
        //
        System.out.println("\nTesting User class");
        User u = new User();
        System.out.println("Current id is: " + u.getId());
        u.setId(17);
        System.out.println("New id should be 17: " + u.getId());
        
        System.out.println("Current name is: " + u.getName());
        u.setName("Sam");
        System.out.println("New name should be Sam: " + u.getName());
        
        System.out.println("Current mood is: " + u.getMood());
        u.setMood(new Mood("sad"));
        System.out.println("New mood should be sad: " + u.getMood());
    }
}
