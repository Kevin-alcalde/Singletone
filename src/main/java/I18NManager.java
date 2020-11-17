import com.sun.javaws.jnl.ResourceVisitor;

import java.util.HashMap;
import java.util.ResourceBundle;

public class I18NManager
{
    private static I18NManager manager; /** la instancia que queremos administrar*/
    /** data */
    /** Lista de de strings  */


    HashMap<String,ResourceBundle> data;

public static I18NManager getInstance()
{  /**  Punto de entrada que permite ir  solo a esta referencia*/
    if (manager==null) manager = new I18NManager();
    return manager;
}

public String getText(String language, String key)
{
    String result = null;
    result = this.data.get(language).getString(key);
    return result;
}





private I18NManager ()
{
    this.data = new HashMap<String, ResourceBundle>();

/**ResourceBundle ca = ResourceBundle.getBundle("ca");
ResourceBundle es = ResourceBundle.getBundle("es");
ResourceBundle en = ResourceBundle.getBundle("en");
ResourceBundle it = ResourceBundle.getBundle("it"); */


ResourceBundle es = ResourceBundle.getBundle("C:\\Users\\kevin\\IdeaProjects\\Singletone\\src\\main\\resources\\es.properties");
ResourceBundle ca = ResourceBundle.getBundle("C:\\Users\\kevin\\IdeaProjects\\Singletone\\src\\main\\resources\\ca.properties");
ResourceBundle en = ResourceBundle.getBundle("C:\\Users\\kevin\\IdeaProjects\\Singletone\\src\\main\\resources\\en.properties");




this.data.put("es",es);
this.data.put("ca",ca);
this.data.put("en",en);










}

public static void main(String[] args)
{


    String msg1 =  I18NManager.getInstance().getText("ca","l2");
    String msg2 = I18NManager.getInstance().getText("es","l2");



    System.out.println(msg1);
    System.out.println(msg2);
}






}

