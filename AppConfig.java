public class AppConfig {

    private static final AppConfig instance = new AppConfig();
    private String theme;
    private String language;

    /* 
    public AppConfig() {
        // Load default settings
        this.theme = "Light";
        this.language = "EN";
        System.out.println("New AppConfig instance created!");
    }   
    */

    // 2. Constructor privado para evitar instancias con 'new'
    private AppConfig() {
        this.theme = "Light";
        this.language = "EN";
    }

    // 3. Método público y estático para acceder a la instancia
    public static AppConfig getInstance() {
        return instance;
    }

    // Getters y Setters
    public String getTheme() { return theme; }
    public void setTheme(String theme) { this.theme = theme; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public void printConfig() {
        System.out.println("Theme: " + theme + ", Language: " + language);
    }

}