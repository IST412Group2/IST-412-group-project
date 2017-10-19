package Controllers;

import Models.User;
import Models.UserList;
import Views.MainUI;

public class MainCntl {
    private MainUI mainView;
    private UserList users;
    private User currentUser;
    
    public MainCntl(){
        new MainUI(this).setVisible(true);
    }
    
    public void correlateFoodMood() {
        
    }
}
