/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package World;

/**
 *
 * @author adrian
 */
public interface ISystemFacade {
    
    public boolean searchPerson(String username, String password, String personType);
    
    public Person loadPerson(String username, String personType);
    
    public boolean createUser(User user);
    
    public boolean validateUsername(String username, String userType);
    
    public boolean deleteUser(User user);
    
}
