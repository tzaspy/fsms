package gr.stzakis.admin;



/**
 * Created by spyridon on 10/05/17.
 */
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@RequestScoped
@Named
public class AdminBean {


    public Admin getAdmin () {
        Admin admin = new Admin();

        admin.setUser_id(1);
        admin.setUsername("Spyros");
        admin.setPassword("password");

        return admin;
    }
}
