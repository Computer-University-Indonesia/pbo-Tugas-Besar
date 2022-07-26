/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBesar.Kelompok4.Sosmed.Constants;


/**
 *
 * @author sahanya
 */
public class Authentication {
    private static String id;
    private static String name;
    private static String username;
    private static String role;

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Authentication.id = id;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Authentication.name = name;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Authentication.username = username;
    }

    public static String getRole() {
        return role;
    }

    public static void setRole(String role) {
        Authentication.role = role;
    }
    
}
