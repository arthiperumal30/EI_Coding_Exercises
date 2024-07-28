public class SingletonPattern {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        System.out.println(configManager.getConfig());

        configManager.setConfig("Custom Config");
        System.out.println(ConfigurationManager.getInstance().getConfig());
    }
}
