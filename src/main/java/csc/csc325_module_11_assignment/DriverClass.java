/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csc.csc325_module_11_assignment;

/**
 *
 * @author jam01
 */
public class DriverClass {

    public static void main(String[] args) {
        //creating a test object to show the default plug type
        PlugAdapter test = new PlugAdapter();
        test.displayPlugSocketCompatibility();

        //using setter methods and the adapter to switch the plug type to be compatible with European sockets
        test.plugIntoEuropeanSocket();
        test.displayPlugSocketCompatibility();
    }
}
