package csc.csc325_module_11_assignment;

public class PlugAdapter extends AmericanPlug implements SocketInfo {
    @Override
    public void plugIntoAmericanSocket() {
        plugType = "American";
    }

    @Override
    public void plugIntoEuropeanSocket() {
        plugType = "European";
    }

    @Override
    public void displayPlugSocketCompatibility() {
        System.out.println("This type of plug: " + plugType + "\n works with sockets that are " + plugType);
    }
}
